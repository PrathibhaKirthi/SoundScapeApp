/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author P.Kirthi
 */
public interface GenreLinkedListInterface {
    
     public boolean isEmpty();

    public int size();

    public boolean removeSong(String songName);

    public void addSong(Song song); // no specified order to add it to the list

    public void printList(javax.swing.JTextArea textArea);
    
    public Song searchByName(String name);
    
    public Song findSong(String songName);
}
