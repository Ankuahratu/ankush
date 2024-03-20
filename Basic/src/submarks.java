
public class submarks {
 static void result(int phy,int chem,int math,int opt) {
	float total=phy+chem+math+opt;
	 if (chem<35 || phy<35||math<35|| opt<35 ){
		 System.out.println("fail");}
	 else {
			 double per=(total)/(400)*100;
			 System.out.println("pass");
			 
			 System.out.println(per);
			 
	 }
 }
		 public static void main(String[]args) {
			 result(35,35,35,5);
		 }
 
 
}
