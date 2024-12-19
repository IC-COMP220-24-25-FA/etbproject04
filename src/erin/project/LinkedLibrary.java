package src.erin.project;

import java.util.Collections;
import java.util.LinkedList;

class LinkedLibrary implements Library{
    private LinkedList<Song> library;

    public LinkedLibrary(){
        this.library = new LinkedList<>();
    }

    public String allSongs(){
        LinkedList<String> songs = new LinkedList<>();
        for (Song song : library){
            String mySong = song.getTitle();
            songs.add(mySong);
        }
        Collections.sort(songs);
        String mySongs = "";
        for (String title : songs){
            mySongs = mySongs + title;
        }
        return mySongs;
    }

    public Double duration(){

    }

    public String playNext(){

    }

    public boolean ifEmpty(){

    }

    public void addSong(Song song){

    }

    public void removeSong(Song song){
        
    }

    @Override
    public String songInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'songInfo'");
    }

    @Override
    public void importSongs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'importSongs'");
    }

    @Override
    public void removeSongs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeSongs'");
    }
}