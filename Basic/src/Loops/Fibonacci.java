package Loops;

public class Fibonacci {
static void dis(int n) {
	int x=0;//start with 1 
	int y=1;
	int sum;
	System.out.print(x+" "+y);
	for(int i=0;i<=n-2;i++) {
		sum=x+y;
		
		
		System.out.print(" "+sum);
		x=y;
	   y=sum;
	
	}
			
}
public static void main(String[] args) {
	dis(10);
}
}

