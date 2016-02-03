package se.mah.KD405A.jg;

public class Bike {
	
	private String color; 
	private int size;
	private int price;
	
//Constructors
	public Bike(String color, int size) {
		this.color = "Green";
		this.size = 28;
	}
	public Bike(String color, int size, int price) {
		this.color = "Black";
		this.size = 24;
		this.price=200;
}
	
//Methods
	public String getColor(){
		return this.color;
	}
	
	public int getSize(){
		return this.size;
	}
	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		
			this.price =price;
		}
}
