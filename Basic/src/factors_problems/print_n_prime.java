package factors_problems;

public class print_n_prime {

		static void dis(int start,int num) {
			int p=0;
			for(int i=start;;i++) {
				if(helper(i)) {
					System.out.println(i+" ");
					p++;
				}
				if(p==num) {
					  
					break;
				}
			}
		}
		static boolean helper(int n) {
			int c=0;
			for(int i=2;i<=n-1;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==0) {
				return true;
			}

			return false;
		}
		public static void main(String[] args) {
//			System.out.println(helper(7));
			dis(100,1);
		}

	}



