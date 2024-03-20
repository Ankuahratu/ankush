package Arrayprograms;

public class reverse_array {
	

		public static void Print(int[] arr) {
	       for(int i=arr.length-1;i>=0;i--) {
				
					
					System.out.print(arr[i]+ " ");
					
				}
	       System.out.println("\n forward array =");
	       
	       for(int i:arr) {
				
				
				System.out.print(i+ " ");
				
			}
		
	     	
		}
		

		public static void main(String[] args) {
			int[] arr = { 1, 2, 3, 4, 5 };
			Print(arr);
		}
	}


