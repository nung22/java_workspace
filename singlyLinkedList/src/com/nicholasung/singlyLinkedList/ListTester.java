package com.nicholasung.singlyLinkedList;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        System.out.println("---------- Add Test ----------");
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        
        System.out.println("\n---------- Remove Test ----------");
        sll.remove();
        sll.remove();
        sll.printValues();
        
        System.out.println("\n---------- Find Test ----------");
        int target = 10;
        System.out.printf("Target Value: %d %nNode Address: %s%n", target, sll.find(target));
        
        System.out.println("\n---------- RemoveAt Test ----------");
        sll.removeAt(1);
        sll.printValues();
    }
}
