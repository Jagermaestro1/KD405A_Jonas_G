package KD405A_gabrielsson_j_uppgift4B;

public class Dog extends Mammal {
	private boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}

	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		this(latinName, gestationTime, stupid);
		this.setFriendlyName(friendlyName);
	}

	public boolean isStupid() {
		return this.stupid;
	}

	@Override
	public String getInfo() {
		String smartOrStupid = "not stupid";
		if (isStupid() == true) {
			smartOrStupid = "stupid";
		}
		// String smartOrStupid = isStupid() ? "stupid" : "not stupid";
		String info = "The dog named \"" + getFriendlyName() + "\" with the latin name " + latinName + " nurses for "
				+ gestationTime + " months and is " + smartOrStupid + "\n";
		return info;
	}

}
