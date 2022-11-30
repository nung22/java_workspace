package com.nicholasung.zookeeper;

public class Mammal {
	// MEMBER VARIABLES
	private int energyLevel;

	// CONSTRUCTOR
	public Mammal() {
		energyLevel = 100;
	}
	
	// CLASS METHODS
	public int displayEnergy() {
		System.out.printf("Energy Level: %d%n",energyLevel);
		return energyLevel;
	}
	
	// GETTERS & SETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
