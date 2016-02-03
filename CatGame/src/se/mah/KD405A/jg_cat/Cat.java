package se.mah.KD405A.jg_cat;

public class Cat {
	private String color="gray";
	private String name = "noname";
	private int age =0;
	private static int MAX_AGE=220; //age in months
	
//Constructors
	/** Creates a cat named Knodden*/
	public Cat() {
		this.name="Knodden";
		
	}
	public Cat(String color, String name) {
		this.color = color;
		this.name = name;
	}

// Methods
	public String getColor(){
		return this.color;
	}
	
	public String getName(){
		return this.name;
	
	}
	/** Sets age between 0 & 220*/
	public void setAge(int age){
		if(age>0 && age<=MAX_AGE) {
			this.age= age;
		}
	}
	
	public int getAge(){
		return this.age;
		
	}
}
