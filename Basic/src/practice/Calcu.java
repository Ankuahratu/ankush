package practice;
import java.util.Scanner;
public class Calcu {
   public static void dis(char n, int a,int b) {
	   int res;
   switch(n) {
	case'+':System.out.println(a+b);
	  break;
	case '-':System.out.println(a-b);
	  break;
	case '*':System.out.println(a*b);
	  break;
	case '/':System.out.println(a/b);
	  break;
	  default:System.out.println("invaild option");
   
}
}
   public static void main(String[] args) {
	   Scanner ac=new Scanner(System.in);
	   System.out.println("enter a operaterion");
	   char n=ac.next().charAt(0);
	   System.out.println("enter a number a ");
	   int a=ac.nextInt();
	   System.out.println("emter 2nd number");
	   int b=ac.nextInt();
	   dis(n,a,b);
}}