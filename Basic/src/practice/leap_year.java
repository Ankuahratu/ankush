package practice;

public class leap_year {
	public static void dis(int year) {
		if(year%4==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap");
		}
		
	}
public static void main(String[] args) {
	dis(2004);
}
}
