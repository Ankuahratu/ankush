package Arrayprograms;

public class largest_in_array {
	public static int latgest(int[] num) {
//	max-------------------------------
		int max = num[0];
		int min = num[0];
		for (int i = 1; i <= num.length - 1; i++) {
			if (num[i] > max) {
				max = num[i];
//		System.out.println(num[i]);
			}
			if (num[i] < min) {
				min = num[i];
			}
			
		}
		return max-min;
	}

	public static void main(String[] args) {
		int[] num = { 2, 1, 7, 6, 9, 4, -1 };
		System.out.println(latgest(num));

	}
}
