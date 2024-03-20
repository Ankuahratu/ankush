package Loops;

public class fibbo {
	static void dis(int n) {
		int x=1;
		int y=10;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(y+" ");
				y=y+y;
			}else {
				System.out.print(x+" ");
				x=x+x;
			}
		}
	}
public static void main(String[] args) {
	dis(10);
}
}
