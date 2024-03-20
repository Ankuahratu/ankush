package digit_while;

// 10 9 8 7 6
import java.util.Scanner;

public class factorial_of_num {
	public static void dis(int n) {
		int fac = 1;
		int c = 0;
		int i = 0;
		for (i = n; 1 <= i; i--) {
			c = fac * i;
			System.out.println(fac + "  *  " + i + " =  " + c);
			fac = c;

		}
		System.out.println("FACTORIAL   =" + c);
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		while (true) {
			Scanner ac = new Scanner(System.in);

			System.out.println("ENTER A NUMBER");
			int n = ac.nextInt();
			System.out.println("ANSER IS ");
			dis(n);
		}
	}
}
