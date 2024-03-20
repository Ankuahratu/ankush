package digit_while;
import java.util.Scanner;
public class spynumbetweentwodig {
	public static boolean spynum(int n) {
		int sum = 0;
		int pro = 1;
		while (n > 0) {
			int rem = n % 10;
			pro = pro * rem;
         sum=sum+rem;
			n = n / 10;
		}
		if (sum == pro) {
			return true;
		}
		return false;
	}
	public static void printspy(int  s,int e) {
		for(int i=s; i<=e;i++) {
			if(spynum(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(spynum(4));
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STARTING POINT= ");
		int s=sc.nextInt();
		System.out.println("ENTER ENDING POINT= ");
		int e=sc.nextInt();
		printspy(s,e);
		
		
	}
}



