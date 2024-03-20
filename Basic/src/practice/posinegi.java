package practice;
import java.util.Scanner;
public class posinegi {
	static String dis(int x) {
		if (x>=0)
		{return "number is positve";
		}else {
			return "negative";}
		}
		public static void main(String[] args) {
			Scanner ac=new Scanner(System.in);
			int x=ac.nextInt();
			System.out.println(dis(x));
		}
	}


