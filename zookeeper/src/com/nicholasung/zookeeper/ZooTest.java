package com.nicholasung.zookeeper;

public class ZooTest {

	public static void main(String[] args) {
		// Test Gorilla Class
		Gorilla harambe = new Gorilla();
		for(int i = 0; i < 3; i++) {
			harambe.throwSomething();
//			harambe.displayEnergy();
		}
		for(int i = 0; i < 2; i++) {
			harambe.eatBananas();
//			harambe.displayEnergy();
		}
		harambe.climb();
		harambe.displayEnergy();
		
		// Test Bat Class
		Bat nosferatu = new Bat();
		for(int i = 0; i < 3; i++) {
			nosferatu.attackTown();
//			nosferatu.displayEnergy();
		}
		for(int i = 0; i < 2; i++) {
			nosferatu.fly();
//			nosferatu.displayEnergy();
			nosferatu.eatHumans();
//			nosferatu.displayEnergy();
		}
		nosferatu.displayEnergy();
	}
}
