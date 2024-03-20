package digit_while;

public class rev {
public static void dis(int num) {
	int res=0;
    while (num > 0) {
		int rem = num % 10;
		res=res*10+rem;
//		System.out.print(rem+" ");
		num=num/10;
	}System.out.println(res);
}
public static void main(String[] args) {
	dis(109999);
}

}
		
	


