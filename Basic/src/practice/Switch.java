package practice;

import java.util.Scanner;

public class Switch {
	public static void dis(int n) {
		switch(n%2) {
		case 0: System.out.println("even number");
		break;
		case 1: System.out.println("odd number");
//		default:System.out.println("odd number");
		}
	}

public static void main(String[] args) {
	Scanner ac =new Scanner(System.in);
	System.out.println("enetr a number");
	int n=ac.nextInt();
	dis(n);
}
}
