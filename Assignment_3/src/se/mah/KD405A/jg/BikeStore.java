package se.mah.KD405A.jg;

import java.util.ArrayList;

public class BikeStore {
	
	String color;
	int size;
	int price;

	private ArrayList<Bike> lagret = new ArrayList<Bike>();
	
	
	public String getAllBikes(){

		for (Bike c : lagret ) {
		
				
			String s;
			s= c.getColor() + c.getPrice() + c.getSize();	
		
	
		return s;	
	}
		return null;
}
}