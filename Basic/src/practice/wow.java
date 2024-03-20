package practice;
//0 1 1 2 4 7 13 24.........
public class wow {
	static void dis(int n) {
		int x=0;
		int y=1;
		int z=1;
		System.out.print(x+" "+y+" "+z+" ");
		for(int i=2;i<=n-2;i++) {
			int sum=x+y+z;
			System.out.print(sum+" ");
			x=y;
			y=z;
			z=sum;
		}
	}

	public static void main(String[] args) {
		dis(10);
	}
}
