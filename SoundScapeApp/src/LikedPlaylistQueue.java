/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author P.Kirthi
 */
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class LikedPlaylistQueue implements LikedPlaylistInterface {

    // declare and create the queue
    private Queue<Song> likedSongs;
    private boolean repeat;  // this is being used so that a user can repeat a playlist
    
    public LikedPlaylistQueue() {
        likedSongs = new LinkedList<>();
        repeat = false; // it will be set to false by default

    }
    
    
    //enqueue/add song 

    @Override
    public void addSong(Song song) {
        likedSongs.offer(song);
    }

    //check if the playlist is empty
    @Override
    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    // return the size of the queue
    @Override
    public int size() {
        return likedSongs.size();
    }

    //getting the last liked song
    @Override
    public Song getLastLiked() {
        return likedSongs.peek();
    }

    //dequeue and remove the last song that was added.
    @Override
    public Song removeLastLiked() {
        return likedSongs.poll();
    }

    //this is to search for a song, when users enters the name of the song. 
    //It checks in the queue and if present, it will return the song.
    @Override
    public Song searchByName(String name) {
        for (int i = 0; i < likedSongs.size(); i++) {
            Song song = ((LinkedList<Song>) likedSongs).get(i);
            if (song.getSong().equalsIgnoreCase(name)) {
                return song;
            }
        }
        return null; // Song not found
    }

    //this is to display the songs in the liked playlist
    @Override
    public void displayLikedPlaylist() {
        // Create a temporary queue to dequeue elements without modifying the original queue
        Queue<Song> tempQueue = new LinkedList<>(likedSongs);

        // Display the contents of the queue
        while (!tempQueue.isEmpty()) {
            Song song = tempQueue.poll();
            System.out.println(song.getSong() + " - " + song.getGenre());
        }
        System.out.println();
    }
    
    //this is to remove a song from the list
    // and Iterator is used here
    @Override
    public boolean removeSong(String songName) {
        Iterator<Song> iterator = likedSongs.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getSong().equalsIgnoreCase(songName)) {
                iterator.remove(); // Remove the song from the queue
                return true;
            }
        }
        return false;
    }
    
    //this is used for finding a song and then moving it to another playlist
    @Override
     public Song findSong(String songName) {
        for (int i = 0; i < likedSongs.size(); i++) {
            Song song = ((LinkedList<Song>) likedSongs).get(i);
            if (song.getSong().equalsIgnoreCase(songName)) {
                return song;
            }
        }
        // Song not found
        return null;
    }

    public boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
     
     
}


