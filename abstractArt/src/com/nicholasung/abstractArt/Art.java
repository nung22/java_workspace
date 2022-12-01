package com.nicholasung.abstractArt;

public abstract class Art {
	// MEMBER VARIABLES
	protected String title;
	protected String author;
	protected String description;
	
	// CONSTRUCTOR
	protected Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	// ABSTRACT METHODS
	abstract void viewArt();
	
	// GETTERS & SETTERS
	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	protected String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}

	protected String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}
}
