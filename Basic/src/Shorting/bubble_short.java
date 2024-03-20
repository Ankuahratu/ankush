package Shorting;

public class bubble_short {
	public static int[] Bsort(int[] num) {
		for (int i = 0; i <= num.length - 1; i++) {
			for (int j = 0; j <= num.length-2; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}

		}
		printarray(num);
		return num;
	}

	public static void printarray(int[]  n) {
		for (int i = 0; i <= n.length - 1; i++) {
			System.out.println(n[i]);
		}

	}

	public static void main(String[] args) {
		int[] num = { 14, 4, 2, 37, 5, 69 };
		Bsort(num);
	}
}
