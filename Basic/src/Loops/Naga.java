package Loops;

public class Naga {
static void dis(int n)
{
	int x=-1;
	int y=4;
	 
	for(int i=1;i<=n;i++)
	{
		if(i%2==0) {
			System.out.println(y);
			y=y+6;
		}
		else {
			System.out.println(x);
			x=x-6;
		}
	}
}
public static void main(String[] args) {
	dis(6);
}
}
