package src.erin.project;
import java.util.ArrayList;

class ArrayLibrary implements Library{
    private ArrayList<Song> library;

    public String allSongs(){
        String allSongsString = "";
        for(int i=0; i < library.size; i++){
            allSongsString = allSongsString + library.get(i).getTitle();
        }
        return allSongsString;
    }

    public Double duration(){
        Double duration = 0;
        for(int i=0; i < library.size; i++){
            duration = duration + library.get(i).getDuration();
        }
        return duration;
    }

    public String playNext(){
        Song nextSong = library.get(0);
        library.remove(0);
        String songInfo = "";
        songInfo = songInfo + nextSong.getTitle() + " " + nextSong.getArtist() + " " + nextSong.getDuration() + " " + nextSong.getPlayCount();
        return songInfo;
    }

    public boolean ifEmpty(){
        return library.isEmpty();
    }

    public void addSong(Song song){
        library.add(song);
    }

    public void removeSong(Song song){
        library.remove(song);
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