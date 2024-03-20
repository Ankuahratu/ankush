package Arrayprograms;

public class middle_of_3 {
	public static int[] check(int[] a, int[] b) {

		int[] res = new int[2];
		res[0] = a[(a.length-1)/2];
		res[1] = b[(b.length-1)/2];
		return res;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 5, 6, 7 };
		int [] c= check(a,b);
		for(int i:c) {
			System.out.print(i+" ");
		}
		}
}
