package Genralization;

public class Pen {
   String brand;
   String colour;
   int price;
public Pen(String brand, String colour, int price) {
	this.brand = brand;
	this.colour = colour;
	this.price = price;
}
@Override
public String toString() {
	return "Pen brand=" + brand + "colour=" + colour + "price=" + price ;
}
   
}
