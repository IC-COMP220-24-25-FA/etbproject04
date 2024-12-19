package src.erin.project;
interface Library{
    /*
     * string of all songs in library in alphabetical order
     */
    public String allSongs();

    /*
     * @returns: information about a song in the library
     */
    public String songInfo();
    /*
     * imports a collection of songs
     */
    public void importSongs();

    /*
     * removes a collection of songs from the library and from any playlist they are in
     */
    public void removeSongs();
}
