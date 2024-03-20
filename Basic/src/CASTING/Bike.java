package CASTING;

public class Bike {
	String model;
	int price;

	public Bike(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public void bikedetails() {
		System.out.println("MODEL=" + this.model);
		System.out.println("PRICE=" + this.price);
	}

}

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public void empdetails() {
		System.out.println("name=" + this.name);
		System.out.println("salary=" + this.salary);
	}

}
