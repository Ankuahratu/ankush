package factors_problems;

public class prime_no_or_not {
	public static String dis(int n)
	{
		int x=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0) {
				x++;
				
			}
//System.out.println(x);			
		}
		if(x==0)   { 
			return "prime number";
			
		}
		else {
			return "not prime";
		}
	}
	public static void main(String[] args) {
		System.out.println(dis(7));
	}

}

