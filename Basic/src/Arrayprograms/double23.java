package Arrayprograms;

public class double23 {
	static boolean check(int[] num) {
		if (num.length == 2 && (num[0] == 2 && num[1] == 2 || num[0] == 3 && num[1] == 3)) {

			return true;
		} else {
			return false;
		}
	}

	

	public static void main(String[] args) {
		int[] num = { 3, 3};
		System.out.println(check(num));
	}

}
