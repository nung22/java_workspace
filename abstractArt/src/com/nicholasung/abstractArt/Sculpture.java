package com.nicholasung.abstractArt;

public class Sculpture extends Art {

	// MEMBER VARIABLES
	private String material;
	
	// CONSTRUCTOR
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	// Implement abstract Art class
	@Override
	public void viewArt() {
		System.out.printf("Title: %s %nAuthor: %s %nDescription: %s %nMaterial: %s%n%n", getTitle(), getAuthor(), getDescription(), material);
	}
	
	// GETTERS & SETTERS
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
