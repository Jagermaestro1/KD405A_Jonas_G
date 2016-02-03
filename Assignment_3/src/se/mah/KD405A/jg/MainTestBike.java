package se.mah.KD405A.jg;

import java.util.ArrayList;
import java.util.Random;

public class MainTestBike {
	
	public static void main(String [] args) {

	
	ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
		Random sizeRandom = new Random();
		Random priceRandom = new Random();

	for(int i = 0; i<10; i++){			
			int randomSize = sizeRandom.nextInt(31) + 10;
			int randomPrice = priceRandom.nextInt(9001) + 1000;
			
			String s = "blå";
			allBikes.add(new Bike(s,randomSize,randomPrice));
	}
			int index = 0;
		
		for(Bike b:allBikes){
		
		System.out.println("Cykel nummer " + index++ +" kostar " + b.getPrice() + " kronor, och är " + b.getSize() + " tum lång");
			
		}
	}
}
