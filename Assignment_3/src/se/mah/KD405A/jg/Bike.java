package se.mah.KD405A.jg;

public class Bike {

	private static final int MIN_SIZE = 0;
	private static final int MAX_SIZE = 28;
	private static final int MIN_PRICE = 0;
	private static final int MAX_PRICE = 30000;
	private String color;
	private int size;
	private int price;

	// Constructors
	public Bike(String color, int size) {

		this.size = size;

		boolean trueColor = false;
		for (int i = 0; i < Constants.APPROVED_COLOR.length; i++) {
			if (Constants.APPROVED_COLOR[i].equals(color)) {
				trueColor = true;
			}
		}
		if (trueColor == true) {
			this.color = color;
		} else {
			this.color = "fy fan vad fult";
		}
	}

	public Bike(String color, int size, int price) {

		this.size = size;
		this.price = price;

		boolean trueColor = false;
		for (int i = 0; i < Constants.APPROVED_COLOR.length; i++) {
			if (Constants.APPROVED_COLOR[i].equals(color)) {
				trueColor = true;
			}
		}
		if (trueColor == true) {
			this.color = color;
		} else {
			this.color = "fy fan vad fult";
		}

		if (size >= MIN_SIZE && size <= MAX_SIZE) {
			this.size = size;
		} else {
			this.size = 0;

		}

		if (price >= MIN_PRICE && price <= MAX_PRICE) {
			this.price = price;
		} else {
			this.price = 0;

		}
	}

	// Methods
	/** Gets the color */
	public String getColor() {
		return this.color;
	}

	/** Gets the size */
	public int getSize() {
		return this.size;
	}

	/** Gets the price */
	public int getPrice() {
		return this.price;
	}

	/** Sets the price */
	public void setPrice(int price) {

		this.price = price;
	}

}
