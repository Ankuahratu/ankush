package digit_while;
import java.util.Scanner; 
public class rotatefistintolast {
	

		static int rotationfistlast(int n) {
			 int t = n;
			int res = 1;
			while (t > 9) {
				res = res * 10;
		
				t = t / 10;
			}
			int first = n / res;
			int last = n % res;
			n = last* 10 + first;
			return n;
		

		}

		public static void main(String[] args) {

			Scanner ac = new Scanner(System.in);
			System.out.println("ENETR FIRST NUMBER");
			int n = ac.nextInt();

			System.out.println(rotationfistlast(n));
		}

	}



