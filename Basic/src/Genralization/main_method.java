package Genralization;

public class main_method {
	public static void main(String[]args) {
		Coffee c1=new Coffee("cold",15);
		Coffee c2=new Coffee("hot",99);
		Coffee c3=new Coffee("expresso",150);
		tea t1 =new tea("ginger",15);
		tea t2 =new tea("simple",12);
		tea t3 =new tea("lemon",15);
		
		Object [] x= {c1,c2,c3,t1,t2,t3};
		for(int i=0;i<=x.length-1;i++) {
			System.out.println(x[i]);
			
		}
		System.out.println();
	}
	
}
