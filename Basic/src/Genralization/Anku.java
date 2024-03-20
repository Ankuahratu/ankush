package Genralization;

public class Anku {
	public static void main(String[] args) {
		Watch w1 = new Watch("one plus", 4999);
		Watch w2 = new Watch("fastrack", 90000);
		Bike b1 = new Bike("passion", 150000);
		Bike b2 = new Bike("pulsar", 180000);
		Student s1 = new Student("ankush", "B-TECH", 89.78);
		Student s2 = new Student("shia", "B-TECH(CSE)", 91.78);
		Pen p1 = new Pen("link", "blue", 20);
		Pen p2 = new Pen("trimax", "red", 40);

		Object[] x = { w1, w1, b1, b2, s1, s2, p1, p2 };
		
		for (int i = 0; i <= x.length - 1; i++) {
			
			if (x[i] instanceof Student){
				System.out.println(x[i]);
				System.out.println();
			}
		}

	}
}