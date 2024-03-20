package Loops;

public class fabbo {
	static void dis(int n) {
		int x=1;
		int y=1;
		System.out.print(x+" "+y+" ");
		for(int i=1;i<=n-2;i++) {
			int sum= x+y;
			System.out.print(sum+" ");
			x=y;
			y=sum;
		}
	}
public static void main(String[] args) {
	dis(5);
	
}
}
