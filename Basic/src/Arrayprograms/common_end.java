package Arrayprograms;

public class common_end {
	public static boolean common(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;

		}

	}

	public static void main(String[] args) {
      int[] a= {1,2,3,4,3};
      int[] b= {1,2,3,4,5};
      System.out.println(common(a,b));
	}

}
