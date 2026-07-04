# Release Checklist

Use this checklist before publishing an icon pack.

1. Set a unique `applicationId` in `app/build.gradle.kts`.
2. Set the user-visible app name in `app/src/main/res/values/strings.xml`.
3. Choose stable `<pack id="...">` entries for every pack in the APK.
4. Replace `@drawable/ic_pack_launcher` if you are publishing a different pack.
5. Replace, remove, or verify every mapped `ic_filled_*` and `ic_outline_*` drawable.
6. Keep `.selected` and `.filled` state keys distinct from their unselected/off counterparts when your style supports state-specific icons; fully filled packs can map both states to filled artwork.
7. Remove any mappings you do not want to override.
8. Run `./gradlew :app:assembleDebug` and install the APK.
9. Test every published pack in Symfonium.
10. Bump `versionCode` and `versionName`.
11. Configure release signing outside this repository.
12. Run `./gradlew :app:bundleRelease` or `./gradlew :app:assembleRelease`.
13. Keep third-party attribution up to date if you ship generated or imported icon assets.

Keep the discovery metadata unchanged:

```xml
<meta-data
    android:name="app.symfonium.iconpack.MAP"
    android:resource="@xml/symfonium_icon_pack" />
```

Keep the APK package name and any published pack ids stable after release; Symfonium uses them to remember the selected pack.
