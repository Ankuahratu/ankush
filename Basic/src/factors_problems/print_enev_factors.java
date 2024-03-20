package factors_problems;

public class print_enev_factors {
	public static void dis(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0 && i%2==0) {
				
				System.out.print(i+" ");}}
	}
	public static void main(String[] args) {
		dis(20);
	}

}


