package src.erin.project;
import java.util.ArrayList;

class Grimes implements Playlist {
    private ArrayList<Song> playlist;

    public Grimes(){
        this.playlist = new ArrayList<>();
    }

    public String allSongs(){
        String allSongsString = "";
        for(Song song : playlist){
            allSongsString = allSongsString + song.getTitle();
        }
        return allSongsString;
    }

    public Double duration(){
        Double total = 0.0;
        for(int i = 0; i < playlist.size(); i++){
            total += playlist.get(i).getDuration();
        }
        return total;
    }

    public String playNext(){
        if (ifEmpty()){
            return "empty playlist";
        }
        Song nextSong = playlist.remove(0);
        return nextSong.getInfo();
    }

    public boolean ifEmpty(){
        return playlist.isEmpty();

    }

    public void addSong(Song song){
        playlist.add(song);

    }

    public void removeSong(Song song){
        playlist.remove(song);

    }
}