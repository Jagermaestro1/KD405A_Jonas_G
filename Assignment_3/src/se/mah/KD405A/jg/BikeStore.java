package se.mah.KD405A.jg;

import java.util.ArrayList;

public class BikeStore {
	
	public BikeStore(){
	}
	

	private ArrayList<Bike> lagret = new ArrayList<Bike>();

	public String getAllBikes() {
		String s = "";

		for (Bike c : lagret) {
			s = s + c.getColor() + c.getPrice() + c.getSize();

		}
		return s;
	}
	public void addBike(String color, int size, int price){
		lagret.add(new Bike(color, size,price));
	}
}
