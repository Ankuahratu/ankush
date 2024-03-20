package digit_while;

public class printSpynumber {

	public static boolean spynum(int n) {
		int sum = 0;
		int pro = 1;
		while (n > 0) {
			int rem = n % 10;
			pro = pro * rem;
         sum=sum+rem;
			n = n / 10;
		}
		if (sum == pro) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(spynum(112));
	}
}
