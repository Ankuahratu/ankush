package factors_problems;

public class prime_or_not {
	static void dis(int num) {
		for(int i=2;i<=num-1;i++) {
			if(helper(i)) {
				System.out.println(i+" ");
			}
		}
	}
	static boolean helper(int n) {
		int c=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==0) {
			return true;
		}

		return false;
	}
	public static void main(String[] args) {
//		System.out.println(helper(7));
		dis(17);
	}

}
