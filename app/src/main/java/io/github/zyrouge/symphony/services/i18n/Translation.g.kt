
package io.github.zyrouge.symphony.services.i18n

import androidx.compose.runtime.Immutable
import kotlinx.serialization.Serializable

@Suppress("ClassName", "Unused", "PropertyName", "FunctionName")
open class _Translation(private val container: _Container) {
    @Immutable
    @Serializable
    data class _Container(val locale: _Locale, val keys: _Keys)

    @Immutable
    @Serializable
    data class _Locale(
        val display: String,
        val native: String,
        val code: String,
        val direction: String,
    )

    @Immutable
    @Serializable
    data class _Keys(
        val UnknownSymbol: String,
        val HelloThere: String,
        val IntroductoryMessage: String,
        val Songs: String,
        val Artists: String,
        val Albums: String,
        val Settings: String,
        val Details: String,
        val Path: String,
        val Filename: String,
        val Size: String,
        val DateAdded: String,
        val LastModified: String,
        val Length: String,
        val Bitrate: String,
        val TrackName: String,
        val Artist: String,
        val Album: String,
        val AlbumArtist: String,
        val Composer: String,
        val NothingIsBeingPlayedRightNow: String,
        val AddToQueue: String,
        val Queue: String,
        val PlayNext: String,
        val NowPlaying: String,
        val Language_: String,
        val MaterialYou: String,
        val System: String,
        val Light: String,
        val Dark: String,
        val Black: String,
        val ViewArtist: String,
        val Title: String,
        val Duration: String,
        val Year: String,
        val ViewAlbum: String,
        val SearchYourMusic: String,
        val NoResultsFound: String,
        val AlbumCount: String,
        val TrackCount: String,
        val FilteringResults: String,
        val Appearance: String,
        val About: String,
        val Github: String,
        val Play: String,
        val Previous: String,
        val Next: String,
        val Pause: String,
        val Done: String,
        val Groove: String,
        val SongsFilterPattern: String,
        val Reset: String,
        val Theme: String,
        val CheckForUpdates: String,
        val Version: String,
        val ShufflePlay: String,
        val ViewAlbumArtist: String,
        val Stop: String,
        val All: String,
        val FadePlaybackInOut: String,
        val RequireAudioFocus: String,
        val IgnoreAudioFocusLoss: String,
        val Player: String,
        val PlayOnHeadphonesConnect: String,
        val PauseOnHeadphonesDisconnect: String,
        val Genre: String,
        val DamnThisIsSoEmpty: String,
        val PrimaryColor: String,
        val PlayAll: String,
        val ForYou: String,
        val SuggestedAlbums: String,
        val SuggestedArtists: String,
        val RecentlyAddedSongs: String,
        val ClearSongCache: String,
        val SongCacheCleared: String,
        val AlbumArtists: String,
        val Genres: String,
        val Cancel: String,
        val HomeTabs: String,
        val SelectAtleast2orAtmost5Tabs: String,
        val Folders: String,
        val Invisible: String,
        val AlwaysVisible: String,
        val VisibleWhenActive: String,
        val BottomBarLabelVisibility: String,
        val Playlists: String,
        val NewPlaylist: String,
        val ImportPlaylist: String,
        val NoInAppPlaylistsFound: String,
        val NoLocalPlaylistsFound: String,
        val Custom: String,
        val Playlist: String,
        val AddSongs: String,
        val AddToPlaylist: String,
        val IsLocalPlaylist: String,
        val Yes: String,
        val No: String,
        val ManageSongs: String,
        val Delete: String,
        val DeletePlaylist: String,
        val TrackNumber: String,
        val Tree: String,
        val Loading: String,
        val Name: String,
        val AddFolder: String,
        val BlacklistFolders: String,
        val WhitelistFolders: String,
        val PickFolder: String,
        val InvalidM3UFile: String,
        val Discord: String,
        val Reddit: String,
        val ReportAnIssue: String,
        val NoFoldersFound: String,
        val SleepTimer: String,
        val Hours: String,
        val Minutes: String,
        val QuitAppOnEnd: String,
        val Favorite: String,
        val Unfavorite: String,
        val BitDepth: String,
        val SamplingRate: String,
        val ShowAudioInformation: String,
        val FastRewindDuration: String,
        val FastForwardDuration: String,
        val SuggestedAlbumArtists: String,
        val AreYouSureThatYouWantToDeleteThisPlaylist: String,
        val RemoveFromPlaylist: String,
        val Speed: String,
        val Pitch: String,
        val PersistUntilQueueEnd: String,
        val NoLyrics: String,
        val FDroid: String,
        val IzzyOnDroid: String,
        val MiniPlayer: String,
        val ShowTrackControls: String,
        val ShowSeekControls: String,
        val Font: String,
        val Codec: String,
        val ControlsLayout: String,
        val CompactLeft: String,
        val CompactRight: String,
        val Traditional: String,
        val Enabled: String,
        val Disabled: String,
        val ShowUpdateToast: String,
        val PlaylistStoreLocation: String,
        val AppBuiltIn: String,
        val LocalStorage: String,
        val PlayingXofY: String,
        val UnknownArtistX: String,
        val XSongs: String,
        val XArtists: String,
        val XAlbums: String,
        val MadeByX: String,
        val NewVersionAvailableX: String,
        val XKbps: String,
        val XSecs: String,
        val UnknownGenreX: String,
        val XGenres: String,
        val XFoldersYFiles: String,
        val XItems: String,
        val XPlaylists: String,
        val UnknownPlaylistX: String,
        val XFolders: String,
        val XBit: String,
        val XKHz: String,
        val SystemLightDark: String,
        val SystemLightBlack: String,
        val FontScale: String,
        val ContentScale: String,
        val ViewGenre: String,
        val Interface: String,
        val Rescan: String,
        val Updates: String,
        val Help: String,
        val ShareSong: String,
        val ShareFailedX: String,
        val PauseOnCurrentSongEnd: String,
        val Export: String,
        val ExportFailedX: String,
        val ExportedX: String,
        val RenamePlaylist: String,
        val Rename: String,
        val Equalizer: String,
        val LaunchingEqualizerFailedX: String,
        val ConsiderContributing: String,
        val Lyrics: String,
        val LyricsLayout: String,
        val ReplaceArtwork: String,
        val SeparatePage: String,
        val UnknownAlbumX: String,
        val CopiedXToClipboard: String,
        val MiniPlayerTextMarquee: String,
        val AddItem: String,
        val ArtistTagValueSeparators: String,
        val GenreTagValueSeparators: String,
        val DiscNumber: String,
        val Browser: String,
        val Red: String,
        val Orange: String,
        val Amber: String,
        val Yellow: String,
        val Lime: String,
        val Green: String,
        val Emerald: String,
        val Teal: String,
        val Cyan: String,
        val Sky: String,
        val Blue: String,
        val Indigo: String,
        val Violet: String,
        val Purple: String,
        val Fuchsia: String,
        val Pink: String,
        val Rose: String,
        val MediaFolders: String,
        val Id: String,
        val DiscTotal: String,
        val Encoder: String,
        val HintAddMediaFolders: String,
        val XChannels: String,
        val VBR: String,
        val AudioChannels: String,
        val Variable: String,
        val MinimumBitrate: String,
        val MaximumBitrate: String,
        val Date: String,
        val TotalSamples: String,
        val Home: String,
        val ArtworkQuality: String,
        val Low: String,
        val Medium: String,
        val High: String,
        val Loseless: String,
        val UseMetaphonyMetadataDecoder: String,
        val PlayStore: String,
        val GaplessPlayback: String,
        val GridColumns: String,
        val CaseSensitiveSorting: String,
        val KeepScreenAwakeOnLyrics: String,
        val MinSongDurationFilter: String,
    )

