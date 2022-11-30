package com.nicholasung.coffeedore64;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
	
	Scanner scanner = new Scanner(System.in);
	// MEMBER VARIABLES
	private static ArrayList<Item> menu;
	private ArrayList<Order> orders;
	
	// CONSTRUCTOR
	public CoffeeKiosk() {
		menu = new ArrayList<Item>();
		orders = new ArrayList<Order>();
	}
	
	// CLASS METHODS
	public void addMenuItem(String name, double price) {
		Item newItem = new Item(name, price);
		menu.add(newItem);
		newItem.setIndex(menu.indexOf(newItem));
	}
	
	public void displayMenu() {
		for(Item item : menu) {
			System.out.printf("%d %s -- $%.2f%n", item.getIndex(), item.getName(), item.getPrice());
		}
		System.out.println();
	}
	
    public void newOrder() {
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.print("Please enter customer name for new order: ");
        String name = scanner.nextLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order currentOrder = new Order(name);
        
        String itemNumber = "";
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
        	if(!itemNumber.equals("")) {
                currentOrder.addItem(Integer.parseInt(itemNumber));
        	}
            // Show the user the menu, so they can choose items to add.
        	displayMenu();
        	// Prompts the user to enter an item number
            System.out.print("Please enter a menu item index or q to quit: ");
            itemNumber = scanner.nextLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        currentOrder.display();
        
    }
    
    // GETTERS
	public static ArrayList<Item> getMenu() {
		return menu;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}
	
}
