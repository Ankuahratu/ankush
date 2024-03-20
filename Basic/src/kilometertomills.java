import java.util.Scanner;
public class kilometertomills {
	public static void main(String[] args) {
		Scanner ac =new Scanner(System.in);
		//		System.out.println("enter the kilometers");
		//		double kilo=ac.nextDouble();
		//		double miles =kilo*0.621371;
		//		System.out.println(kilo+"kilometers is equal to "+ miles+ "miles");
		//		System.out.println("enter the meters ");
		//		double met=ac.nextDouble();
		//		double centi = met*100;
		//		System.out.println(centi);
		System.out.println("enter the lenght of the rectangle ");
		double l=ac.nextDouble();

		System.out.println("enter the breath of the rectangle ");
		double b=ac.nextDouble();
        double area=l*b;
        System.out.println(area);
	}
}
