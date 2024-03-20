package Arrayprograms;

public class LINEAR_search {
	public static boolean check(int[] num, int key) {
		int c = 0;
		for (int i = 0; i <= num.length - 1; i++) {
			c++;
			if (num[i] == key) {
				return true;
			}
		}
		System.out.println(c);
		return false;
	}

	
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7 };
	
//		for (int i = 0; i <= num.length - 1; i++) {
			
//			}

		

		System.out.println(check(num, 3));

	}

}
