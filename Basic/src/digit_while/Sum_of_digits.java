package digit_while;

public class Sum_of_digits {

	public static void sumofdig(int n) {
		int sum = 0;
		int pro = 1;
		while (n > 0) {
			int rem = n % 10;
//	product
//			System.out.print(rem+"  ");
//			pro=pro*rem;
			sum = sum + rem;

			n = n / 10;
		}
		System.out.println("\n" + sum + "  ");
	}

	public static void main(String[] args) {
		sumofdig(9888);
	}
}
