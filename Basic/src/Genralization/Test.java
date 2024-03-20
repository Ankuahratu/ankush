package Genralization;

public class Test {
	public static  Object getcoffee(String input) {
		if(input.equalsIgnoreCase("coffee")) {
			return new Coffee("expresso",99);
		}else if(input.equalsIgnoreCase("tea")) {
			return new tea("lemon",15);
		}
		return null;
	}
	public static void main(String[] args) {
		Object x=getcoffee("Coffee");
		System.out.println(x);
		Object y=getcoffee("tea");
		System.out.println(y);
		
	}

}
