package factors_problems;

public class fac {
	static void dis(int n)
	{int c=0;
			for(int i=2;i<=n-1;i++) {
				
				if(n%i==0 ) {
					System.out.println(i+"not prime");
					c++;
				}
//				System.out.println(c);	
					
			}
		}
		public static void main(String[] args) {
			dis(10);
		}

}