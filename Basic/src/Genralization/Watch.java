package Genralization;

public class Watch {
	String name;
	int price;

	public Watch(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + this.name + "\nprice=" + this.price + "]";
	}
}
