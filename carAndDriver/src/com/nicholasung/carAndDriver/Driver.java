package com.nicholasung.carAndDriver;

public class Driver extends Car {
	// CLASS METHODS
	public void drive() {
		System.out.println("You drive the car.");
		this.setGas(this.getGas()-1);
		this.displayGas();
	}
	
	public void useBoosters() {
		if(this.getGas() < 3) {
			System.out.println("You have insufficient gas for a boost. Try refueling first!\n");
			return;
		}
		System.out.println("You activate the car's boosters.");
		this.setGas(this.getGas()-3);
		this.displayGas();
	}
	
	public void refuel() {
		if(this.getGas() > 8) {
			System.out.println("You have too much gas. Now is not the time to refuel!\n");
			return;
		}
		System.out.println("You refuel the car.");
		this.setGas(this.getGas()+2);
		this.displayGas();
	}
}
