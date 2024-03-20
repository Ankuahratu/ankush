package Arrayprograms;

public class two_threee {
	public static boolean check(int [] num) 
  {
	  
	  if(num[0]==2 || num[0]==3   || num [1]==2   || num[1]==3)
	  {
	   return true;
	   }
	  else 
	  {
		  return false;
		  }
	  
  }
	public static void main(String[] args) {
		int[] num= {1,1114};
		System.out.println(check(num));
	}
}
