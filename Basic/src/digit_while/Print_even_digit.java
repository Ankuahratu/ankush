package digit_while;

public class Print_even_digit {

	public static void evendig(int n) {
		int c=0;

		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0 && rem!=0) {
				
				System.out.print(rem + " ");
c++;
			}
			n = n / 10;
		}
		System.out.print("\nnumber if even numbers ="+c);
	}

	public static void main(String[] args) {
		evendig(1240222);
	}

}