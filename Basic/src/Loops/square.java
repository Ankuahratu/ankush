package Loops;

public class square {
	public static void dis(int n)
	{int x=1;
		for(int i=1;i<=n;i++) {
			int sum=x*i;
			x++;
			System.out.println(sum);
			
		}
	}
public static void main(String[] args) {
	dis(10);
}
}
