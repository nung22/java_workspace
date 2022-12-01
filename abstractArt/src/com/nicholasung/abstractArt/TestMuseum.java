package com.nicholasung.abstractArt;

public class TestMuseum {

	public static void main(String[] args) {
		// TODO: create paintings and sculptures here
		Painting painting1 = new Painting("Mona Lisa", "Leonardo Da Vinci", "A smiling woman.","Oil");
		Painting painting2 = new Painting("A Sunday in Eindhoven", "Vincent Van Gogh", "A typical afternoon in the city.", "Watercolor");
		Painting painting3 = new Painting("Campbell's Soup Cans", "Andy Warhol", "An array of soup cans.","Acrylic");
		Sculpture sculpture1 = new Sculpture("The Thinker", "Auguste Rodin", "A man deep in thought.", "Bronze");
		Sculpture sculpture2 = new Sculpture("David", "Michelangelo", "The biblical figure David.", "Marble");
		
		painting1.viewArt();
		painting2.viewArt();
		painting3.viewArt();
		sculpture1.viewArt();
		sculpture2.viewArt();
	}

}
