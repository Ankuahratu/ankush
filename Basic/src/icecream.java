
public class icecream {
	static void getprice(int flavourcode,boolean topings,boolean dryfruits) {
		int price=0; String flavour=null;
		if( flavourcode==1)	{
			price =100; flavour = "vanila";}
		if( flavourcode==2)	{
			price =125; flavour = "Dragon";}
			if( flavourcode==3)	{
					price =140; flavour = "kiwi";}
				if( topings==true)	
					{price =price+10; }
				if( dryfruits==true)	
					{price =price+15;}
			
			float gst=price*0.18f;
			float total=price+gst;
			System.out.println(flavour);
			System.out.println(price);
			System.out.println(gst);
			System.out.println(total);


			}
	
	
	public static void main(String[] args) {
		getprice(1,false,true);
	}

}

