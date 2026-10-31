# Numbered custom-slot icons

The template maps `custom.0` through `custom.9` to matching circled numerals.
Each digit uses the Rounded `counter_N.svg` and filled `counter_N-fill.svg`
Material Symbols source from the pinned package
`@material-symbols/svg-400@0.45.5`. These drawings identify the slot number in
this template; custom-slot meanings remain pack-defined.

The original SVG files are vendored in `sources/`. Their SHA-256 digests and
provenance are recorded in `sources.json`. The source URL for each file is
`https://unpkg.com/@material-symbols/svg-400@0.45.5/rounded/<filename>`.
The package source is
https://github.com/marella/material-symbols/tree/main/svg/400. Material Symbols
are provided by Google under Apache License 2.0; see the repository's
`THIRD_PARTY_NOTICES.md` and https://www.apache.org/licenses/LICENSE-2.0.

`generate.py` owns the twenty `ic_filled_custom_N.xml` and
`ic_outline_custom_N.xml` Android vectors. It preserves the source path data,
translates the original negative Y view box into the Android viewport, and
uses the template's tintable black fill at 24dp. It validates every vendored
source hash and rejects SVG structures it cannot safely convert.

From the repository root, regenerate with Python 3.11 or newer:

```bash
uv run --no-project --python '>=3.11' python tools/custom-icons/generate.py
```

Check generated files without editing them:

```bash
uv run --no-project --python '>=3.11' python tools/custom-icons/generate.py --check
```

Both commands use only the Python standard library and require no packages or
network access once Python is available. To retrieve an original source for
comparison, use its pinned URL and verify its digest against `sources.json`.
