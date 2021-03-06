package KD405A_gabrielsson_j_uppgift4B;

/** klassen Cat är en subklass till Mammal */
public class Cat extends Mammal {
	private int numberOfLifes;

	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		this.setNumberOfLifes(numberOfLifes);
	}

	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	public void setNumberOfLifes(int numberOfLifes) {
		this.numberOfLifes = numberOfLifes;
	}

	@Override
	public String getInfo() {
		String info = "The cat with the latin name " + latinName + " nurses for " + gestationTime + " months an has "
				+ getNumberOfLifes() + " lifes" + "\n";
		return info;
	}

}
