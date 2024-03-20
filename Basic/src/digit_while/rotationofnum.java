package digit_while;

import java.util.Scanner;

public class rotationofnum {

	static int rotation(int n) {
		int first = n / 10;
		int last = n % 10;

		int t = first;
		int res = 1;
		while (t > 0) {
			res = res * 10;
			t = t / 10;
		}
//		System.out.println(c+1);
		n = last * res + first;
		return n;
	

	}

	public static void main(String[] args) {

		Scanner ac = new Scanner(System.in);
		System.out.println("ENETR FIRST NUMBER");
		int n = ac.nextInt();

		System.out.println(rotation(n));
	}

}
