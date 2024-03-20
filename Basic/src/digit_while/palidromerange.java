package digit_while;
import java.util.Scanner;
public class palidromerange {
	
		
			public static boolean pallid(int num) {
				int res=0;
				int temp=num;
				while(num>0) {
					int rem=num%10;
					res=res*10+rem;
					num=num/10;
				}
				if(temp==res) {
					return true;
				}
				return false;
			
				
			}
			public static void range(int s,int e) {
				for(int i=s;i<=e;i++) {
					if(pallid(i)) {
						System.out.println(i);
					}
				}
			}

			
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER STARTING POINT");
			int s=sc.nextInt();
			System.out.println("ENTER ENDING POINT");
			int e=sc.nextInt();
			range(s,e);
		
		}
		}





