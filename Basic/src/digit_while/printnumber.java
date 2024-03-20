package digit_while;

public class printnumber {
	public static void printdig(int n) {
		while(n>0) {
			int rem=n%10;
			System.out.print(rem+"  ");
			n=n/10;
		}
	}
public static void main(String[] args) {
	printdig(1234);
}
}