    val LocaleDisplayName: String get() = container.locale.display
    val LocaleNativeName: String get() = container.locale.native
    val LocaleCode: String get() = container.locale.code
    val LocaleDirection: String get() = container.locale.direction

    val UnknownSymbol: String get() = container.keys.UnknownSymbol
    val HelloThere: String get() = container.keys.HelloThere
    val IntroductoryMessage: String get() = container.keys.IntroductoryMessage
    val Songs: String get() = container.keys.Songs
    val Artists: String get() = container.keys.Artists
    val Albums: String get() = container.keys.Albums
    val Settings: String get() = container.keys.Settings
    val Details: String get() = container.keys.Details
    val Path: String get() = container.keys.Path
    val Filename: String get() = container.keys.Filename
    val Size: String get() = container.keys.Size
    val DateAdded: String get() = container.keys.DateAdded
    val LastModified: String get() = container.keys.LastModified
    val Length: String get() = container.keys.Length
    val Bitrate: String get() = container.keys.Bitrate
    val TrackName: String get() = container.keys.TrackName
    val Artist: String get() = container.keys.Artist
    val Album: String get() = container.keys.Album
    val AlbumArtist: String get() = container.keys.AlbumArtist
    val Composer: String get() = container.keys.Composer
    val NothingIsBeingPlayedRightNow: String get() = container.keys.NothingIsBeingPlayedRightNow
    val AddToQueue: String get() = container.keys.AddToQueue
    val Queue: String get() = container.keys.Queue
    val PlayNext: String get() = container.keys.PlayNext
    val NowPlaying: String get() = container.keys.NowPlaying
    val Language_: String get() = container.keys.Language_
    val MaterialYou: String get() = container.keys.MaterialYou
    val System: String get() = container.keys.System
    val Light: String get() = container.keys.Light
    val Dark: String get() = container.keys.Dark
    val Black: String get() = container.keys.Black
    val ViewArtist: String get() = container.keys.ViewArtist
    val Title: String get() = container.keys.Title
    val Duration: String get() = container.keys.Duration
    val Year: String get() = container.keys.Year
    val ViewAlbum: String get() = container.keys.ViewAlbum
    val SearchYourMusic: String get() = container.keys.SearchYourMusic
    val NoResultsFound: String get() = container.keys.NoResultsFound
    val AlbumCount: String get() = container.keys.AlbumCount
    val TrackCount: String get() = container.keys.TrackCount
    val FilteringResults: String get() = container.keys.FilteringResults
    val Appearance: String get() = container.keys.Appearance
    val About: String get() = container.keys.About
    val Github: String get() = container.keys.Github
    val Play: String get() = container.keys.Play
    val Previous: String get() = container.keys.Previous
    val Next: String get() = container.keys.Next
    val Pause: String get() = container.keys.Pause
    val Done: String get() = container.keys.Done
    val Groove: String get() = container.keys.Groove
    val SongsFilterPattern: String get() = container.keys.SongsFilterPattern
    val Reset: String get() = container.keys.Reset
    val Theme: String get() = container.keys.Theme
    val CheckForUpdates: String get() = container.keys.CheckForUpdates
    val Version: String get() = container.keys.Version
    val ShufflePlay: String get() = container.keys.ShufflePlay
    val ViewAlbumArtist: String get() = container.keys.ViewAlbumArtist
    val Stop: String get() = container.keys.Stop
    val All: String get() = container.keys.All
    val FadePlaybackInOut: String get() = container.keys.FadePlaybackInOut
    val RequireAudioFocus: String get() = container.keys.RequireAudioFocus
    val IgnoreAudioFocusLoss: String get() = container.keys.IgnoreAudioFocusLoss
    val Player: String get() = container.keys.Player
    val PlayOnHeadphonesConnect: String get() = container.keys.PlayOnHeadphonesConnect
    val PauseOnHeadphonesDisconnect: String get() = container.keys.PauseOnHeadphonesDisconnect
    val Genre: String get() = container.keys.Genre
    val DamnThisIsSoEmpty: String get() = container.keys.DamnThisIsSoEmpty
    val PrimaryColor: String get() = container.keys.PrimaryColor
    val PlayAll: String get() = container.keys.PlayAll
    val ForYou: String get() = container.keys.ForYou
    val SuggestedAlbums: String get() = container.keys.SuggestedAlbums
    val SuggestedArtists: String get() = container.keys.SuggestedArtists
    val RecentlyAddedSongs: String get() = container.keys.RecentlyAddedSongs
    val ClearSongCache: String get() = container.keys.ClearSongCache
    val SongCacheCleared: String get() = container.keys.SongCacheCleared
    val AlbumArtists: String get() = container.keys.AlbumArtists
    val Genres: String get() = container.keys.Genres
    val Cancel: String get() = container.keys.Cancel
    val HomeTabs: String get() = container.keys.HomeTabs
    val SelectAtleast2orAtmost5Tabs: String get() = container.keys.SelectAtleast2orAtmost5Tabs
    val Folders: String get() = container.keys.Folders
    val Invisible: String get() = container.keys.Invisible
    val AlwaysVisible: String get() = container.keys.AlwaysVisible
    val VisibleWhenActive: String get() = container.keys.VisibleWhenActive
    val BottomBarLabelVisibility: String get() = container.keys.BottomBarLabelVisibility
    val Playlists: String get() = container.keys.Playlists
    val NewPlaylist: String get() = container.keys.NewPlaylist
    val ImportPlaylist: String get() = container.keys.ImportPlaylist
    val NoInAppPlaylistsFound: String get() = container.keys.NoInAppPlaylistsFound
    val NoLocalPlaylistsFound: String get() = container.keys.NoLocalPlaylistsFound
    val Custom: String get() = container.keys.Custom
    val Playlist: String get() = container.keys.Playlist
    val AddSongs: String get() = container.keys.AddSongs
    val AddToPlaylist: String get() = container.keys.AddToPlaylist
    val IsLocalPlaylist: String get() = container.keys.IsLocalPlaylist
    val Yes: String get() = container.keys.Yes
    val No: String get() = container.keys.No
    val ManageSongs: String get() = container.keys.ManageSongs
    val Delete: String get() = container.keys.Delete
    val DeletePlaylist: String get() = container.keys.DeletePlaylist
    val TrackNumber: String get() = container.keys.TrackNumber
    val Tree: String get() = container.keys.Tree
    val Loading: String get() = container.keys.Loading
    val Name: String get() = container.keys.Name
    val AddFolder: String get() = container.keys.AddFolder
    val BlacklistFolders: String get() = container.keys.BlacklistFolders
    val WhitelistFolders: String get() = container.keys.WhitelistFolders
    val PickFolder: String get() = container.keys.PickFolder
    val InvalidM3UFile: String get() = container.keys.InvalidM3UFile
    val Discord: String get() = container.keys.Discord
    val Reddit: String get() = container.keys.Reddit
    val ReportAnIssue: String get() = container.keys.ReportAnIssue
    val NoFoldersFound: String get() = container.keys.NoFoldersFound
    val SleepTimer: String get() = container.keys.SleepTimer
    val Hours: String get() = container.keys.Hours
    val Minutes: String get() = container.keys.Minutes
    val QuitAppOnEnd: String get() = container.keys.QuitAppOnEnd
    val Favorite: String get() = container.keys.Favorite
    val Unfavorite: String get() = container.keys.Unfavorite
    val BitDepth: String get() = container.keys.BitDepth
    val SamplingRate: String get() = container.keys.SamplingRate
    val ShowAudioInformation: String get() = container.keys.ShowAudioInformation
    val FastRewindDuration: String get() = container.keys.FastRewindDuration
    val FastForwardDuration: String get() = container.keys.FastForwardDuration
    val SuggestedAlbumArtists: String get() = container.keys.SuggestedAlbumArtists
    val AreYouSureThatYouWantToDeleteThisPlaylist: String get() = container.keys.AreYouSureThatYouWantToDeleteThisPlaylist
    val RemoveFromPlaylist: String get() = container.keys.RemoveFromPlaylist
    val Speed: String get() = container.keys.Speed
    val Pitch: String get() = container.keys.Pitch
    val PersistUntilQueueEnd: String get() = container.keys.PersistUntilQueueEnd
    val NoLyrics: String get() = container.keys.NoLyrics
    val FDroid: String get() = container.keys.FDroid
    val IzzyOnDroid: String get() = container.keys.IzzyOnDroid
    val MiniPlayer: String get() = container.keys.MiniPlayer
    val ShowTrackControls: String get() = container.keys.ShowTrackControls
    val ShowSeekControls: String get() = container.keys.ShowSeekControls
    val Font: String get() = container.keys.Font
    val Codec: String get() = container.keys.Codec
    val ControlsLayout: String get() = container.keys.ControlsLayout
    val CompactLeft: String get() = container.keys.CompactLeft
    val CompactRight: String get() = container.keys.CompactRight
    val Traditional: String get() = container.keys.Traditional
    val Enabled: String get() = container.keys.Enabled
    val Disabled: String get() = container.keys.Disabled
    val ShowUpdateToast: String get() = container.keys.ShowUpdateToast
    val PlaylistStoreLocation: String get() = container.keys.PlaylistStoreLocation
    val AppBuiltIn: String get() = container.keys.AppBuiltIn
    val LocalStorage: String get() = container.keys.LocalStorage
    val SystemLightDark: String get() = container.keys.SystemLightDark
    val SystemLightBlack: String get() = container.keys.SystemLightBlack
    val FontScale: String get() = container.keys.FontScale
    val ContentScale: String get() = container.keys.ContentScale
    val ViewGenre: String get() = container.keys.ViewGenre
    val Interface: String get() = container.keys.Interface
    val Rescan: String get() = container.keys.Rescan
    val Updates: String get() = container.keys.Updates
    val Help: String get() = container.keys.Help
    val ShareSong: String get() = container.keys.ShareSong
    val PauseOnCurrentSongEnd: String get() = container.keys.PauseOnCurrentSongEnd
    val Export: String get() = container.keys.Export
    val RenamePlaylist: String get() = container.keys.RenamePlaylist
    val Rename: String get() = container.keys.Rename
    val Equalizer: String get() = container.keys.Equalizer
    val ConsiderContributing: String get() = container.keys.ConsiderContributing
    val Lyrics: String get() = container.keys.Lyrics
    val LyricsLayout: String get() = container.keys.LyricsLayout
    val ReplaceArtwork: String get() = container.keys.ReplaceArtwork
    val SeparatePage: String get() = container.keys.SeparatePage
    val MiniPlayerTextMarquee: String get() = container.keys.MiniPlayerTextMarquee
    val AddItem: String get() = container.keys.AddItem
    val ArtistTagValueSeparators: String get() = container.keys.ArtistTagValueSeparators
    val GenreTagValueSeparators: String get() = container.keys.GenreTagValueSeparators
    val DiscNumber: String get() = container.keys.DiscNumber
    val Browser: String get() = container.keys.Browser
    val Red: String get() = container.keys.Red
    val Orange: String get() = container.keys.Orange
    val Amber: String get() = container.keys.Amber
    val Yellow: String get() = container.keys.Yellow
    val Lime: String get() = container.keys.Lime
    val Green: String get() = container.keys.Green
    val Emerald: String get() = container.keys.Emerald
    val Teal: String get() = container.keys.Teal
    val Cyan: String get() = container.keys.Cyan
    val Sky: String get() = container.keys.Sky
    val Blue: String get() = container.keys.Blue
    val Indigo: String get() = container.keys.Indigo
    val Violet: String get() = container.keys.Violet
    val Purple: String get() = container.keys.Purple
    val Fuchsia: String get() = container.keys.Fuchsia
    val Pink: String get() = container.keys.Pink
    val Rose: String get() = container.keys.Rose
    val MediaFolders: String get() = container.keys.MediaFolders
    val Id: String get() = container.keys.Id
    val DiscTotal: String get() = container.keys.DiscTotal
    val Encoder: String get() = container.keys.Encoder
    val HintAddMediaFolders: String get() = container.keys.HintAddMediaFolders
    val VBR: String get() = container.keys.VBR
    val AudioChannels: String get() = container.keys.AudioChannels
    val Variable: String get() = container.keys.Variable
    val MinimumBitrate: String get() = container.keys.MinimumBitrate
    val MaximumBitrate: String get() = container.keys.MaximumBitrate
    val Date: String get() = container.keys.Date
    val TotalSamples: String get() = container.keys.TotalSamples
    val Home: String get() = container.keys.Home
    val ArtworkQuality: String get() = container.keys.ArtworkQuality
    val Low: String get() = container.keys.Low
    val Medium: String get() = container.keys.Medium
    val High: String get() = container.keys.High
    val Loseless: String get() = container.keys.Loseless
    val UseMetaphonyMetadataDecoder: String get() = container.keys.UseMetaphonyMetadataDecoder
    val PlayStore: String get() = container.keys.PlayStore
    val GaplessPlayback: String get() = container.keys.GaplessPlayback
    val GridColumns: String get() = container.keys.GridColumns
    val CaseSensitiveSorting: String get() = container.keys.CaseSensitiveSorting
    val KeepScreenAwakeOnLyrics: String get() = container.keys.KeepScreenAwakeOnLyrics
    val MinSongDurationFilter: String get() = container.keys.MinSongDurationFilter

