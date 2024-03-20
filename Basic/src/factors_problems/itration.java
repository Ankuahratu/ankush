package factors_problems;

public class itration {
	static String isprime(int n) {
		if(n<=1) {
			return "not prime";
		}
		else if(n==2||n==3) {
			return "prime";
			
		}
		else if(n%3==0||n%2==0) {
			return "not prime";
			
			
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2){
			return "not prime";
		}
	return "prime";}
public static void main(String[] args) {
	System.out.println(isprime(17));
}
}
