/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author P.Kirthi
 */

public class GenreLinkedList implements GenreLinkedListInterface {

    private Node head;
    private int size;
    private Node cNode; //current node
    private Node pNode; //previous node
    private boolean repeat; //this is a boolean used for repeating a playlist

    //constructor
    public GenreLinkedList() {
        head = null;
        size = 0;
        cNode = null;
        pNode = null;
        repeat = false; //repeat is set to false, by default.
    }

    //to check if the linked list is empty
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }

    //to check the size of the list
    @Override
    public int size() {
        return size;
    }

    //adding an element to the end of the list 
    @Override
    public void addSong(Song song) {
        Node newNode = new Node(song, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            cNode.setNext(newNode);
        }
        size = size + 1;  
    }

    //this method is used for removing a song from the list.
    //here as the user input will be a string we are checking for that.
    //and if current node is not null, the song will be deleted.
    @Override
    public boolean removeSong(String songName) {

        cNode = head;
        pNode = null;
        while (cNode != null) {
            if (cNode.song.getSong().equalsIgnoreCase(songName)) {
                // Remove the current node
                if (pNode == null) {
                    head = cNode.next;
                } else {
                    pNode.next = cNode.next;
                }
                size--; // Decrease the size
                return true;
            }
            pNode = cNode;
            cNode = cNode.next;
        }
        return false;
    }

    //this is used to set the current and previous node indexes.
    private void setCurrent(int index) {
        // sets curNode to the node at position specified by index
        // sets prevNode to the node previous to curNode
        int iCount;
        pNode = null;
        cNode = head;
        for (iCount = 1; iCount < index; iCount++) {
            pNode = cNode;
            cNode = cNode.getNext();
        }
    }

    // prints out the content of the list 
    @Override
    public void printList(javax.swing.JTextArea SongTADisplay) {
        Node aNode = head;
        while (aNode != null) {
            //System.out.println(aNode.toString());
            SongTADisplay.append(".  "+aNode.getSong().getSong() + " and genre is: " + aNode.getSong().getGenre());
            aNode = aNode.getNext();
        }
        System.out.println();
    }

    //this is used for searching for a song, by asking the user to enter the name.
    //if the song is found it will return the current node and the song else returns null
    @Override
    public Song searchByName(String name) {
        cNode = head;
        while (cNode != null) {
            if (cNode.song.getSong().equalsIgnoreCase(name)) {
                return cNode.song;
            }
            cNode = cNode.getNext();
        }
        return null; 
    }

    
    //this is used to move a song from one playlist to another
    @Override
    public Song findSong(String songName) {
        cNode = head;
        while (cNode != null) {
            if (cNode.song.getSong().equalsIgnoreCase(songName)) {
                return cNode.getSong();
            }
            cNode = cNode.getNext();
        }
        return null;

    }
    
    //setter and getter for  the boolean repeat
    public boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
    
}
