
public class month_years {
	static void months(int month) {
		if(month==1 ||  month==3 || month==5  ||  month==7  || month==8 ||  month==10||  month== 12) {
			System.out.println("31 days in a month");
		}
		if(month==4 ||  month==6|| month==9 ||  month==11   ) {
			System.out.println("30 days in a month");}
			if(month==2) {
				System.out.println("28 , 29days in this month");
			}
		}
		
	public static void main(String[] args) {
		months(4);
	}

}
