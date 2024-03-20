package digit_while;
// right side merge
import java.util.Scanner;
public class merge {
	static int mergeno(int n1,int n2) {
		int c=0;
		int t=n2;
		while(t>0) {
			c++;
			t=t/10;
		}
		int res=1;
		for(int i=1;i<=c;i++) {
			res=res*10;
			
		}
		return n1*res+n2;
		
	}public static void main(String[] args) {
		
		Scanner ac=new Scanner(System.in);
		System.out.println("ENETR FIRST NUMBER");
		int n1=ac.nextInt();
		System.out.println("enter second number");
		int n2=ac.nextInt();
		System.out.println("enter answer number");

	System.out.println(mergeno(n1,n2));
	}

}
