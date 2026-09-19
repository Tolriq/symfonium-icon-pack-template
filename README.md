# Symfonium Material Symbols Icon Pack

This repository is a ready-to-build Android APK for Symfonium external icon packs. It also works as a template for authors who want to publish their own pack.

The APK contains only resources and a metadata-only discovery service. Symfonium discovers it through the package manifest, reads the icon map XML, then loads mapped drawable resources when a pack is selected. One APK can expose one pack or multiple selectable packs.

## Included Packs

This project ships two full packs in the same APK. Both map every icon key currently exposed by the Symfonium external icon API (361 keys):

- `rounded` / `Material Rounded`: Material Symbols rounded, fill 0 by default. Explicit `.selected` and `.filled` state keys use filled glyphs where available.
- `rounded-filled` / `Material Rounded Filled`: Material Symbols rounded, fill 1 by default. Selected/unselected pairs intentionally use the same filled style, while explicit state pairs such as `.filled`, `.on`, and `.active` keep distinct off/on or idle/active artwork. Play/pause base keys and their `.filled` variants both use filled artwork because they identify different UI usages, not off/on states.

The generated drawables come from `@material-symbols/svg-400@0.45.5` using `rounded/*.svg` and `rounded/*-fill.svg`. Provider logos and Material symbols that are not present in that package use Symfonium's existing fallback vector paths.

All icons are single-color vector drawables because Symfonium tints icon-pack drawables at render time. Do not rely on multicolor artwork unless Symfonium explicitly adds untinted support for that surface.

## Minimal Partial Pack

You do not need to ship two packs or cover every key. A valid APK can expose a single selectable pack and only map the icons you want to override. Missing keys automatically use Symfonium's built-in icons.

```xml
<symfonium-icon-pack version="1">
    <pack id="my-pack" label="My Pack">
        <icon key="playback.play" drawable="@drawable/ic_play" />
        <icon key="action.favorite" drawable="@drawable/ic_favorite" />
    </pack>
</symfonium-icon-pack>
```

Keep the `<pack>` wrapper even when the APK exposes only one pack.

## Build

```bash
./gradlew :app:assembleDebug
```

Install the debug build on a device:

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Then open Symfonium and select a pack from:

```text
Settings > Interface > Theme, icons, fonts and colors > Icon pack
```

## Edit The Pack

Most icon-pack authors only need to edit these files:

- `app/src/main/res/drawable/ic_filled_*.xml`: Material Rounded Filled drawables.
- `app/src/main/res/drawable/ic_outline_*.xml`: Material Rounded drawables.
- `app/src/main/res/xml/symfonium_icon_pack.xml`: the mapping from Symfonium icon keys to drawables.
- `app/src/main/res/values/strings.xml`: app name and display label.
- `app/build.gradle.kts`: application id, version code, and version name.

Keys ending in `.selected` are selected tab or selected navigation state variants. Keys ending in `.filled`, `.on`, or `.active` are explicit state variants. Keep explicit state pairs separate from their base keys unless your icon style has no meaningful state distinction. The main Now Playing controls use `playback.play` and `playback.pause`; their `.filled` variants are used on other playback controls, so a filled-style pack should provide filled artwork for both.

You can remove mappings you do not want to override; Symfonium will use its built-in icon for missing keys.

## Contract Summary

The service exported for discovery must declare:

```xml
<intent-filter>
    <action android:name="app.symfonium.intent.action.ICON_PACK" />
    <category android:name="android.intent.category.DEFAULT" />
</intent-filter>

<meta-data
    android:name="app.symfonium.iconpack.MAP"
    android:resource="@xml/symfonium_icon_pack" />
```

The map XML wraps every selectable pack in a `<pack>` element:

```xml
<symfonium-icon-pack version="1">
    <pack id="rounded-filled" label="Material Rounded Filled">
        <icon key="playback.play" drawable="@drawable/ic_filled_playback_play_filled" />
    </pack>
    <pack id="rounded" label="Material Rounded">
        <icon key="playback.play" drawable="@drawable/ic_outline_playback_play" />
    </pack>
</symfonium-icon-pack>
```

Pack ids are stable ASCII identifiers using letters, numbers, dots, underscores, or hyphens. Keep them stable after publishing.

See `docs/AUTHOR_GUIDE.md` and `docs/ICON_KEYS.md` for the full author documentation.

## Release

For a release APK:

```bash
./gradlew :app:assembleRelease
```

For a Play/GitHub release bundle:

```bash
./gradlew :app:bundleRelease
```

Configure signing in your own environment before publishing. Do not commit private signing keys.

## Attribution

Material Symbols are provided by Google under the Apache License 2.0 and were imported through `@material-symbols/svg-400@0.45.5`. See `THIRD_PARTY_NOTICES.md`.
