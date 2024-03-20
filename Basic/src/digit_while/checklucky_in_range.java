package digit_while;
import java.util.Scanner;
public class checklucky_in_range {
	public static void range(int s, int e) {
		for (int i = s; i <= e; i++) {
			if (checklucky(i)) {
				System.out.print(i + " ");
			}
		}
	}

	
		public static boolean checklucky(int n) {
			int sum=add(n);
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
				sum=sum+rem;
				num=num/10;
			}
			return sum;
			
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(true) {
			System.out.println("ENTER FIRST NUMBER");
			int s = sc.nextInt();
			System.out.println("ENTER SECOND NUMBER");
			int e = sc.nextInt();
			range(s,e);
		}

		}}


