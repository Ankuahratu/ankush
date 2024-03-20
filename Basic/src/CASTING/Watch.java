package CASTING;

public class Watch {
	String model;
	int price;

	public Watch(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "model= " + this.model + "  price=" + this.price;
	}
}
class Student{
	String name;
	String qualification;
	public Student(String name, String qualification) {
		this.name = name;
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "name= " + this.name + "  .qualification=" + this.qualification;
	}
}