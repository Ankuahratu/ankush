
public class firstn {
	static String firstname(String fn) {
		return "$"+fn;

	}
	static String lastname(String ln) {
		return ln+"$" ;}

	static void fullname(String x,String y) {
		String name=x+" " +y;
		System.out.println(name);

	}
	public static void main(String[] args) {

		String s1=firstname("rahul");
		String s2=lastname("dravid");
		fullname(s1,s2);
	}
}
