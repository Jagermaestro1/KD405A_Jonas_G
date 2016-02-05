package se.mah.KD405A.jg;

import java.util.ArrayList;

public class BikeStore {

	public BikeStore() {
	}

	/** Skapar en ArrayList "lagret" */
	private ArrayList<Bike> lagret = new ArrayList<Bike>();

	/** Skapar metoden getAllBikes" och slänger in värdet i s */
	public String getAllBikes() {
		String s = "";

		for (Bike c : lagret) {
			s = s + "Färg: " + c.getColor() + " Pris: " + c.getPrice() + " Storlek: " + c.getSize() + "\n";

		}
		return s;
	}

	/** Metod för att lägga till ny Bike */

	public void addBike(String color, int size, int price) {
		Bike c = new Bike(color, size, price);
		this.lagret.add(c);
	}
}
