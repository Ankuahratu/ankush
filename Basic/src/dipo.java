
public class dipo {
	static void deposite(float balance, float amount,boolean pancard) {
		
		float balence = amount+balance;
			if(balence<100000  || pancard==true) {
				System.out.println("pancard is not required link you pan");
				System.out.println("new updated account is:"+balence);
			}
			else{
				System.out.println("pancard required link you pan ");
				
				
			}
			
		}
	public static void main(String[] args) {
		deposite(500,200,false);
		
	}
			
}
