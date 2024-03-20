import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
//				int r=6;
//				float area=22.0f/7*r*r;
//			System.out.println(area);
		//		float a = 7.8f;
		//		float area2 =22.0f/7*a*a;
		//		System.out.println(area2);
//		double r=7.8;
//		double d= 3.14*r*r;
//		System.out.println(d);
		System.out.println("enter the of r radious");
		Scanner ac=new Scanner(System.in);
		double r=ac.nextDouble();
		double area=22.0/7*r*r;
		System.out.print("area of circle is");
		System.out.print(" = "+area);
		}

}

