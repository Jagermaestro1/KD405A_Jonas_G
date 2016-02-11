package KD405A_gabrielsson_j_uppgift4B;

/** Abstrata klassen Mammal är en subklass till Animal */
public abstract class Mammal extends Animal {
	protected int gestationTime;

	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
	}

	public int getGestationTime() {
		return this.gestationTime;
	}
}
