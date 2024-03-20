package Shorting;

public class Selection_short {
	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}

			int temp = arr[smallest];

			arr[smallest] = arr[i];

			arr[i] = temp;
		}

		printarray(arr);
		return arr;
	}

	public static void printarray(int[] n) {
		for (int i = 0; i <= n.length - 1; i++) {
			System.out.print(n[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 8, 3, 45, 5, 4, 2, 4 };
		selectionSort(arr);
//		for(int i=0;i<=arr.length-1;i++) {
		// System.out.println(arr[i]);

		// }
	}
}
