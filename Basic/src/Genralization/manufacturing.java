package Genralization;

public class manufacturing {

	public static Apple getApple() {
		return new Apple();

	}
	public static samsung getSamsung() {
		return new samsung();
	}
	public static void main(String[] args) {
		
		Apple x=getApple();
		System.out.println(x);
		samsung y=getSamsung();
		System.out.println(y);
	}
}
