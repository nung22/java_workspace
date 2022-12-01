package com.nicholasung.abstractArt;

public class Painting extends Art {

	// MEMBER VARIABLES
	private String paintType;
	
	// CONSTRUCTOR
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	// Implement abstract Art class
	@Override
	public void viewArt() {
		System.out.printf("Title: %s %nAuthor: %s %nDescription: %s %nPaint Type: %s%n%n", getTitle(), getAuthor(), getDescription(), paintType);
	}
	
	// GETTERS & SETTERS
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
}
