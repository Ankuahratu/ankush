package Arrayprograms;
import java.util.Scanner;
public class Sum13 {
	public static int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] != 13) {
				sum = sum + nums[i];
			}

			else {
				i++;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int n=sc.nextInt();
	int []num=new int[n];
	System.out.println("enter elements");
	for(int i=0;i<=num.length-1;i++) {
		num[i]=sc.nextInt();
	}
		System.out.println(sum13(num));
	}
}
