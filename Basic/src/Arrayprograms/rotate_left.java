package Arrayprograms;

public class rotate_left {
	public static int[] rotate(int[] arr) {
//		int[] res=new int[3];
//		res[0]=arr[1];
//		res[1]=arr[2];
//		res[2]=arr[0];
//		return res;
		int temp = arr[0];//1
		arr[0] = arr[1];//2
		arr[1] = arr[2];//3
		arr[2] = temp;////1
		return arr;

//		return new int[] { arr[1], arr[2], arr[0] };
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		arr = rotate(arr);
		for (int i : arr) {
			System.out.print(i+" "	);
			}

//	System.out.print(rotate(arr));

	}
}
