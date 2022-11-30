package com.nicholasung.zookeeper;

public class Gorilla extends Mammal{

	// CONSTRUCTOR
	public Gorilla() {
		super();
	}

	// CLASS METHODS
	public void throwSomething() {
		System.out.println("The gorilla has thrown something. Duck!");
		setEnergyLevel(getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla has eaten a banana. Yum!");
		setEnergyLevel(getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree. Look up!");
		setEnergyLevel(getEnergyLevel() - 10);
	}
	
}
