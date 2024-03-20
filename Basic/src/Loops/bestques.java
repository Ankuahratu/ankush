package Loops;
//0 1 1 2 3 5 8 13 21 34 55
public class bestques {
	static void dis(int n) {
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++) {
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
			
		}
	}
public static void main(String[] args) {
	dis(6);
}
}
