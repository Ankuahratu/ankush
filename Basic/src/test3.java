
public class test3 {
 public static int add(int a,int b) {
	a=dis(a);
	b=dis(b);
	return a+b;
	
}
 public static int dis(int n) {
	if(n<=10) {
	return 0;
	}else
		return n;
}
public static void main(String[] args) {
	System.out.println(add(3,11));
	add(6,9);
	
}
	}


