/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author P.Kirthi
 */
public class Node {
    Song song;
    Node next;
    
    public Node(Song inSong, Node inNode){
        this.song = inSong;
        this.next = inNode;
        
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public String toString() {
        return song.toString();
    }
    
}
