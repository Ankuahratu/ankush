package Shorting;

public class insertion_sort {
	public static int[] insertion(int[] num) {
		for (int i = 1; i <= num.length - 1; i++) {
			int current = num[i];
			int j = i - 1;
			while (j >= 0 && current < num[j]) {
//				               11        12
				num[j + 1] = num[j];
//				               12
				j--;
			}
			num[j + 1] = current;
		} 
		printarr(num);
		return num;
	}
public static void printarr(int[] n) {
	for(int i=0;i<=n.length-1;i++) {
		System.out.println(n[i]);
	}
}


	public static void main(String[] args) {
		int[] num = { 12,11,13,5,6};
		insertion(num);
	}
}
