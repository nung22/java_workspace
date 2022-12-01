package com.nicholasung.singlyLinkedList;

public class SinglyLinkedList {
    // MEMBER VARIABLES
	public Node head;
    
    // CONSTRUCTOR
    public SinglyLinkedList() {
        head = null;
    }
    // SLL METHODS
    
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data to be added to the new node.
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    
    /**
     * Checks if this list is empty.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {boolean} Whether or not this list is empty.
     */
    public boolean isEmpty() {
    	if(this.head == null) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * Removes the last node of this list.
     * - Time: (?).
     * - Space: (?).
     */
    public void remove() {
    	// Check if SLL is empty
    	if(isEmpty()) {
    		System.out.println("SLL is empty.");
    	} 
    	// Check if SLL has only 1 node
    	else if(this.head.next == null) {
    		this.head = null;
    	} else {
	    	// Create a runner to traverse SLL
	    	Node runner = this.head;
	    	// Iterate through SLL until reaching last node
	    	while(runner.next.next != null) {
	    		runner = runner.next;
	    	}
	    	runner.next = null;
	    }
    }
    
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    public void printValues() {
    	// Check if SLL is empty
    	if(isEmpty()) {
    		System.out.println("SLL is empty.");
    		return;
    	} 
        // SLL is not empty
        Node runner = this.head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    
    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    public Node find(int val) {
        // SLL IS EMPTY
        if(isEmpty()){
        	System.out.println("SLL is empty.");
            return null;
        }
        // CREATE A RUNNER AT THE HEAD
        Node runner = this.head;
        // HAVE THE RUNNER GO THROUGH THE SLL
        while(runner != null) {
            // CHECK TO SEE IF THE RUNNER VALUE MATCHES THE TARGET
            if(runner.value == val) {
                // RETURN TRUE IF THE VALUE MATCHES THE TARGET
                return runner;
            }
            // GO TO THE NEXT NODE
            runner = runner.next;
        }
        // RETURN FALSE IF THE RUNNER GOES OUT OF BOUNDS
        return null;
    }
    
    /**
     * Removes the nth node of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The index at which to remove a node.
     */
    public void removeAt(int val) {
    	// Check if SLL is empty
    	if(isEmpty()) {
    		System.out.println("SLL is empty.");
    	}
    	// Check if val is 0
    	else if (val == 0) {
    		this.head = this.head.next;
    	} else {
	    	// Create a runner to traverse SLL
	    	Node runner = this.head;
	    	// Iterate through SLL until reaching desired index
	    	for(int i = 0; i < val-1; i++) {
	    		runner = runner.next;
	    	}
	    	runner.next = runner.next.next;
	    }
    }
}
