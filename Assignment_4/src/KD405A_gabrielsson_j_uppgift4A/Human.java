package KD405A_gabrielsson_j_uppgift4A;

public class Human {
	
	private Dog dog;
	private String name;
	
	public Human(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	public void buyDog(Dog dog){
		this.dog=dog;
	}

	public String getInfo(){
		String s;
		if(name!=null){
			if(dog!=null){
				s = name + " äger en hund som heter "+ dog.getName();
			}
			else{
				s = name + " äger ingen hund";
			}
		}
		else{
			s = "du måste vara männsklig för att köpa en hund.";
		}
		return s;
	}

	
}

