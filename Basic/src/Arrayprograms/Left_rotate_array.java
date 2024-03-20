package Arrayprograms;

public class Left_rotate_array {
	public static int[] rotateleft(int[] num) {
		int first = num[0];
		for (int i = 0; i <= num.length - 2; i++) {
			num[i] = num[i + 1];

		}
		num[num.length - 1] = first;
		for(int i = 0; i <= num.length-1; i++)
		{
			System.out.print(num[i]+" ");
		}
		return num;
	}

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		
		rotateleft(num);
	}

}
