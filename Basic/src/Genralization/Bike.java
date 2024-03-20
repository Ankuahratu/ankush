package Genralization;

public class Bike {
	String model;
	int price;
	public Bike(String model, int price) {
		
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike model=" + model + "price=" + price ;
	}
	
}
