package factors_problems;

public class sum_of_factors {
	
public static void dis(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			sum=sum+i;
			System.out.print(sum+"   ");}}
}
public static void main(String[] args) {
	dis(20);
}
}
