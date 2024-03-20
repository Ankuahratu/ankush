package digit_while;
import java.util.Scanner;
public class with_in_range {
	
		public static void range(int s, int e) {
			for (int i = s; i <= e; i++) {
				if (check(i)) {
					System.out.print(i + " ");
				}
			}
		}

		public static boolean check(int n) {
			int c = 0;
			int t = n;
			while (t > 0) {
				c++;
				t = t / 10;
			}
			for (int i = 1; i <= c; i++) {
//				System.out.println(n);
				if (checkprime(n)) {
					int first = n / 10;
					int last = n % 10;
					n = last * pow(10, c - 1) + first;
				} else {
					return false;
				}

			}
			return true;

		}

		public static int pow(int b, int p) {
			int res = 1;
			for (int i = 1; i <= p; i++) {
				res = res * b;

			}
			return res;
		}

		static boolean checkprime(int num) {

			if (num <= 1) {
				return false;
			} else if (num == 2 || num == 3) {
				return true;

			} else if (num % 3 == 0 || num % 2 == 0) {
				return false;

			}
			for (int i = 5; i <= Math.sqrt(num); i = i + 2) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
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
		}

	}



