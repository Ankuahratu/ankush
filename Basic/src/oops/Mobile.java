package oops;

public class Mobile {
	String brand, model;

	int price;

	public Mobile(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String toString() {
		return "\nBRAND="+this.brand + "\nMODEL=" + this.model + " \nPRICE=" + this.price;
//	public String getBrand() {
//		return this.brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public String getModel() {
//		return this.model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public int getPrice() {
//		return this.price;
//	}
//	public void setPrice(int price) {
//		this.price=price;
//	}

}
}