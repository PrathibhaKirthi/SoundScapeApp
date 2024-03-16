/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author 35389
 */
public interface LikedPlaylistInterface {

    public boolean isEmpty();

    public int size();

    public void addSong(Song song);

    public Song removeLastLiked();
    
    public Song getLastLiked();

    public Song searchByName(String name);
    
    public void displayLikedPlaylist();
    
    public boolean removeSong(String songName);
    
    public Song findSong(String songName);
}
