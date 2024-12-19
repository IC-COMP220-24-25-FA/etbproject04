package src.erin.project;
interface Playlist {
  
    /*
     @return: string of all songs in playlists
     */
    public String allSongs();

    /*
     * @returns: total playlist duration
     */
    public Double duration();

    /*
     * @returns: info of next song and removes it from playlist
     */
    public String playNext();

    /*
     * @returns: true if playlist is empty
     */
    public boolean ifEmpty();

    /*
     * add song to playlist
     */
    public void addSong(Song song);

    /*
     * removes song from playlist
     */
    public void removeSong(Song song);
}