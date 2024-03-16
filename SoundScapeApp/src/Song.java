

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author P.Kirthi
 */


public class Song {
      
    private String song;
    private String genre;

    public Song(String song, String genre) {
        this.song = song;
        this.genre = genre;
    }
    public Song(){
        song = new String();
        genre = new String();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

 
    
    
    
}
