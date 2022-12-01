package com.nicholasung.singlyLinkedList;

public class Node {
    // MEMBER VARIABLES
	public int value;
    public Node next;
    
    // CONSTRUCTOR
    public Node(int value) {
        this.value = value;
        next = null;
    }
}