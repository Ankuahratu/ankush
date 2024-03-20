package CASTING;

public class demo {
	public static void main(String[] args) {
		Bike b1 = new Bike("R15", 225000);
		Bike b2 = new Bike("splendor", 95000);
		Employee e1 = new Employee("anku", 60000);
		Employee e2 = new Employee("daman", 65000);

		Object[] x = { b1, e1, b2, e2 };

		Object a1 = x[0];
		Bike x1 = (Bike) a1;
		x1.bikedetails();

		Object a2 = x[1];
		Employee x2 = (Employee) a2;
		x2.empdetails();

		Object a3 = x[2];
		Bike x3 = (Bike) a3;
		x3.bikedetails();

		Object a4 = x[3];
		Employee x4 = (Employee) a4;
		x4.empdetails();

	}
}
