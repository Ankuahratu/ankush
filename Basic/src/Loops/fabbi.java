package Loops;

public class fabbi {
	static void dis(int n) {
	int n1=1;
	int n2=1;
	for(int i=1;i<=n;i++) {
		int n3 =n1+n2;
		n1=n2;
			n2=n3;
	}
System.out.println((n2-n1)+" ");
}
	public static void main(String[] args) {
		dis(10);
	}
}