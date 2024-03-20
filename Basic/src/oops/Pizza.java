package oops;

public class Pizza {
	String type="regular";
	int price=150;
	boolean cheese ;
	String topings1;
	String topings2;
	Pizza(boolean ch){
		this.cheese=ch;
		if(ch==true) {
			this.price=this.price+80;

		}
	}
	Pizza(boolean ch,String t1){
		this.cheese=ch;
		this.topings1=t1;
		this.price=this.price+40;
		if(ch==true) {
			this.price=this.price+80;
		}
	}
	Pizza(boolean ch,String t1,String t2){
		this.cheese=ch;
		this.topings1=t1;
		this.topings2=t2;
		this.price=this.price+75;
		if(ch==true) {
			this.price=this.price+80;
		}

	}
	void bill()
	{
		System.out.println("TYPE = " +this.type);
		System.out.println("PRICE = " +this.price);
		System.out.println("chesse = " +this.cheese);
		System.out.println("TOPINGS = " +this.topings1);
		System.out.println("TOPINGS = " +this.topings2);
		float gst=this.price*0.18f;
		float total=this.price+gst;
		System.out.println("GST ="+gst);
		System.out.println("TOTAL PRICE = "+ total);


	}
	public static void main(String[] args) {
		Pizza p1=new Pizza(false);
		Pizza p2=new Pizza(true,"paneer");	
		Pizza p3=new Pizza(true,"paneer","onion");	
		p3.bill();
	}

}
