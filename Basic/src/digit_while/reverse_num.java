package digit_while;

public class reverse_num {
	public static int reverse(int num) {
		int res = 0;

		while (num > 0) {
			int rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(reverse(567));
	}
}
