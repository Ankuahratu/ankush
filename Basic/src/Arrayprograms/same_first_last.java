
package Arrayprograms;

public class same_first_last {
	public static boolean same_first_last(int[] num) {
		if (num.length >= 1 && num[0] == num[num.length - 1]) {
			return true;

		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 1 };
//		int[] num=new int[5];
//		num[0]=1;
//		num[1]=2;
//		num[2]=3;
//		num[3]=4;
//		num[4]=9;
//		
		System.out.println(same_first_last(num));
	}
}
