package Genralization;

public class Coffee {
	String name;
	int price;

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {

		return this.name + "   " + this.price;
	}
}

class tea {
	String name;
	int price;

	public tea(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {

		return this.name + "   " + this.price;

	}
}
