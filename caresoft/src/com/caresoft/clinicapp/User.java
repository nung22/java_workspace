package com.caresoft.clinicapp;

public class User {
	// Member Variables
    protected Integer id;
    protected int pin;
    
	// Implement a constructor that takes an ID
	public User(Integer id) {
		this.id = id;
		pin = 0;
	}

    // TODO: Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
