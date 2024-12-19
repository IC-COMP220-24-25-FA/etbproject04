package src.erin.project;
//LinkedList implementation of playlist

import java.util.LinkedList;

public class DJKhaled implements Playlist {
    private LinkedList<Song> playlist;

    public DJKhaled(){
        this.playlist = new LinkedList<>();
    }

    public String allSongs(){
        String myString = "";
        for (Song song : playlist){
            myString = myString + song.getTitle();
        }
        return myString;
    }

    public Double duration(){
        double duration = 0.0;
        for (Song song : playlist){
            duration = duration + song.getDuration();
        }
        return duration;
    }

    public String playNext(){
        if (ifEmpty()){
            return "empty playlist";
        }
        Song nextSong = playlist.removeFirst();
        return nextSong.getInfo();
    }

    public boolean ifEmpty(){
        return playlist.isEmpty();
    }

    @Override
    public void addSong(Song song) {
        // TODO Auto-generated method stub
        playlist.add(song);
    }

    @Override
    public void removeSong(Song song) {
        // TODO Auto-generated method stub
        playlist.remove(song);
    }

}
