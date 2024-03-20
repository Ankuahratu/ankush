package digit_while;

public class mergeleftside {

		static int mergenoleft(int n1,int n2) {
			int c=0;
			int t=n1;
			while(t>0) {
				c++;
				t=t/10;
			}
			int res=1;
			for(int i=1;i<=c;i++) {
				res=res*10;
				
			}
			return n2*res+n1;
			
		}public static void main(String[] args) {
			
		java.util.Scanner ac=new java.util.Scanner(System.in);
			System.out.println("ENETR FIRST NUMBER");
			int n1=ac.nextInt();
			System.out.println("enter second number");
			int n2=ac.nextInt();
			System.out.println("enter answer number");

		System.out.println(mergenoleft(n1,n2));
		}

	}


