package Loops;
//0 1 1 2 4 7 13 24.........
public class Tribbonacci {
	static void dis(int n) {
		int x=0;
		int y=1;
		int z=1;
		int sum;
		System.out.print(x+" "+y+" "+z);
		for(int i=0;i<n-3;i++) {
			sum=x+y+z;
			      

			System.out.print(" "+sum);//4


			x=y;
			y=z;
			z=sum;




		}
	}
	public static void main(String[] args) {
		dis(10);
	}

}
