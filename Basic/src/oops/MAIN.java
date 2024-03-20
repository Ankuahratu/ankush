package oops;

public class MAIN {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple", "iphone 15", 700000);
		Mobile m2 = new Mobile("oppo", "A5", 18000);
		Mobile m3 = new Mobile("one plus", "17", 45000);
		Mobile m4 = new Mobile("Apple", "iphone 11", 65000);
		Mobile m5 = new Mobile("Apple", "iphone 15+", 70000);
		Mobile[] x = { m1, m2, m3, m4, m5 };
		
		for (int i = 0; i <= x.length - 1; i++) {
//			String s1=x[i].brand;
//			if(s1.equalsIgnoreCase("A5"))
//			if(x[i].price>45000)
            System.out.println(x[i].brand);
            System.out.println(x[i].model);

            System.out.println(x[i].price);
            System.out.println();


		}
	}
}
