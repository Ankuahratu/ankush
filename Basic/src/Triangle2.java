import java.util.Scanner;
public class Triangle2 
{
	public static void main (String[]args){
		System.out.println("taking input from user");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number 1");
		float a= sc.nextFloat();

		System.out.println("enter number 2");
		float b= sc.nextFloat();
		float area= 1.0f/2*a*b;
		System.out.println(area);
	}
}
