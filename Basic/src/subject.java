import java.util.Scanner;
public class subject {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER FIRST SUBJECT MARKS");
		int english=input.nextInt();
		System.out.println("ENTER second SUBJECT MARKS");
		int chemistry=input.nextInt();
		System.out.println("ENTER thired SUBJECT MARKS");
		int physics =input.nextInt();
		System.out.println("ENTER fourth SUBJECT MARKS");
		int hindi=input.nextInt();
		System.out.println("ENTER fifth SUBJECT MARKS");
		int paint=input.nextInt();
		int sum=english+chemistry+physics+hindi+paint;
    	double per =(sum/500.0)*100;
//		float per =(sum/500.0f)*100;
		System.out.println("total percent of the student");
		System.out.println(per);




	}

}
