package com.nicholasung.baristaChallenge;

import java.util.ArrayList;
public class Order {
	// MEMBER VARIABLES
	private String name;
	private boolean ready;
	private ArrayList<Item> items;
	
	// CONSTRUCTOR
	public Order() {
		this.name = "Guest";
		this.ready = false;
		this.items = new ArrayList<Item>();
	}
	
	// OVERLOADED CONSTRUCTOR
	public Order(String name) {
		this.name = name;
		this.ready = false;
		this.items = new ArrayList<Item>();
	}
	
	// Class Methods
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public String getStatusMessage() {
		if(this.ready) {
			return "Your order is ready.";
		}
		return "Thank you for waiting, Your order will be ready soon.";
	}
	
	public double getOrderTotal() {
		double total = 0;
		for(Item item : this.items) {
			total += item.getPrice();
		}
		return total;
	}
	
	public void display() {
		System.out.printf("Customer Name: %s%n",this.name);
		for(Item item : this.items) {
			System.out.printf("%s - $%.2f%n",item.getName(),item.getPrice());
		}
		System.out.printf("Total: $%.2f%n%n",getOrderTotal());
	}
	
	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
}
