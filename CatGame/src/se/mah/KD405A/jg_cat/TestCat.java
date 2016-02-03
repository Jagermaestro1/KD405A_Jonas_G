package se.mah.KD405A.jg_cat;

public class TestCat {

	public TestCat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	System.out.println("Detta är en test för Cat");
	System.out.println("**Start Test");
	Cat c = new Cat();
	Cat a = new Cat("Brown", "Missen");
	System.out.println("One cat: " + c.getName()+" and one: "+ a.getName());
	}

}
