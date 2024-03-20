package digit_while;
import java.util.Scanner;
public class complexity_merge {

	static int mergeno(int n1,int n2) {
		
		int t=n2;
		int res=1;
		while(t>0) {
			res=res*10;
			t=t/10;
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



