
public class newname {
  static String firstname(String fn) {
	  return "$%#@"+fn;
	  
  }
  static String lastname(String ln) {
	  return ln+"*****";
  }
   static void fullname(String x,String y) {
	  String  fullname=x+y;
	   
   System.out.println(fullname);
}
   public static void main(String[] args) {
	String s1=firstname("ankush");
	String s2=lastname("ratu");
	fullname(s1,s2);
}
}