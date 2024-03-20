package digit_while;

public class Voipallidrome {
	
		
			public static void pallid(int num) {
				int res=0;
				int temp=num;
				while(num>0) {
					int rem=num%10;
					res=res*10+rem;
					num=num/10;
				}
				if(temp==res) {
					System.out.println("number is palidrome="+res);
				}
				else {
				System.out.println("number is not palidrome="+res);
			}
			}
			
		public static void main(String[] args) {
			pallid(121);
		}
		}






