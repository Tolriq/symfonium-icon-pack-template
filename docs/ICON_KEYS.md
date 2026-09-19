# Supported Icon Keys

These are the icon keys supported by the current Symfonium external icon-pack contract.

Both bundled Material packs map every key below (361 keys). The filled pack uses `@drawable/ic_filled_*`; the rounded pack uses `@drawable/ic_outline_*`. You can delete mappings you do not want to override; Symfonium falls back to its built-in icon for missing keys.

Keys ending in `.selected` are selected tab or selected navigation state variants. Keys ending in `.filled`, `.on`, or `.active` are explicit state variants. The bundled filled pack maps selected/unselected pairs to filled artwork, but keeps explicit state pairs distinct. The `playback.play` and `playback.pause` base keys used by the main Now Playing controls share filled artwork with their `.filled` variants, which represent different UI usages rather than off/on states.

| Key | Filled drawable | Rounded drawable | Meaning |
| --- | --- | --- | --- |
| `action.add` | `@drawable/ic_filled_action_add` | `@drawable/ic_outline_action_add` | User action or command |
| `action.shortcut.add` | `@drawable/ic_filled_action_shortcut_add` | `@drawable/ic_outline_action_shortcut_add` | User action or command |
| `action.home.add` | `@drawable/ic_filled_action_home_add` | `@drawable/ic_outline_action_home_add` | User action or command |
| `action.playlist.add` | `@drawable/ic_filled_action_playlist_add` | `@drawable/ic_outline_action_playlist_add` | User action or command |
| `action.playlist.add.button` | `@drawable/ic_filled_action_playlist_add_button` | `@drawable/ic_outline_action_playlist_add_button` | User action or command |
| `action.cancel` | `@drawable/ic_filled_action_cancel` | `@drawable/ic_outline_action_cancel` | User action or command |
| `action.check` | `@drawable/ic_filled_action_check` | `@drawable/ic_outline_action_check` | User action or command |
| `action.checklist` | `@drawable/ic_filled_action_checklist` | `@drawable/ic_outline_action_checklist` | User action or command |
| `action.clear.all` | `@drawable/ic_filled_action_clear_all` | `@drawable/ic_outline_action_clear_all` | User action or command |
| `action.close` | `@drawable/ic_filled_action_close` | `@drawable/ic_outline_action_close` | User action or command |
| `action.copy` | `@drawable/ic_filled_action_copy` | `@drawable/ic_outline_action_copy` | User action or command |
| `action.delete` | `@drawable/ic_filled_action_delete` | `@drawable/ic_outline_action_delete` | User action or command |
| `action.delete.forever` | `@drawable/ic_filled_action_delete_forever` | `@drawable/ic_outline_action_delete_forever` | User action or command |
| `action.delete.missing` | `@drawable/ic_filled_action_delete_missing` | `@drawable/ic_outline_action_delete_missing` | User action or command |
| `action.delete.sweep` | `@drawable/ic_filled_action_delete_sweep` | `@drawable/ic_outline_action_delete_sweep` | User action or command |
| `action.download` | `@drawable/ic_filled_action_download` | `@drawable/ic_outline_action_download` | User action or command |
| `action.download.file` | `@drawable/ic_filled_action_download_file` | `@drawable/ic_outline_action_download_file` | User action or command |
| `action.drag.handle` | `@drawable/ic_filled_action_drag_handle` | `@drawable/ic_outline_action_drag_handle` | User action or command |
| `action.edit` | `@drawable/ic_filled_action_edit` | `@drawable/ic_outline_action_edit` | User action or command |
| `action.edit.note` | `@drawable/ic_filled_action_edit_note` | `@drawable/ic_outline_action_edit_note` | User action or command |
| `action.export` | `@drawable/ic_filled_action_export` | `@drawable/ic_outline_action_export` | User action or command |
| `action.favorite` | `@drawable/ic_filled_action_favorite` | `@drawable/ic_outline_action_favorite` | User action or command |
| `action.favorite.filled` | `@drawable/ic_filled_action_favorite_filled` | `@drawable/ic_outline_action_favorite_filled` | User action or command |
| `action.help` | `@drawable/ic_filled_action_help` | `@drawable/ic_outline_action_help` | User action or command |
| `action.hide` | `@drawable/ic_filled_action_hide` | `@drawable/ic_outline_action_hide` | User action or command |
| `action.import` | `@drawable/ic_filled_action_import` | `@drawable/ic_outline_action_import` | User action or command |
| `action.playlist.import` | `@drawable/ic_filled_action_playlist_import` | `@drawable/ic_outline_action_playlist_import` | User action or command |
| `action.info` | `@drawable/ic_filled_action_info` | `@drawable/ic_outline_action_info` | User action or command |
| `action.lock` | `@drawable/ic_filled_action_lock` | `@drawable/ic_outline_action_lock` | User action or command |
| `action.more` | `@drawable/ic_filled_action_more` | `@drawable/ic_outline_action_more` | User action or command |
| `action.more.horizontal` | `@drawable/ic_filled_action_more_horizontal` | `@drawable/ic_outline_action_more_horizontal` | User action or command |
| `action.move.down` | `@drawable/ic_filled_action_move_down` | `@drawable/ic_outline_action_move_down` | User action or command |
| `action.move.up` | `@drawable/ic_filled_action_move_up` | `@drawable/ic_outline_action_move_up` | User action or command |
| `action.details` | `@drawable/ic_filled_action_details` | `@drawable/ic_outline_action_details` | User action or command |
| `action.open.externally` | `@drawable/ic_filled_action_open_externally` | `@drawable/ic_outline_action_open_externally` | User action or command |
| `action.pin` | `@drawable/ic_filled_action_pin` | `@drawable/ic_outline_action_pin` | User action or command |
| `action.queue.add` | `@drawable/ic_filled_action_queue_add` | `@drawable/ic_outline_action_queue_add` | User action or command |
| `action.queue.next` | `@drawable/ic_filled_action_queue_next` | `@drawable/ic_outline_action_queue_next` | User action or command |
| `action.remove` | `@drawable/ic_filled_action_remove` | `@drawable/ic_outline_action_remove` | User action or command |
| `action.selection.remove` | `@drawable/ic_filled_action_selection_remove` | `@drawable/ic_outline_action_selection_remove` | User action or command |
| `action.reorder` | `@drawable/ic_filled_action_reorder` | `@drawable/ic_outline_action_reorder` | User action or command |
| `action.reset` | `@drawable/ic_filled_action_reset` | `@drawable/ic_outline_action_reset` | User action or command |
| `action.restore` | `@drawable/ic_filled_action_restore` | `@drawable/ic_outline_action_restore` | User action or command |
| `action.save` | `@drawable/ic_filled_action_save` | `@drawable/ic_outline_action_save` | User action or command |
| `action.search` | `@drawable/ic_filled_action_search` | `@drawable/ic_outline_action_search` | User action or command |
| `action.search.off` | `@drawable/ic_filled_action_search_off` | `@drawable/ic_outline_action_search_off` | User action or command |
| `action.select.all` | `@drawable/ic_filled_action_select_all` | `@drawable/ic_outline_action_select_all` | User action or command |
| `action.share` | `@drawable/ic_filled_action_share` | `@drawable/ic_outline_action_share` | User action or command |
| `action.share.file` | `@drawable/ic_filled_action_share_file` | `@drawable/ic_outline_action_share_file` | User action or command |
| `action.shuffle` | `@drawable/ic_filled_action_shuffle` | `@drawable/ic_outline_action_shuffle` | User action or command |
| `action.sort` | `@drawable/ic_filled_action_sort` | `@drawable/ic_outline_action_sort` | User action or command |
| `action.sort.alpha` | `@drawable/ic_filled_action_sort_alpha` | `@drawable/ic_outline_action_sort_alpha` | User action or command |
| `action.sort.direction.down` | `@drawable/ic_filled_action_sort_direction_down` | `@drawable/ic_outline_action_sort_direction_down` | User action or command |
| `action.sort.direction.up` | `@drawable/ic_filled_action_sort_direction_up` | `@drawable/ic_outline_action_sort_direction_up` | User action or command |
| `action.swap` | `@drawable/ic_filled_action_swap` | `@drawable/ic_outline_action_swap` | User action or command |
| `action.sync` | `@drawable/ic_filled_action_sync` | `@drawable/ic_outline_action_sync` | User action or command |
| `action.sync.disabled` | `@drawable/ic_filled_action_sync_disabled` | `@drawable/ic_outline_action_sync_disabled` | User action or command |
| `action.unlock` | `@drawable/ic_filled_action_unlock` | `@drawable/ic_outline_action_unlock` | User action or command |
| `action.upload` | `@drawable/ic_filled_action_upload` | `@drawable/ic_outline_action_upload` | User action or command |
| `action.visibility` | `@drawable/ic_filled_action_visibility` | `@drawable/ic_outline_action_visibility` | User action or command |
| `action.visibility.filled` | `@drawable/ic_filled_action_visibility_filled` | `@drawable/ic_outline_action_visibility_filled` | User action or command |
| `action.visibility.off` | `@drawable/ic_filled_action_visibility_off` | `@drawable/ic_outline_action_visibility_off` | User action or command |
| `action.visibility.off.filled` | `@drawable/ic_filled_action_visibility_off_filled` | `@drawable/ic_outline_action_visibility_off_filled` | User action or command |
| `interface.chevron.right` | `@drawable/ic_filled_interface_chevron_right` | `@drawable/ic_outline_interface_chevron_right` | Interface control or display option |
| `interface.color.fill` | `@drawable/ic_filled_interface_color_fill` | `@drawable/ic_outline_interface_color_fill` | Interface control or display option |
| `interface.color.picker` | `@drawable/ic_filled_interface_color_picker` | `@drawable/ic_outline_interface_color_picker` | Interface control or display option |
| `interface.contrast` | `@drawable/ic_filled_interface_contrast` | `@drawable/ic_outline_interface_contrast` | Interface control or display option |
| `interface.collapse.down` | `@drawable/ic_filled_interface_collapse_down` | `@drawable/ic_outline_interface_collapse_down` | Interface control or display option |
| `interface.collapse.up` | `@drawable/ic_filled_interface_collapse_up` | `@drawable/ic_outline_interface_collapse_up` | Interface control or display option |
| `interface.corner.shape` | `@drawable/ic_filled_interface_corner_shape` | `@drawable/ic_outline_interface_corner_shape` | Interface control or display option |
| `interface.crop.square` | `@drawable/ic_filled_interface_crop_square` | `@drawable/ic_outline_interface_crop_square` | Interface control or display option |
| `interface.dark.mode` | `@drawable/ic_filled_interface_dark_mode` | `@drawable/ic_outline_interface_dark_mode` | Interface control or display option |
| `interface.display.cutout` | `@drawable/ic_filled_interface_display_cutout` | `@drawable/ic_outline_interface_display_cutout` | Interface control or display option |
| `interface.dropdown` | `@drawable/ic_filled_interface_dropdown` | `@drawable/ic_outline_interface_dropdown` | Interface control or display option |
| `interface.expand` | `@drawable/ic_filled_interface_expand` | `@drawable/ic_outline_interface_expand` | Interface control or display option |
| `interface.filter` | `@drawable/ic_filled_interface_filter` | `@drawable/ic_outline_interface_filter` | Interface control or display option |
| `interface.filter.filled` | `@drawable/ic_filled_interface_filter_filled` | `@drawable/ic_outline_interface_filter_filled` | Interface control or display option |
| `interface.filter.list` | `@drawable/ic_filled_interface_filter_list` | `@drawable/ic_outline_interface_filter_list` | Interface control or display option |
| `interface.font.size` | `@drawable/ic_filled_interface_font_size` | `@drawable/ic_outline_interface_font_size` | Interface control or display option |
| `interface.gradient` | `@drawable/ic_filled_interface_gradient` | `@drawable/ic_outline_interface_gradient` | Interface control or display option |
| `interface.grid` | `@drawable/ic_filled_interface_grid` | `@drawable/ic_outline_interface_grid` | Interface control or display option |
| `interface.image.aspect.ratio` | `@drawable/ic_filled_interface_image_aspect_ratio` | `@drawable/ic_outline_interface_image_aspect_ratio` | Interface control or display option |
| `interface.light.mode` | `@drawable/ic_filled_interface_light_mode` | `@drawable/ic_outline_interface_light_mode` | Interface control or display option |
| `interface.list` | `@drawable/ic_filled_interface_list` | `@drawable/ic_outline_interface_list` | Interface control or display option |
| `interface.night.auto` | `@drawable/ic_filled_interface_night_auto` | `@drawable/ic_outline_interface_night_auto` | Interface control or display option |
| `interface.list.numbered` | `@drawable/ic_filled_interface_list_numbered` | `@drawable/ic_outline_interface_list_numbered` | Interface control or display option |
| `interface.overscan` | `@drawable/ic_filled_interface_overscan` | `@drawable/ic_outline_interface_overscan` | Interface control or display option |
| `interface.palette` | `@drawable/ic_filled_interface_palette` | `@drawable/ic_outline_interface_palette` | Interface control or display option |
| `interface.screen.rotation` | `@drawable/ic_filled_interface_screen_rotation` | `@drawable/ic_outline_interface_screen_rotation` | Interface control or display option |
| `interface.space` | `@drawable/ic_filled_interface_space` | `@drawable/ic_outline_interface_space` | Interface control or display option |
| `interface.swipe.left` | `@drawable/ic_filled_interface_swipe_left` | `@drawable/ic_outline_interface_swipe_left` | Interface control or display option |
| `interface.swipe.right` | `@drawable/ic_filled_interface_swipe_right` | `@drawable/ic_outline_interface_swipe_right` | Interface control or display option |
| `interface.swipe.up` | `@drawable/ic_filled_interface_swipe_up` | `@drawable/ic_outline_interface_swipe_up` | Interface control or display option |
| `interface.tab` | `@drawable/ic_filled_interface_tab` | `@drawable/ic_outline_interface_tab` | Interface control or display option |
| `interface.theme` | `@drawable/ic_filled_interface_theme` | `@drawable/ic_outline_interface_theme` | Interface control or display option |
| `interface.touch` | `@drawable/ic_filled_interface_touch` | `@drawable/ic_outline_interface_touch` | Interface control or display option |
| `interface.transition` | `@drawable/ic_filled_interface_transition` | `@drawable/ic_outline_interface_transition` | Interface control or display option |
| `interface.view.module` | `@drawable/ic_filled_interface_view_module` | `@drawable/ic_outline_interface_view_module` | Interface control or display option |
| `library.album.artists` | `@drawable/ic_filled_library_album_artists` | `@drawable/ic_outline_library_album_artists` | Library section, library shortcut, or selected library state |
| `library.album.artists.selected` | `@drawable/ic_filled_library_album_artists_selected` | `@drawable/ic_outline_library_album_artists_selected` | Library section, library shortcut, or selected library state |
| `library.album.artists.shortcut` | `@drawable/ic_filled_library_album_artists_shortcut` | `@drawable/ic_outline_library_album_artists_shortcut` | Library section, library shortcut, or selected library state |
| `library.album.tags` | `@drawable/ic_filled_library_album_tags` | `@drawable/ic_outline_library_album_tags` | Library section, library shortcut, or selected library state |
| `library.album.tags.selected` | `@drawable/ic_filled_library_album_tags_selected` | `@drawable/ic_outline_library_album_tags_selected` | Library section, library shortcut, or selected library state |
| `library.artist.tags` | `@drawable/ic_filled_library_artist_tags` | `@drawable/ic_outline_library_artist_tags` | Library section, library shortcut, or selected library state |
| `library.artist.tags.selected` | `@drawable/ic_filled_library_artist_tags_selected` | `@drawable/ic_outline_library_artist_tags_selected` | Library section, library shortcut, or selected library state |
| `library.albums` | `@drawable/ic_filled_library_albums` | `@drawable/ic_outline_library_albums` | Library section, library shortcut, or selected library state |
| `library.albums.selected` | `@drawable/ic_filled_library_albums_selected` | `@drawable/ic_outline_library_albums_selected` | Library section, library shortcut, or selected library state |
| `library.albums.all` | `@drawable/ic_filled_library_albums_all` | `@drawable/ic_outline_library_albums_all` | Library section, library shortcut, or selected library state |
| `library.albums.all.selected` | `@drawable/ic_filled_library_albums_all_selected` | `@drawable/ic_outline_library_albums_all_selected` | Library section, library shortcut, or selected library state |
| `library.artists` | `@drawable/ic_filled_library_artists` | `@drawable/ic_outline_library_artists` | Library section, library shortcut, or selected library state |
| `library.artists.selected` | `@drawable/ic_filled_library_artists_selected` | `@drawable/ic_outline_library_artists_selected` | Library section, library shortcut, or selected library state |
| `library.artists.shortcut` | `@drawable/ic_filled_library_artists_shortcut` | `@drawable/ic_outline_library_artists_shortcut` | Library section, library shortcut, or selected library state |
| `library.compilations` | `@drawable/ic_filled_library_compilations` | `@drawable/ic_outline_library_compilations` | Library section, library shortcut, or selected library state |
| `library.compilations.selected` | `@drawable/ic_filled_library_compilations_selected` | `@drawable/ic_outline_library_compilations_selected` | Library section, library shortcut, or selected library state |
| `library.compilation.artists` | `@drawable/ic_filled_library_compilation_artists` | `@drawable/ic_outline_library_compilation_artists` | Library section, library shortcut, or selected library state |
| `library.compilation.artists.selected` | `@drawable/ic_filled_library_compilation_artists_selected` | `@drawable/ic_outline_library_compilation_artists_selected` | Library section, library shortcut, or selected library state |
| `library.composers` | `@drawable/ic_filled_library_composers` | `@drawable/ic_outline_library_composers` | Library section, library shortcut, or selected library state |
| `library.composers.selected` | `@drawable/ic_filled_library_composers_selected` | `@drawable/ic_outline_library_composers_selected` | Library section, library shortcut, or selected library state |
| `library.countries` | `@drawable/ic_filled_library_countries` | `@drawable/ic_outline_library_countries` | Library section, library shortcut, or selected library state |
| `library.countries.selected` | `@drawable/ic_filled_library_countries_selected` | `@drawable/ic_outline_library_countries_selected` | Library section, library shortcut, or selected library state |
| `library.mix.decade` | `@drawable/ic_filled_library_mix_decade` | `@drawable/ic_outline_library_mix_decade` | Library section, library shortcut, or selected library state |
| `library.files` | `@drawable/ic_filled_library_files` | `@drawable/ic_outline_library_files` | Library section, library shortcut, or selected library state |
| `library.genres` | `@drawable/ic_filled_library_genres` | `@drawable/ic_outline_library_genres` | Library section, library shortcut, or selected library state |
| `library.genres.selected` | `@drawable/ic_filled_library_genres_selected` | `@drawable/ic_outline_library_genres_selected` | Library section, library shortcut, or selected library state |
| `library.grouping` | `@drawable/ic_filled_library_grouping` | `@drawable/ic_outline_library_grouping` | Library section, library shortcut, or selected library state |
| `library.grouping.selected` | `@drawable/ic_filled_library_grouping_selected` | `@drawable/ic_outline_library_grouping_selected` | Library section, library shortcut, or selected library state |
| `library.internet.radios` | `@drawable/ic_filled_library_internet_radios` | `@drawable/ic_outline_library_internet_radios` | Library section, library shortcut, or selected library state |
| `library.internet.radios.selected` | `@drawable/ic_filled_library_internet_radios_selected` | `@drawable/ic_outline_library_internet_radios_selected` | Library section, library shortcut, or selected library state |
| `library.labels` | `@drawable/ic_filled_library_labels` | `@drawable/ic_outline_library_labels` | Library section, library shortcut, or selected library state |
| `library.labels.selected` | `@drawable/ic_filled_library_labels_selected` | `@drawable/ic_outline_library_labels_selected` | Library section, library shortcut, or selected library state |
| `library.languages` | `@drawable/ic_filled_library_languages` | `@drawable/ic_outline_library_languages` | Library section, library shortcut, or selected library state |
| `library.languages.selected` | `@drawable/ic_filled_library_languages_selected` | `@drawable/ic_outline_library_languages_selected` | Library section, library shortcut, or selected library state |
| `library.main` | `@drawable/ic_filled_library_main` | `@drawable/ic_outline_library_main` | Library section, library shortcut, or selected library state |
| `library.media.types` | `@drawable/ic_filled_library_media_types` | `@drawable/ic_outline_library_media_types` | Library section, library shortcut, or selected library state |
| `library.media.types.selected` | `@drawable/ic_filled_library_media_types_selected` | `@drawable/ic_outline_library_media_types_selected` | Library section, library shortcut, or selected library state |
| `library.moods` | `@drawable/ic_filled_library_moods` | `@drawable/ic_outline_library_moods` | Library section, library shortcut, or selected library state |
| `library.moods.selected` | `@drawable/ic_filled_library_moods_selected` | `@drawable/ic_outline_library_moods_selected` | Library section, library shortcut, or selected library state |
| `library.occasions` | `@drawable/ic_filled_library_occasions` | `@drawable/ic_outline_library_occasions` | Library section, library shortcut, or selected library state |
| `library.occasions.selected` | `@drawable/ic_filled_library_occasions_selected` | `@drawable/ic_outline_library_occasions_selected` | Library section, library shortcut, or selected library state |
| `library.playlists` | `@drawable/ic_filled_library_playlists` | `@drawable/ic_outline_library_playlists` | Library section, library shortcut, or selected library state |
| `library.playlists.selected` | `@drawable/ic_filled_library_playlists_selected` | `@drawable/ic_outline_library_playlists_selected` | Library section, library shortcut, or selected library state |
| `library.song.tags` | `@drawable/ic_filled_library_song_tags` | `@drawable/ic_outline_library_song_tags` | Library section, library shortcut, or selected library state |
| `library.song.tags.selected` | `@drawable/ic_filled_library_song_tags_selected` | `@drawable/ic_outline_library_song_tags_selected` | Library section, library shortcut, or selected library state |
| `library.song.moods` | `@drawable/ic_filled_library_song_moods` | `@drawable/ic_outline_library_song_moods` | Library section, library shortcut, or selected library state |
| `library.song.moods.selected` | `@drawable/ic_filled_library_song_moods_selected` | `@drawable/ic_outline_library_song_moods_selected` | Library section, library shortcut, or selected library state |
| `library.song.styles` | `@drawable/ic_filled_library_song_styles` | `@drawable/ic_outline_library_song_styles` | Library section, library shortcut, or selected library state |
| `library.song.styles.selected` | `@drawable/ic_filled_library_song_styles_selected` | `@drawable/ic_outline_library_song_styles_selected` | Library section, library shortcut, or selected library state |
| `library.styles` | `@drawable/ic_filled_library_styles` | `@drawable/ic_outline_library_styles` | Library section, library shortcut, or selected library state |
| `library.styles.selected` | `@drawable/ic_filled_library_styles_selected` | `@drawable/ic_outline_library_styles_selected` | Library section, library shortcut, or selected library state |
| `library.tracks` | `@drawable/ic_filled_library_tracks` | `@drawable/ic_outline_library_tracks` | Library section, library shortcut, or selected library state |
| `library.tracks.selected` | `@drawable/ic_filled_library_tracks_selected` | `@drawable/ic_outline_library_tracks_selected` | Library section, library shortcut, or selected library state |
| `library.years` | `@drawable/ic_filled_library_years` | `@drawable/ic_outline_library_years` | Library section, library shortcut, or selected library state |
| `library.years.selected` | `@drawable/ic_filled_library_years_selected` | `@drawable/ic_outline_library_years_selected` | Library section, library shortcut, or selected library state |
| `media.album` | `@drawable/ic_filled_media_album` | `@drawable/ic_outline_media_album` | Media item type or media metadata concept |
| `media.album.filled` | `@drawable/ic_filled_media_album_filled` | `@drawable/ic_outline_media_album_filled` | Media item type or media metadata concept |
| `media.artist` | `@drawable/ic_filled_media_artist` | `@drawable/ic_outline_media_artist` | Media item type or media metadata concept |
| `media.artist.image` | `@drawable/ic_filled_media_artist_image` | `@drawable/ic_outline_media_artist_image` | Media item type or media metadata concept |
| `media.composer` | `@drawable/ic_filled_media_composer` | `@drawable/ic_outline_media_composer` | Media item type or media metadata concept |
| `media.file` | `@drawable/ic_filled_media_file` | `@drawable/ic_outline_media_file` | Media item type or media metadata concept |
| `media.file.present` | `@drawable/ic_filled_media_file_present` | `@drawable/ic_outline_media_file_present` | Media item type or media metadata concept |
| `media.folder` | `@drawable/ic_filled_media_folder` | `@drawable/ic_outline_media_folder` | Media item type or media metadata concept |
| `media.genre` | `@drawable/ic_filled_media_genre` | `@drawable/ic_outline_media_genre` | Media item type or media metadata concept |
| `media.grouping` | `@drawable/ic_filled_media_grouping` | `@drawable/ic_outline_media_grouping` | Media item type or media metadata concept |
| `media.image` | `@drawable/ic_filled_media_image` | `@drawable/ic_outline_media_image` | Media item type or media metadata concept |
| `media.internet.radio` | `@drawable/ic_filled_media_internet_radio` | `@drawable/ic_outline_media_internet_radio` | Media item type or media metadata concept |
| `media.internet.radio.filled` | `@drawable/ic_filled_media_internet_radio_filled` | `@drawable/ic_outline_media_internet_radio_filled` | Media item type or media metadata concept |
| `media.label` | `@drawable/ic_filled_media_label` | `@drawable/ic_outline_media_label` | Media item type or media metadata concept |
| `media.lyrics` | `@drawable/ic_filled_media_lyrics` | `@drawable/ic_outline_media_lyrics` | Media item type or media metadata concept |
| `media.type` | `@drawable/ic_filled_media_type` | `@drawable/ic_outline_media_type` | Media item type or media metadata concept |
| `media.mood` | `@drawable/ic_filled_media_mood` | `@drawable/ic_outline_media_mood` | Media item type or media metadata concept |
| `media.image.none` | `@drawable/ic_filled_media_image_none` | `@drawable/ic_outline_media_image_none` | Media item type or media metadata concept |
| `media.occasion` | `@drawable/ic_filled_media_occasion` | `@drawable/ic_outline_media_occasion` | Media item type or media metadata concept |
| `media.photo.filter` | `@drawable/ic_filled_media_photo_filter` | `@drawable/ic_outline_media_photo_filter` | Media item type or media metadata concept |
| `media.playlist` | `@drawable/ic_filled_media_playlist` | `@drawable/ic_outline_media_playlist` | Media item type or media metadata concept |
| `media.playlist.tag` | `@drawable/ic_filled_media_playlist_tag` | `@drawable/ic_outline_media_playlist_tag` | Media item type or media metadata concept |
| `media.metadata.tag` | `@drawable/ic_filled_media_metadata_tag` | `@drawable/ic_outline_media_metadata_tag` | Media item type or media metadata concept |
| `media.style` | `@drawable/ic_filled_media_style` | `@drawable/ic_outline_media_style` | Media item type or media metadata concept |
| `media.tag` | `@drawable/ic_filled_media_tag` | `@drawable/ic_outline_media_tag` | Media item type or media metadata concept |
| `media.track` | `@drawable/ic_filled_media_track` | `@drawable/ic_outline_media_track` | Media item type or media metadata concept |
| `media.track.filled` | `@drawable/ic_filled_media_track_filled` | `@drawable/ic_outline_media_track_filled` | Media item type or media metadata concept |
| `navigation.back` | `@drawable/ic_filled_navigation_back` | `@drawable/ic_outline_navigation_back` | Navigation tab, destination, or selected navigation state |
| `navigation.files` | `@drawable/ic_filled_navigation_files` | `@drawable/ic_outline_navigation_files` | Navigation tab, destination, or selected navigation state |
| `navigation.files.selected` | `@drawable/ic_filled_navigation_files_selected` | `@drawable/ic_outline_navigation_files_selected` | Navigation tab, destination, or selected navigation state |
| `navigation.home` | `@drawable/ic_filled_navigation_home` | `@drawable/ic_outline_navigation_home` | Navigation tab, destination, or selected navigation state |
| `navigation.home.selected` | `@drawable/ic_filled_navigation_home_selected` | `@drawable/ic_outline_navigation_home_selected` | Navigation tab, destination, or selected navigation state |
| `navigation.library` | `@drawable/ic_filled_navigation_library` | `@drawable/ic_outline_navigation_library` | Navigation tab, destination, or selected navigation state |
| `navigation.library.selected` | `@drawable/ic_filled_navigation_library_selected` | `@drawable/ic_outline_navigation_library_selected` | Navigation tab, destination, or selected navigation state |
| `navigation.now.playing` | `@drawable/ic_filled_navigation_now_playing` | `@drawable/ic_outline_navigation_now_playing` | Navigation tab, destination, or selected navigation state |
| `navigation.now.playing.selected` | `@drawable/ic_filled_navigation_now_playing_selected` | `@drawable/ic_outline_navigation_now_playing_selected` | Navigation tab, destination, or selected navigation state |
| `navigation.search` | `@drawable/ic_filled_navigation_search` | `@drawable/ic_outline_navigation_search` | Navigation tab, destination, or selected navigation state |
| `navigation.search.selected` | `@drawable/ic_filled_navigation_search_selected` | `@drawable/ic_outline_navigation_search_selected` | Navigation tab, destination, or selected navigation state |
| `navigation.settings` | `@drawable/ic_filled_navigation_settings` | `@drawable/ic_outline_navigation_settings` | Navigation tab, destination, or selected navigation state |
| `navigation.settings.selected` | `@drawable/ic_filled_navigation_settings_selected` | `@drawable/ic_outline_navigation_settings_selected` | Navigation tab, destination, or selected navigation state |
| `output.bluetooth` | `@drawable/ic_filled_output_bluetooth` | `@drawable/ic_outline_output_bluetooth` | Output device, volume, cast, or renderer state |
| `output.cast` | `@drawable/ic_filled_output_cast` | `@drawable/ic_outline_output_cast` | Output device, volume, cast, or renderer state |
| `output.cast.connected` | `@drawable/ic_filled_output_cast_connected` | `@drawable/ic_outline_output_cast_connected` | Output device, volume, cast, or renderer state |
| `output.cast.warning` | `@drawable/ic_filled_output_cast_warning` | `@drawable/ic_outline_output_cast_warning` | Output device, volume, cast, or renderer state |
| `output.devices` | `@drawable/ic_filled_output_devices` | `@drawable/ic_outline_output_devices` | Output device, volume, cast, or renderer state |
| `output.headphones` | `@drawable/ic_filled_output_headphones` | `@drawable/ic_outline_output_headphones` | Output device, volume, cast, or renderer state |
| `output.local.device` | `@drawable/ic_filled_output_local_device` | `@drawable/ic_outline_output_local_device` | Output device, volume, cast, or renderer state |
| `output.speaker` | `@drawable/ic_filled_output_speaker` | `@drawable/ic_outline_output_speaker` | Output device, volume, cast, or renderer state |
| `output.speaker.group` | `@drawable/ic_filled_output_speaker_group` | `@drawable/ic_outline_output_speaker_group` | Output device, volume, cast, or renderer state |
| `output.tv` | `@drawable/ic_filled_output_tv` | `@drawable/ic_outline_output_tv` | Output device, volume, cast, or renderer state |
| `output.usb` | `@drawable/ic_filled_output_usb` | `@drawable/ic_outline_output_usb` | Output device, volume, cast, or renderer state |
| `output.volume.down` | `@drawable/ic_filled_output_volume_down` | `@drawable/ic_outline_output_volume_down` | Output device, volume, cast, or renderer state |
| `output.volume.mute` | `@drawable/ic_filled_output_volume_mute` | `@drawable/ic_outline_output_volume_mute` | Output device, volume, cast, or renderer state |
| `output.volume.off` | `@drawable/ic_filled_output_volume_off` | `@drawable/ic_outline_output_volume_off` | Output device, volume, cast, or renderer state |
| `output.volume.up` | `@drawable/ic_filled_output_volume_up` | `@drawable/ic_outline_output_volume_up` | Output device, volume, cast, or renderer state |
| `playback.queue.add` | `@drawable/ic_filled_playback_queue_add` | `@drawable/ic_outline_playback_queue_add` | Playback control, queue, mode, or playback state |
| `playback.autoplay` | `@drawable/ic_filled_playback_autoplay` | `@drawable/ic_outline_playback_autoplay` | Playback control, queue, mode, or playback state |
| `playback.chapters` | `@drawable/ic_filled_playback_chapters` | `@drawable/ic_outline_playback_chapters` | Playback control, queue, mode, or playback state |
| `playback.equalizer` | `@drawable/ic_filled_playback_equalizer` | `@drawable/ic_outline_playback_equalizer` | Playback control, queue, mode, or playback state |
| `playback.equalizer.expert` | `@drawable/ic_filled_playback_equalizer_expert` | `@drawable/ic_outline_playback_equalizer_expert` | Playback control, queue, mode, or playback state |
| `playback.forward` | `@drawable/ic_filled_playback_forward` | `@drawable/ic_outline_playback_forward` | Playback control, queue, mode, or playback state |
| `playback.forward.media` | `@drawable/ic_filled_playback_forward_media` | `@drawable/ic_outline_playback_forward_media` | Playback control, queue, mode, or playback state |
| `playback.forward.5` | `@drawable/ic_filled_playback_forward_5` | `@drawable/ic_outline_playback_forward_5` | Playback control, queue, mode, or playback state |
| `playback.forward.10` | `@drawable/ic_filled_playback_forward_10` | `@drawable/ic_outline_playback_forward_10` | Playback control, queue, mode, or playback state |
| `playback.forward.30` | `@drawable/ic_filled_playback_forward_30` | `@drawable/ic_outline_playback_forward_30` | Playback control, queue, mode, or playback state |
| `playback.lyrics` | `@drawable/ic_filled_playback_lyrics` | `@drawable/ic_outline_playback_lyrics` | Playback control, queue, mode, or playback state |
| `playback.lyrics.filled` | `@drawable/ic_filled_playback_lyrics_filled` | `@drawable/ic_outline_playback_lyrics_filled` | Playback control, queue, mode, or playback state |
| `playback.next` | `@drawable/ic_filled_playback_next` | `@drawable/ic_outline_playback_next` | Playback control, queue, mode, or playback state |
| `playback.chapter.next` | `@drawable/ic_filled_playback_chapter_next` | `@drawable/ic_outline_playback_chapter_next` | Playback control, queue, mode, or playback state |
| `playback.pause` | `@drawable/ic_filled_playback_pause_filled` | `@drawable/ic_outline_playback_pause` | Playback control, queue, mode, or playback state |
| `playback.pause.filled` | `@drawable/ic_filled_playback_pause_filled` | `@drawable/ic_outline_playback_pause_filled` | Playback control, queue, mode, or playback state |
| `playback.personal.mix` | `@drawable/ic_filled_playback_personal_mix` | `@drawable/ic_outline_playback_personal_mix` | Playback control, queue, mode, or playback state |
| `playback.play` | `@drawable/ic_filled_playback_play_filled` | `@drawable/ic_outline_playback_play` | Playback control, queue, mode, or playback state |
| `playback.play.circle` | `@drawable/ic_filled_playback_play_circle` | `@drawable/ic_outline_playback_play_circle` | Playback control, queue, mode, or playback state |
| `playback.play.filled` | `@drawable/ic_filled_playback_play_filled` | `@drawable/ic_outline_playback_play_filled` | Playback control, queue, mode, or playback state |
| `playback.playlist.play` | `@drawable/ic_filled_playback_playlist_play` | `@drawable/ic_outline_playback_playlist_play` | Playback control, queue, mode, or playback state |
| `playback.previous` | `@drawable/ic_filled_playback_previous` | `@drawable/ic_outline_playback_previous` | Playback control, queue, mode, or playback state |
| `playback.chapter.previous` | `@drawable/ic_filled_playback_chapter_previous` | `@drawable/ic_outline_playback_chapter_previous` | Playback control, queue, mode, or playback state |
| `playback.queue` | `@drawable/ic_filled_playback_queue` | `@drawable/ic_outline_playback_queue` | Playback control, queue, mode, or playback state |
| `playback.queue.active` | `@drawable/ic_filled_playback_queue_active` | `@drawable/ic_outline_playback_queue_active` | Playback control, queue, mode, or playback state |
| `playback.queue.chevron` | `@drawable/ic_filled_playback_queue_chevron` | `@drawable/ic_outline_playback_queue_chevron` | Playback control, queue, mode, or playback state |
| `playback.queue.next` | `@drawable/ic_filled_playback_queue_next` | `@drawable/ic_outline_playback_queue_next` | Playback control, queue, mode, or playback state |
| `playback.radio.mix` | `@drawable/ic_filled_playback_radio_mix` | `@drawable/ic_outline_playback_radio_mix` | Playback control, queue, mode, or playback state |
| `playback.radio.mix.button` | `@drawable/ic_filled_playback_radio_mix_button` | `@drawable/ic_outline_playback_radio_mix_button` | Playback control, queue, mode, or playback state |
| `playback.radio.mix.filled` | `@drawable/ic_filled_playback_radio_mix_filled` | `@drawable/ic_outline_playback_radio_mix_filled` | Playback control, queue, mode, or playback state |
| `playback.resume.point.remove` | `@drawable/ic_filled_playback_resume_point_remove` | `@drawable/ic_outline_playback_resume_point_remove` | Playback control, queue, mode, or playback state |
| `playback.repeat` | `@drawable/ic_filled_playback_repeat` | `@drawable/ic_outline_playback_repeat` | Playback control, queue, mode, or playback state |
| `playback.repeat.on` | `@drawable/ic_filled_playback_repeat_on` | `@drawable/ic_outline_playback_repeat_on` | Playback control, queue, mode, or playback state |
| `playback.repeat.one` | `@drawable/ic_filled_playback_repeat_one` | `@drawable/ic_outline_playback_repeat_one` | Playback control, queue, mode, or playback state |
| `playback.repeat.one.on` | `@drawable/ic_filled_playback_repeat_one_on` | `@drawable/ic_outline_playback_repeat_one_on` | Playback control, queue, mode, or playback state |
| `playback.replay` | `@drawable/ic_filled_playback_replay` | `@drawable/ic_outline_playback_replay` | Playback control, queue, mode, or playback state |
| `playback.replay.5` | `@drawable/ic_filled_playback_replay_5` | `@drawable/ic_outline_playback_replay_5` | Playback control, queue, mode, or playback state |
| `playback.replay.10` | `@drawable/ic_filled_playback_replay_10` | `@drawable/ic_outline_playback_replay_10` | Playback control, queue, mode, or playback state |
| `playback.replay.30` | `@drawable/ic_filled_playback_replay_30` | `@drawable/ic_outline_playback_replay_30` | Playback control, queue, mode, or playback state |
| `playback.resume` | `@drawable/ic_filled_playback_resume` | `@drawable/ic_outline_playback_resume` | Playback control, queue, mode, or playback state |
| `playback.shuffle` | `@drawable/ic_filled_playback_shuffle` | `@drawable/ic_outline_playback_shuffle` | Playback control, queue, mode, or playback state |
| `playback.shuffle.on` | `@drawable/ic_filled_playback_shuffle_on` | `@drawable/ic_outline_playback_shuffle_on` | Playback control, queue, mode, or playback state |
| `playback.sleep.timer` | `@drawable/ic_filled_playback_sleep_timer` | `@drawable/ic_outline_playback_sleep_timer` | Playback control, queue, mode, or playback state |
| `playback.sleep.timer.filled` | `@drawable/ic_filled_playback_sleep_timer_filled` | `@drawable/ic_outline_playback_sleep_timer_filled` | Playback control, queue, mode, or playback state |
| `playback.smart.flow` | `@drawable/ic_filled_playback_smart_flow` | `@drawable/ic_outline_playback_smart_flow` | Playback control, queue, mode, or playback state |
| `playback.smart.flow.button` | `@drawable/ic_filled_playback_smart_flow_button` | `@drawable/ic_outline_playback_smart_flow_button` | Playback control, queue, mode, or playback state |
| `playback.speed` | `@drawable/ic_filled_playback_speed` | `@drawable/ic_outline_playback_speed` | Playback control, queue, mode, or playback state |
| `playback.stop` | `@drawable/ic_filled_playback_stop` | `@drawable/ic_outline_playback_stop` | Playback control, queue, mode, or playback state |
| `playback.current.track` | `@drawable/ic_filled_playback_current_track` | `@drawable/ic_outline_playback_current_track` | Playback control, queue, mode, or playback state |
| `provider.audiobookshelf` | `@drawable/ic_filled_provider_audiobookshelf` | `@drawable/ic_outline_provider_audiobookshelf` | Media provider, storage backend, or provider setup |
| `provider.box` | `@drawable/ic_filled_provider_box` | `@drawable/ic_outline_provider_box` | Media provider, storage backend, or provider setup |
| `provider.cloud` | `@drawable/ic_filled_provider_cloud` | `@drawable/ic_outline_provider_cloud` | Media provider, storage backend, or provider setup |
| `provider.dropbox` | `@drawable/ic_filled_provider_dropbox` | `@drawable/ic_outline_provider_dropbox` | Media provider, storage backend, or provider setup |
| `provider.emby` | `@drawable/ic_filled_provider_emby` | `@drawable/ic_outline_provider_emby` | Media provider, storage backend, or provider setup |
| `provider.google.drive` | `@drawable/ic_filled_provider_google_drive` | `@drawable/ic_outline_provider_google_drive` | Media provider, storage backend, or provider setup |
| `provider.jellyfin` | `@drawable/ic_filled_provider_jellyfin` | `@drawable/ic_outline_provider_jellyfin` | Media provider, storage backend, or provider setup |
| `provider.kodi` | `@drawable/ic_filled_provider_kodi` | `@drawable/ic_outline_provider_kodi` | Media provider, storage backend, or provider setup |
| `provider.local.device` | `@drawable/ic_filled_provider_local_device` | `@drawable/ic_outline_provider_local_device` | Media provider, storage backend, or provider setup |
| `provider.onedrive` | `@drawable/ic_filled_provider_onedrive` | `@drawable/ic_outline_provider_onedrive` | Media provider, storage backend, or provider setup |
| `provider.pcloud` | `@drawable/ic_filled_provider_pcloud` | `@drawable/ic_outline_provider_pcloud` | Media provider, storage backend, or provider setup |
| `provider.plex` | `@drawable/ic_filled_provider_plex` | `@drawable/ic_outline_provider_plex` | Media provider, storage backend, or provider setup |
| `provider.smb` | `@drawable/ic_filled_provider_smb` | `@drawable/ic_outline_provider_smb` | Media provider, storage backend, or provider setup |
| `provider.subsonic` | `@drawable/ic_filled_provider_subsonic` | `@drawable/ic_outline_provider_subsonic` | Media provider, storage backend, or provider setup |
| `provider.webdav` | `@drawable/ic_filled_provider_webdav` | `@drawable/ic_outline_provider_webdav` | Media provider, storage backend, or provider setup |
| `rating.half` | `@drawable/ic_filled_rating_half` | `@drawable/ic_outline_rating_half` | Rating or user feedback state |
| `rating.one` | `@drawable/ic_filled_rating_one` | `@drawable/ic_outline_rating_one` | Rating or user feedback state |
| `rating.sentiment.dissatisfied` | `@drawable/ic_filled_rating_sentiment_dissatisfied` | `@drawable/ic_outline_rating_sentiment_dissatisfied` | Rating or user feedback state |
| `rating.sentiment.neutral` | `@drawable/ic_filled_rating_sentiment_neutral` | `@drawable/ic_outline_rating_sentiment_neutral` | Rating or user feedback state |
| `rating.sentiment.satisfied` | `@drawable/ic_filled_rating_sentiment_satisfied` | `@drawable/ic_outline_rating_sentiment_satisfied` | Rating or user feedback state |
| `rating.star` | `@drawable/ic_filled_rating_star` | `@drawable/ic_outline_rating_star` | Rating or user feedback state |
| `rating.star.filled` | `@drawable/ic_filled_rating_star_filled` | `@drawable/ic_outline_rating_star_filled` | Rating or user feedback state |
| `rating.star.rate` | `@drawable/ic_filled_rating_star_rate` | `@drawable/ic_outline_rating_star_rate` | Rating or user feedback state |
| `rating.stars` | `@drawable/ic_filled_rating_stars` | `@drawable/ic_outline_rating_stars` | Rating or user feedback state |
| `rating.three` | `@drawable/ic_filled_rating_three` | `@drawable/ic_outline_rating_three` | Rating or user feedback state |
| `rating.two` | `@drawable/ic_filled_rating_two` | `@drawable/ic_outline_rating_two` | Rating or user feedback state |
| `settings.advanced` | `@drawable/ic_filled_settings_advanced` | `@drawable/ic_outline_settings_advanced` | Settings page, settings group, or settings action |
| `settings.auto` | `@drawable/ic_filled_settings_auto` | `@drawable/ic_outline_settings_auto` | Settings page, settings group, or settings action |
| `settings.backup` | `@drawable/ic_filled_settings_backup` | `@drawable/ic_outline_settings_backup` | Settings page, settings group, or settings action |
| `settings.cache` | `@drawable/ic_filled_settings_cache` | `@drawable/ic_outline_settings_cache` | Settings page, settings group, or settings action |
| `settings.cache.general` | `@drawable/ic_filled_settings_cache_general` | `@drawable/ic_outline_settings_cache_general` | Settings page, settings group, or settings action |
| `settings.cache.image` | `@drawable/ic_filled_settings_cache_image` | `@drawable/ic_outline_settings_cache_image` | Settings page, settings group, or settings action |
| `settings.cache.media` | `@drawable/ic_filled_settings_cache_media` | `@drawable/ic_outline_settings_cache_media` | Settings page, settings group, or settings action |
| `settings.cache.playback` | `@drawable/ic_filled_settings_cache_playback` | `@drawable/ic_outline_settings_cache_playback` | Settings page, settings group, or settings action |
| `settings.theme.custom` | `@drawable/ic_filled_settings_theme_custom` | `@drawable/ic_outline_settings_theme_custom` | Settings page, settings group, or settings action |
| `settings.donation` | `@drawable/ic_filled_settings_donation` | `@drawable/ic_outline_settings_donation` | Settings page, settings group, or settings action |
| `settings.interface` | `@drawable/ic_filled_settings_interface` | `@drawable/ic_outline_settings_interface` | Settings page, settings group, or settings action |
| `settings.interface.advanced` | `@drawable/ic_filled_settings_interface_advanced` | `@drawable/ic_outline_settings_interface_advanced` | Settings page, settings group, or settings action |
| `settings.interface.album` | `@drawable/ic_filled_settings_interface_album` | `@drawable/ic_outline_settings_interface_album` | Settings page, settings group, or settings action |
| `settings.interface.artist` | `@drawable/ic_filled_settings_interface_artist` | `@drawable/ic_outline_settings_interface_artist` | Settings page, settings group, or settings action |
| `settings.interface.home` | `@drawable/ic_filled_settings_interface_home` | `@drawable/ic_outline_settings_interface_home` | Settings page, settings group, or settings action |
| `settings.interface.library` | `@drawable/ic_filled_settings_interface_library` | `@drawable/ic_outline_settings_interface_library` | Settings page, settings group, or settings action |
| `settings.interface.media` | `@drawable/ic_filled_settings_interface_media` | `@drawable/ic_outline_settings_interface_media` | Settings page, settings group, or settings action |
| `settings.interface.navigation` | `@drawable/ic_filled_settings_interface_navigation` | `@drawable/ic_outline_settings_interface_navigation` | Settings page, settings group, or settings action |
| `settings.library` | `@drawable/ic_filled_settings_library` | `@drawable/ic_outline_settings_library` | Settings page, settings group, or settings action |
| `settings.lyrics` | `@drawable/ic_filled_settings_lyrics` | `@drawable/ic_outline_settings_lyrics` | Settings page, settings group, or settings action |
| `settings.main` | `@drawable/ic_filled_settings_main` | `@drawable/ic_outline_settings_main` | Settings page, settings group, or settings action |
| `settings.manage.files` | `@drawable/ic_filled_settings_manage_files` | `@drawable/ic_outline_settings_manage_files` | Settings page, settings group, or settings action |
| `settings.manage.providers` | `@drawable/ic_filled_settings_manage_providers` | `@drawable/ic_outline_settings_manage_providers` | Settings page, settings group, or settings action |
| `settings.manage.space` | `@drawable/ic_filled_settings_manage_space` | `@drawable/ic_outline_settings_manage_space` | Settings page, settings group, or settings action |
| `settings.now.playing` | `@drawable/ic_filled_settings_now_playing` | `@drawable/ic_outline_settings_now_playing` | Settings page, settings group, or settings action |
| `settings.output.device` | `@drawable/ic_filled_settings_output_device` | `@drawable/ic_outline_settings_output_device` | Settings page, settings group, or settings action |
| `settings.playback` | `@drawable/ic_filled_settings_playback` | `@drawable/ic_outline_settings_playback` | Settings page, settings group, or settings action |
| `settings.playback.advanced` | `@drawable/ic_filled_settings_playback_advanced` | `@drawable/ic_outline_settings_playback_advanced` | Settings page, settings group, or settings action |
| `settings.playback.automatic` | `@drawable/ic_filled_settings_playback_automatic` | `@drawable/ic_outline_settings_playback_automatic` | Settings page, settings group, or settings action |
| `settings.playback.buttons` | `@drawable/ic_filled_settings_playback_buttons` | `@drawable/ic_outline_settings_playback_buttons` | Settings page, settings group, or settings action |
| `settings.playback.decoding` | `@drawable/ic_filled_settings_playback_decoding` | `@drawable/ic_outline_settings_playback_decoding` | Settings page, settings group, or settings action |
| `settings.playback.focus` | `@drawable/ic_filled_settings_playback_focus` | `@drawable/ic_outline_settings_playback_focus` | Settings page, settings group, or settings action |
| `settings.playback.general` | `@drawable/ic_filled_settings_playback_general` | `@drawable/ic_outline_settings_playback_general` | Settings page, settings group, or settings action |
| `settings.playback.progress` | `@drawable/ic_filled_settings_playback_progress` | `@drawable/ic_outline_settings_playback_progress` | Settings page, settings group, or settings action |
| `settings.playback.session` | `@drawable/ic_filled_settings_playback_session` | `@drawable/ic_outline_settings_playback_session` | Settings page, settings group, or settings action |
| `settings.playback.transitions` | `@drawable/ic_filled_settings_playback_transitions` | `@drawable/ic_outline_settings_playback_transitions` | Settings page, settings group, or settings action |
| `settings.restore.default` | `@drawable/ic_filled_settings_restore_default` | `@drawable/ic_outline_settings_restore_default` | Settings page, settings group, or settings action |
| `settings.sync.manager` | `@drawable/ic_filled_settings_sync_manager` | `@drawable/ic_outline_settings_sync_manager` | Settings page, settings group, or settings action |
| `settings.theme` | `@drawable/ic_filled_settings_theme` | `@drawable/ic_outline_settings_theme` | Settings page, settings group, or settings action |
| `settings.theme.import` | `@drawable/ic_filled_settings_theme_import` | `@drawable/ic_outline_settings_theme_import` | Settings page, settings group, or settings action |
| `settings.translation` | `@drawable/ic_filled_settings_translation` | `@drawable/ic_outline_settings_translation` | Settings page, settings group, or settings action |
| `settings.widgets` | `@drawable/ic_filled_settings_widgets` | `@drawable/ic_outline_settings_widgets` | Settings page, settings group, or settings action |
| `status.check.circle` | `@drawable/ic_filled_status_check_circle` | `@drawable/ic_outline_status_check_circle` | Status, warning, or availability state |
| `status.download.done` | `@drawable/ic_filled_status_download_done` | `@drawable/ic_outline_status_download_done` | Status, warning, or availability state |
| `status.downloading` | `@drawable/ic_filled_status_downloading` | `@drawable/ic_outline_status_downloading` | Status, warning, or availability state |
| `status.error` | `@drawable/ic_filled_status_error` | `@drawable/ic_outline_status_error` | Status, warning, or availability state |
| `status.favorite.filled` | `@drawable/ic_filled_status_favorite_filled` | `@drawable/ic_outline_status_favorite_filled` | Status, warning, or availability state |
| `status.network.unavailable` | `@drawable/ic_filled_status_network_unavailable` | `@drawable/ic_outline_status_network_unavailable` | Status, warning, or availability state |
| `status.offline.available` | `@drawable/ic_filled_status_offline_available` | `@drawable/ic_outline_status_offline_available` | Status, warning, or availability state |
| `status.offline.download` | `@drawable/ic_filled_status_offline_download` | `@drawable/ic_outline_status_offline_download` | Status, warning, or availability state |
| `status.offline.missing` | `@drawable/ic_filled_status_offline_missing` | `@drawable/ic_outline_status_offline_missing` | Status, warning, or availability state |
| `status.offline.sync` | `@drawable/ic_filled_status_offline_sync` | `@drawable/ic_outline_status_offline_sync` | Status, warning, or availability state |
| `status.unselected` | `@drawable/ic_filled_status_unselected` | `@drawable/ic_outline_status_unselected` | Status, warning, or availability state |
| `status.warning` | `@drawable/ic_filled_status_warning` | `@drawable/ic_outline_status_warning` | Status, warning, or availability state |
| `system.adb` | `@drawable/ic_filled_system_adb` | `@drawable/ic_outline_system_adb` | System, device, support, or platform concept |
| `system.android` | `@drawable/ic_filled_system_android` | `@drawable/ic_outline_system_android` | System, device, support, or platform concept |
| `system.architecture` | `@drawable/ic_filled_system_architecture` | `@drawable/ic_outline_system_architecture` | System, device, support, or platform concept |
| `system.bug.report` | `@drawable/ic_filled_system_bug_report` | `@drawable/ic_outline_system_bug_report` | System, device, support, or platform concept |
| `system.contact.support` | `@drawable/ic_filled_system_contact_support` | `@drawable/ic_outline_system_contact_support` | System, device, support, or platform concept |
| `system.credit.card` | `@drawable/ic_filled_system_credit_card` | `@drawable/ic_outline_system_credit_card` | System, device, support, or platform concept |
| `system.face` | `@drawable/ic_filled_system_face` | `@drawable/ic_outline_system_face` | System, device, support, or platform concept |
| `system.feed` | `@drawable/ic_filled_system_feed` | `@drawable/ic_outline_system_feed` | System, device, support, or platform concept |
| `system.forum` | `@drawable/ic_filled_system_forum` | `@drawable/ic_outline_system_forum` | System, device, support, or platform concept |
| `system.high.quality` | `@drawable/ic_filled_system_high_quality` | `@drawable/ic_outline_system_high_quality` | System, device, support, or platform concept |
| `system.insights` | `@drawable/ic_filled_system_insights` | `@drawable/ic_outline_system_insights` | System, device, support, or platform concept |
| `system.live.help` | `@drawable/ic_filled_system_live_help` | `@drawable/ic_outline_system_live_help` | System, device, support, or platform concept |
| `system.leaderboard` | `@drawable/ic_filled_system_leaderboard` | `@drawable/ic_outline_system_leaderboard` | System, device, support, or platform concept |
| `system.mail` | `@drawable/ic_filled_system_mail` | `@drawable/ic_outline_system_mail` | System, device, support, or platform concept |
| `system.network` | `@drawable/ic_filled_system_network` | `@drawable/ic_outline_system_network` | System, device, support, or platform concept |
| `system.public` | `@drawable/ic_filled_system_public` | `@drawable/ic_outline_system_public` | System, device, support, or platform concept |
| `system.question` | `@drawable/ic_filled_system_question` | `@drawable/ic_outline_system_question` | System, device, support, or platform concept |
| `system.security` | `@drawable/ic_filled_system_security` | `@drawable/ic_outline_system_security` | System, device, support, or platform concept |
| `system.shield` | `@drawable/ic_filled_system_shield` | `@drawable/ic_outline_system_shield` | System, device, support, or platform concept |
| `system.signal` | `@drawable/ic_filled_system_signal` | `@drawable/ic_outline_system_signal` | System, device, support, or platform concept |
| `system.support.agent` | `@drawable/ic_filled_system_support_agent` | `@drawable/ic_outline_system_support_agent` | System, device, support, or platform concept |
| `system.toast` | `@drawable/ic_filled_system_toast` | `@drawable/ic_outline_system_toast` | System, device, support, or platform concept |
| `system.wifi` | `@drawable/ic_filled_system_wifi` | `@drawable/ic_outline_system_wifi` | System, device, support, or platform concept |
| `system.wifi.signal` | `@drawable/ic_filled_system_wifi_signal` | `@drawable/ic_outline_system_wifi_signal` | System, device, support, or platform concept |
