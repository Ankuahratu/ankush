import java.util.Scanner;
public class addtwonumbers {

	public static void main(String[] args) {
		System.out.println("taking input from user");
		Scanner input =new Scanner(System.in);
		System.out.println("\n\t ENTER NUMBER FIRST");
		int  a=input.nextInt();
		System.out.println("ENTER THE SECOMD NUMBER ");
		int b=input.nextInt();
		//           System.out.println("sum of two numbers");
		//           System.out.println("sub of two numbers");
		//           System.out.println("multiply of two numbers");
		System.out.println("division of two numbers");
		//           int sum=a+b;
		//           int sub=a-b;
		//           int multi=a*b;
		int div=a/b;
		//           System.out.println(sum);
		//           System.out.println(sub);
		//           System.out.println(multi);
		System.out.println(div);

	}

}
