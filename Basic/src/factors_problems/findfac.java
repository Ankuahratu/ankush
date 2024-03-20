package factors_problems;

public class findfac {

	    static void dis(int n) {
	        int factor = help(n);
	        System.out.println(factor);
	    }

	    static int help(int n) {
	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                return i;
	            }
	        }
	        return n;}

	    public static void main(String[] args) {
	        dis(30);
	    }
	}
