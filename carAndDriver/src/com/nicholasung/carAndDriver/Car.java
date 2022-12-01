package com.nicholasung.carAndDriver;

public class Car {
	// MEMBER VARIABLES
	private int gas;
	
	// CONSTRUCTOR
	public Car() {
		gas = 10;
	}
	
	// CLASS METHODS
	public void displayGas() {
		if(gas == 0) {
			System.out.println("You have run out of gas! Game Over.");
			return;
		}
		System.out.printf("Gas remaining: %d/10%n%n",gas);
	}

	// GETTERS & SETTERS
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
}
