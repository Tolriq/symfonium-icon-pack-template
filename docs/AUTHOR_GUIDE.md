# Symfonium Icon Pack Author Guide

This guide explains how to turn this repository into your own Symfonium icon pack.

## 1. Rename The APK

Edit `app/build.gradle.kts`:

```kotlin
defaultConfig {
    applicationId = "your.package.name"
    versionCode = 1
    versionName = "1.0.0"
}
```

Edit `app/src/main/res/values/strings.xml`:

```xml
<string name="app_name">Your Pack Name</string>
```

The package name must stay stable after publishing. Symfonium stores selected packs as `package.name:packId`.

## 2. Decide How Many Packs The APK Contains

One APK can contain one pack or multiple selectable packs. If you only need one style, keep a single `<pack>`; you do not need to duplicate the bundled two-pack setup. Every pack must be declared with a `<pack>` element:

```xml
<symfonium-icon-pack version="1">
    <pack id="rounded" label="Rounded">
        <icon key="playback.play" drawable="@drawable/rounded_play" />
    </pack>
    <pack id="rounded-filled" label="Rounded Filled">
        <icon key="playback.play" drawable="@drawable/rounded_filled_play" />
    </pack>
</symfonium-icon-pack>
```

For a single-pack APK, use the same shape with just one `<pack>`. Pack ids must use only letters, numbers, dots, underscores, or hyphens. Keep package names and pack ids stable after publishing so existing user selections keep working.

## 3. Replace Icons

Put icons in `app/src/main/res/drawable/`.

Recommended drawable rules:

- Use vector drawables for small, tintable icons.
- Use black paths (`#FF000000`) with transparent background. Symfonium applies tint at render time, so multicolor artwork will not stay multicolor.
- Keep icons visually centered and close to the Material icon optical size.
- Avoid embedded text in icons.
- Keep selected/filled state keys separate from their unselected/off counterparts.

PNG or WebP drawables can work too, but vector drawables are smaller and tint better.

## 4. Update The Map

Edit `app/src/main/res/xml/symfonium_icon_pack.xml`.

Only mapped keys are replaced. A pack with just a couple of `<icon>` entries is valid. If a key is missing, Symfonium uses its built-in icon.

Keys ending in `.selected` are selected tab or selected navigation state variants. Keys ending in `.filled`, `.on`, or `.active` are explicit state variants. Keep explicit state pairs separate from their base keys unless your icon style has no meaningful state distinction. A filled-style pack can still map selected/unselected navigation states to filled artwork.

Invalid keys, invalid drawables, invalid pack ids, and icons outside a `<pack>` element are ignored by Symfonium.

## 5. Build And Test

Build and install:

```bash
./gradlew :app:assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

In Symfonium:

```text
Settings > Interface > Theme, icons, fonts and colors > Icon pack
```

Select each pack and inspect the replaced surfaces. For a partial pack, verify that unmapped icons fall back to the built-in Symfonium icons.

## 6. Publish

Before publishing:

- Change `applicationId`.
- Change app name and app icon.
- Replace or remove any bundled Material Symbols assets that do not belong in your pack.
- Bump `versionCode` and `versionName`.
- Configure release signing outside git.
- Build `:app:bundleRelease` for Play distribution or `:app:assembleRelease` for direct APK release.

Do not remove the discovery service, intent filter, or the `app.symfonium.iconpack.MAP` metadata.
