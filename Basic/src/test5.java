
public class test5 {
	static int total(int a,int b,int c,int d) {
		return a+b+c+d;

	}
	static void percentage(int sum) {
	float per=sum/400.0f*100;
		System.out.println(per);}



	public static void main(String[] args) {
		int x=total(90,89,78,89);
		 percentage(x) ;
	}
}
