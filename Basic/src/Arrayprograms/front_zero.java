package Arrayprograms;

public class front_zero {


		    public static int[] zerofront(int[] num) {
		        int[] res = new int[num.length];
		        int j = num.length-1;
		        for (int i = num.length-1; i >=0 ; i--) {
		            if (num[i] != 0) {
		                res[j] = num[i];
		                j--;
		                 
		            }
		        }
		        printArray(res);
		        return res;
		    }

		    public static void printArray(int[] n) {
		        for (int i = 0; i < n.length; i++) {
		            System.out.print(n[i] + "  ");
		        }
		    }

		    public static void main(String[] args) {
		        int num[] = { 1, 2, 3, 0, 8, 0, 4, 0 };
		        zerofront(num);
		    }
		}


