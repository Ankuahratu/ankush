package Arrayprograms;

public class print_array {
	public static void Print(int[] arr) {

//			for(int i:arr) {
//				System.out.print(i+" ");

//			 another
//			for(int i=1;i<=arr.length;i++) {
//				System.out.print(i+" ");
//	          using while loop
			int i = 0;
			while (i <= arr.length-1 ) {
				System.out.print(arr[i] + " ");
				i++;
			}

		}

		public static void main(String[] args) {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			Print(arr);
		}
	}


