package Loops;

public class even_fibbo {
	static void dis(int n) {
		int x=1;
		int y=1;
		int p=0;
		for(int i=1;;i++) {
			int sum=x+y;
			x=y;
			y=sum;
			if(sum%2==0) {
				p++;
				System.out.println(sum);
				if(p==n) {
					break;
				}
			}
		}
	}
public static void main(String[] args) {
	dis(5);
}
}
