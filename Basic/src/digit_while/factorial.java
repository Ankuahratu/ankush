package digit_while;

public class factorial {
  public static void dis(int n) {
	  int dic=0;
	  for(int i=1;i<=n;i--) {
		  dic=i*n;
		  System.out.print(dic+"  ");
		  
	  }
	  
  }
  public static void main(String[] args) {
	dis(8);
}
}
