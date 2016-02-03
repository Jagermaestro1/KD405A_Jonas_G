package se.mah.KD405A.jg;

public class Bike {
	
	private String color; 
	private int size;
	private int price;
	
//Constructors
	public Bike(String color, int size) {
		this.color = color;
		this.size = size;

boolean trueColor=false;
	for(int i=0; i<=Constants.APPROVED_COLOR.length; i++){
	if(Constants.APPROVED_COLOR[i].equals(color)){
	trueColor=true;	
	}
	}
if(trueColor == true){
	this.color= color;
} else{
	this.color="fy fan vad fult";
}
	}
	

		
		

	public Bike(String color, int size, int price) {
		this.color = "Black";
		this.size = size;
		this.price=price;
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
