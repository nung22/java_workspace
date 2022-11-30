package com.nicholasung.baristaChallenge;

public class TestOrders {

	public static void main(String[] args) {
		// Create items for menu
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("drip coffee", 2.50);
        Item item3 = new Item("latte", 3.30);
        Item item4 = new Item("cappuccino", 3.40);
        
		// Create 2 orders for unspecified guests (without specifying a name).
		Order order1 = new Order();
		Order order2 = new Order();
		
		// Create 3 orders using the overloaded constructor to give each a name for the order.
		Order order3 = new Order("Michael");
		Order order4 = new Order("Dwight");
		Order order5 = new Order("Jim");
		
		// Add at least 2 items to each of the orders using the addItem method.
		order1.addItem(item4);
		order1.addItem(item1);
		order2.addItem(item2);
		order2.addItem(item3);
		order3.addItem(item3);
		order3.addItem(item4);
		order4.addItem(item2);
		order4.addItem(item4);
		order5.addItem(item1);
		order5.addItem(item3);
		
		// Test your getStatusMessage functionality.
		order2.setReady(true); 
		System.out.println(order2.getStatusMessage());
		order5.setReady(true); 
		System.out.println(order5.getStatusMessage());
		
		// Test the getOrderTotal method.
		System.out.println(order1.getOrderTotal());
		
		// Call the display method on all of your orders.
		order1.display();
		order2.display();
		order3.display();
		order4.display();
		order5.display();
	}

}
