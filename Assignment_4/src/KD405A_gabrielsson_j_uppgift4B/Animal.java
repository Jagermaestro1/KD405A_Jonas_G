package KD405A_gabrielsson_j_uppgift4B;

/** Abstrakta klassen Animal */
public abstract class Animal {
	protected String latinName;
	private String friendlyName = "noname";

	public Animal(String latinName) {
		this.latinName = latinName;
	}

	public abstract String getInfo();

	public void setFriendlyName(String name) {
		this.friendlyName = name;
	}

	public String getFriendlyName() {
		return this.friendlyName;
	}
}
