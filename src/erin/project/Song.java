package src.erin.project;

public class Song{
    String Artist;
    String Title;
    double Duration;
    int playCount;

public Song(String Artist, String Title, double Duration, int playCount){ 
    this.Artist = Artist; 
    this.Title = Title;
    this.Duration = Duration;
    this.playCount = playCount;
}

public String getArtist() {
    return this.Artist;
}

public String getTitle() {
    return this.Title;
}

public double getDuration() {
    return this.Duration;
}

public int getPlayCount() {
    return this.playCount;
}

public String getInfo(){
    String myString = "";
    myString = myString + this.Title;
    myString = myString + this.Artist;
    myString = myString + this.Duration;
    myString = myString + this.playCount;
    return myString;
}
}