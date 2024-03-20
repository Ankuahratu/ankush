package practice;
import java.util.Scanner;
public class upper {
	static String dis(char ch) {
		if(ch=='A') {
			return "A is selected";
			
			
		}
		else if(ch=='B') {
			return "B is selected";
			
		}
		else if(ch=='C') {
			return "C is selected";
		}
		else if(ch=='D') {
			return "D is selected";
		}
		else {
			return "invalid option";
		}
		
	}
	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.println("enter char");
		char ch=ac.next().charAt(0);
		System.out.println(dis(ch));
		ac.close();
	}

}
