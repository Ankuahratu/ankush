package practice;
import java.util.Scanner;
public class Upper1 {
		static String dis(char ch) {
			if(ch=='A'||ch=='B'||ch=='D'||ch=='D'||ch=='a'||ch=='b'||ch=='c'||ch=='d') {
				return ch+" is selected";
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


