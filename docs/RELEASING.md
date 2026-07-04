# Release Checklist

Use this checklist before publishing a real icon pack.

1. Set a unique `applicationId` in `app/build.gradle.kts`.
2. Set the user-visible app name in `app/src/main/res/values/strings.xml`.
3. Choose stable `<pack id="...">` entries for every pack in the APK.
4. Replace `@drawable/ic_pack_launcher`.
5. Replace the sample `ic_filled_*` and `ic_outline_*` drawables.
6. Remove any mappings you do not want to override.
7. Run `./gradlew :app:assembleDebug` and install the APK.
8. Test every published pack in Symfonium.
9. Bump `versionCode` and `versionName`.
10. Configure release signing outside this repository.
11. Run `./gradlew :app:bundleRelease` or `./gradlew :app:assembleRelease`.

Keep the discovery metadata unchanged:

```xml
<meta-data
    android:name="app.symfonium.iconpack.MAP"
    android:resource="@xml/symfonium_icon_pack" />
```

Keep the APK package name and any published pack ids stable after release; Symfonium uses them to remember the selected pack.
