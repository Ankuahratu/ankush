package Arrayprograms;

import java.util.Scanner;

public class fix23 {
	static int[] check(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
			return nums;
		} else if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}

		return nums;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("ENETR NUMBER OF ELEMENT :" + (i + 1) + " :");
			nums[i] = sc.nextInt();
		}
		System.out.print("array:  [");
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i]);
			if (i < n - 1) {
				System.out.print(",");
			
		}
		

	}
		System.out.println("]");
		int[] arr=check(nums);
		for(int i:arr) {
			System.out.print(i +" ");
		}
   
}}
