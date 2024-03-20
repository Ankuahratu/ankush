package Arrayprograms;
import java.util.Scanner;
public class Rotate_right {
	

		public static int[] rotateleft(int[] num) {
			int last = num[num.length-1];
			for (int i = num.length-1; i >=1 ; i--) {
				num[i] = num[i - 1];

			}
			num[0] = last;
			for (int i = 0; i <= num.length - 1; i++) {
				
			}
			printarray(num);
			return num;
		}

		public static void printarray(int[] n) {
			for (int i = 0; i <= n.length - 1; i++) {
				System.out.print(n[i] + "  ");
			}
		}
	     
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER ARRAY SIZE");
			int n = sc.nextInt();
			
			int[] num = new int[n];
			System.out.print("ENTER ARRAY ELEMNTS");
			for (int i = 0; i <= num.length - 1; i++) {
				
	          num[i]=sc.nextInt();
			}
			
			rotateleft(num);
		}
	}



