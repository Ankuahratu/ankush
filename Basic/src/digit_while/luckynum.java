package digit_while;

public class luckynum {
	public static boolean checklucky(int n) {
		int sum=n;
		while(sum>9) {
			sum=add(sum);
		}
		if(sum==1) {
			return true;
			
		}
		return false;
	}

	public static int add(int num) {
		int sum=0;
		while(num>0)
		{
			int rem =num%10;
			sum=sum+rem;//7741=0+1=1+4+7+7=19=9+1=10=1
			num=num/10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(checklucky(7741));
	}

}
