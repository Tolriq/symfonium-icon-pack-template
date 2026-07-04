# Symfonium Icon Pack Sample

This repository is a ready-to-edit Android APK template for Symfonium external icon packs.

The APK contains only resources and a metadata-only discovery service. Symfonium discovers it through the package manifest, reads the icon map XML, then loads mapped drawable resources when a pack is selected. One APK can expose one pack or multiple selectable packs.

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
Settings > Interface > Theme > Icon pack
```

## Edit The Pack

Most icon-pack authors only need to edit these files:

- `app/src/main/res/drawable/ic_filled_*.xml`: the filled sample drawables.
- `app/src/main/res/drawable/ic_outline_*.xml`: the outline sample drawables.
- `app/src/main/res/xml/symfonium_icon_pack.xml`: the mapping from Symfonium icon keys to drawables.
- `app/src/main/res/values/strings.xml`: app name and display label.
- `app/build.gradle.kts`: application id, version code, and version name.

The sample contains two full packs in the same APK. Both map every icon key currently exposed by the Symfonium external icon API (361 keys):

- `filled` / `Filled`: every key uses the same single-color filled diamond.
- `outline` / `Outline`: every key uses the same single-color outline diamond.

Keys ending in `.selected` are selected tab or selected navigation state variants; keep them separate from the corresponding unselected keys when your style supports distinct states.

The sample icons are deliberately single-color because Symfonium tints icon-pack drawables at render time. You can remove mappings you do not want to override; Symfonium will use its built-in icon for missing keys.

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
    <pack id="filled" label="Filled">
        <icon key="playback.play" drawable="@drawable/ic_filled_playback_play" />
    </pack>
    <pack id="outline" label="Outline">
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
