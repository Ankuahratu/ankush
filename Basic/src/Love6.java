

public class Love6 {
	public static boolean love(int a,int b) {
		int sum=a+b;
		int diff=a-b;
		if(a==6 || b==6|| sum==6||diff==6) {
			return true;
		}else 
		{return false;
		}}
	public static void main(String[] args) {
		System.out.println(love(1,7));
	}
}
