# Symfonium Material Symbols Icon Pack

This repository is a ready-to-build Android APK for Symfonium external icon packs. It also works as a template for authors who want to publish their own pack.

The APK contains only resources and a metadata-only discovery service. Symfonium discovers it through the package manifest, reads the icon map XML, then loads mapped drawable resources when a pack is selected. One APK can expose one pack or multiple selectable packs.

## Included Packs

This project ships two full packs in the same APK. Both map every icon key currently exposed by the Symfonium external icon API (409 keys):

- `rounded` / `Material Rounded`: Material Symbols rounded, fill 0 by default. Explicit `.selected` and `.filled` state keys use filled glyphs where available.
- `rounded-filled` / `Material Rounded Filled`: Material Symbols rounded, fill 1 by default. Selected/unselected pairs intentionally use the same filled style, while explicit state pairs such as `.filled`, `.on`, and `.active` keep distinct off/on or idle/active artwork. Play/pause base keys and their `.filled` variants both use filled artwork because they identify different UI usages, not off/on states.

The generated drawables come from `@material-symbols/svg-400@0.45.5` using `rounded/*.svg` and `rounded/*-fill.svg`. Provider logos and Material symbols that are not present in that package use Symfonium's existing fallback vector paths.

The sample packs follow the app's current semantic glyph choices, including Sensors for Radio Mix and AutoAwesome for Smart Flow. Smart Flow uses outline artwork for its inactive and button keys and filled artwork for its active `.filled` key in both packs, so its state stays distinguishable. Other style differences are intentional: the filled pack uses filled glyphs by default, selected navigation keys use filled glyphs in both packs, and the display-cutout setting uses a solid circle in both packs.

All icons are single-color vector drawables because Symfonium tints icon-pack drawables at render time. Do not rely on multicolor artwork unless Symfonium explicitly adds untinted support for that surface.

## Minimal Partial Pack

You do not need to ship two packs or cover every key. A valid APK can expose a single selectable pack and only map the icons you want to override. Missing semantic keys automatically use Symfonium's built-in icons. The optional custom slots described below have no built-in icon and remain absent when unmapped.

```xml
<symfonium-icon-pack version="1">
    <pack id="my-pack" label="My Pack">
        <icon key="playback.play" drawable="@drawable/ic_play" />
        <icon key="action.favorite" drawable="@drawable/ic_favorite" />
    </pack>
</symfonium-icon-pack>
```

Keep the `<pack>` wrapper even when the APK exposes only one pack.

## Optional Custom Icons

Symfonium reserves exactly ten generic slots: `custom.0`, `custom.1`, `custom.2`, `custom.3`, `custom.4`, `custom.5`, `custom.6`, `custom.7`, `custom.8`, and `custom.9`. Their labels are Custom icon 0 through Custom icon 9. The pack author defines each slot's meaning; slot numbers do not imply quality levels or any other fixed meaning. The bundled packs draw each slot as its matching numeral, 0 through 9. You can replace or remove these default mappings.

The numeral vectors are generated from pinned Material Symbols sources. See [tools/custom-icons](tools/custom-icons/README.md) to regenerate or check them offline.

A pack may map any subset of these slots, including a pack containing only custom icons:

```xml
<symfonium-icon-pack version="1">
    <pack id="quality" label="My Quality Icons">
        <icon key="custom.0" drawable="@drawable/ic_custom_0" />
        <icon key="custom.9" drawable="@drawable/ic_custom_9" />
    </pack>
</symfonium-icon-pack>
```

Use `%icon:custom.0%` through `%icon:custom.9%` in rich custom strings. Existing conditions, inline size, and tint apply. For a pack that defines slot 0 as its high-resolution lossless indicator, a custom string can use `{%icon:custom.0|quality.hires.lossless=="true"%}`. See `docs/AUTHOR_GUIDE.md` for optional-block examples and testing.

Without a selected pack or a mapping for a slot, the placeholder contributes no icon or space, does not enable an optional curly block, and does not add a joined-line separator. A mapped icon uses a transparent fallback while loading or if drawing fails. Other semantic icons retain their built-in fallbacks.

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

You can remove mappings you do not want to override; Symfonium uses its built-in icon for missing semantic keys and hides missing custom slots.

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

Configure signing in your own environment before publishing. Do not commit private signing keys.

**Keep a secure backup of your release keystore and its password. Do not lose either.** Every update must be signed with the same key so users can update an installed pack and you can upload updates to your existing icon pack on the Symfonium customization site. Losing the keystore or its password prevents you from signing compatible updates.

[Symfonium Customizations](https://styles.symfonium.app/) is the preferred way to distribute icon packs. Upload your signed release APK there to share your pack and publish future updates.

## Attribution

Material Symbols are provided by Google under the Apache License 2.0 and were imported through `@material-symbols/svg-400@0.45.5`. See `THIRD_PARTY_NOTICES.md`.
