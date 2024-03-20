package Loops;

public class fibbonseries {
	static void dis(int n) {
		int x=1;
		int y=4;
		for(int i=1;i<=n;i++) {
		
			System.out.print(x+" ");
			x=x+y;
			y++;
			
			
		}
	}
public static void main(String[] args) {
	dis(4);
}
}
