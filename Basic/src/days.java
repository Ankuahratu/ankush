
public class days {
	static void weekday(int day) {
		if(day==1||day==7) {
			System.out.println("weekend");
		}
		if(day>7||day<1) {
			System.out.println("invalid");}
		if(day==2 || day==3 || day==4 || day==5 || day==6) {
			System.out.println("weekdays");
		}
			
			
		}
	public static void main(String[] args) {
		weekday(1);
	}

}
