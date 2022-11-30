package com.nicholasung.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("The bat has taken off into the air. Woosh!");
		setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("The bat has eaten an unfortunate human. **bones crunching**");
		setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("The bat has attacked a town!! **fire crackles**");
		setEnergyLevel(getEnergyLevel() - 100);
	}
}
