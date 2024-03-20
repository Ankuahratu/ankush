package digit_while;

public class count_number_of_digit {

	public static void countdigit(int n) {
		int c=0;
		while (n > 0) {
			int rem = n % 10;
			c++;
			n = n / 10;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		countdigit(56);
	}
}
