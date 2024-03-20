
public class chain2 {
	static int chain(int x,int y) {
		return x+y;
		
	}
	static void addchain(int a,int b) {
		int name=chain(a,b);
		float add=name/a*b *100.0f;
		System.out.println(add);
	}
	public static void main(String[] args) {
		addchain(4,6);
	}
	

}
