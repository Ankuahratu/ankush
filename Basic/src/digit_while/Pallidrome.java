package digit_while;

public class Pallidrome {
	
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
		

		
	public static void main(String[] args) {
		System.out.println(pallid(121));
	}
	}



