package Arrayprograms;

public class all_zero_back {
	public static int[] zeroback(int[] num) {
		int[] res = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] != 0) {
				res[j] = num[i];
				j++;

			}
		}

		return res;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 0, 8, 0, 4, 0 };
		zeroback(num);
		int[] x = zeroback(num);

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "  ");
		}

	}

}
