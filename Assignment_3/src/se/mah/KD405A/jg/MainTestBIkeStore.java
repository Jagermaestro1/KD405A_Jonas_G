package se.mah.KD405A.jg;



public class MainTestBIkeStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BikeStore bstore = new BikeStore();
	
		
		bstore.addBike("Red",26,20000);
		bstore.addBike("Yellow",28,300000);
		bstore.addBike("Orange", 20, 3000);
		
		System.out.println(bstore.getAllBikes());
	 }


	}


