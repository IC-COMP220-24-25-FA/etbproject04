package src.erin.project;
import java.util.ArrayList;

class ArrayPlaylistCollection implements playlistCollection{
    private ArrayList<Song> playlistCollection;

    public String allPlaylistsInCollection(){
        String allPlaylistsString = "";
        for (int i=0; i < playlistCollection.size; i++){
            allPlaylistsString = allPlaylistsString + playlistCollection.get(i).allSongs();
        }
        return allPlaylistsString;
    }

    public String onePlaylist(){

    }

    public void addPlaylist(){

    }

    public void randomPlaylist(){

    }

    public void removeSong(){
        
    }

    @Override
    public void removePlaylist() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePlaylist'");
    }
}