    fun PlayingXofY(x: String, y: String): String = container.keys.PlayingXofY.format(x, y)
    fun UnknownArtistX(x: String): String = container.keys.UnknownArtistX.format(x)
    fun XSongs(x: String): String = container.keys.XSongs.format(x)
    fun XArtists(x: String): String = container.keys.XArtists.format(x)
    fun XAlbums(x: String): String = container.keys.XAlbums.format(x)
    fun MadeByX(x: String): String = container.keys.MadeByX.format(x)
    fun NewVersionAvailableX(x: String): String = container.keys.NewVersionAvailableX.format(x)
    fun XKbps(x: String): String = container.keys.XKbps.format(x)
    fun XSecs(x: String): String = container.keys.XSecs.format(x)
    fun UnknownGenreX(x: String): String = container.keys.UnknownGenreX.format(x)
    fun XGenres(x: String): String = container.keys.XGenres.format(x)
    fun XFoldersYFiles(x: String, y: String): String = container.keys.XFoldersYFiles.format(x, y)
    fun XItems(x: String): String = container.keys.XItems.format(x)
    fun XPlaylists(x: String): String = container.keys.XPlaylists.format(x)
    fun UnknownPlaylistX(x: String): String = container.keys.UnknownPlaylistX.format(x)
    fun XFolders(x: String): String = container.keys.XFolders.format(x)
    fun XBit(x: String): String = container.keys.XBit.format(x)
    fun XKHz(x: String): String = container.keys.XKHz.format(x)
    fun ShareFailedX(x: String): String = container.keys.ShareFailedX.format(x)
    fun ExportFailedX(x: String): String = container.keys.ExportFailedX.format(x)
    fun ExportedX(x: String): String = container.keys.ExportedX.format(x)
    fun LaunchingEqualizerFailedX(x: String): String = container.keys.LaunchingEqualizerFailedX.format(x)
    fun UnknownAlbumX(x: String): String = container.keys.UnknownAlbumX.format(x)
    fun CopiedXToClipboard(x: String): String = container.keys.CopiedXToClipboard.format(x)
    fun XChannels(x: String): String = container.keys.XChannels.format(x)
}
    