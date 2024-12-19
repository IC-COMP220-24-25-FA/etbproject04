package src.erin.project;
interface playlistCollection {

    /*
     * String of all playlist names and durations in collection
     */
    public String allPlaylistsInCollection();

    /*
     * String of all songs from one chosen playlist
     */
    public String onePlaylist();

    /*
     * removes playlist
     */
    public void removePlaylist();

    /*
     * adds new empty playlist
     */
    public void addPlaylist();

    /*
     * creates random playlist of a specified duration
     */
    public void randomPlaylist();

    /*
     * removes a song from all playlists
     */
    public void removeSong();
}