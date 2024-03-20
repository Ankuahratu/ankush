package Arrayprograms;

public class count_even_num {

	public static void Print(int[] arr) {
        int c=0;
//     	for(int i:arr) {
    		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]%2==1) {
//    	if(i%2==0) {
			
				System.out.print(arr[i]+ " ");
//    		System.out.print(i+ " ");
				c++;
			}

	
		}
     	System.out.println("number of even enumber=  "+c);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 ,6,8,9};
		Print(arr);
	}
}
