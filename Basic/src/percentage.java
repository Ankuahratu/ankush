

public class percentage {
	static void getprice(int p1,int p2,int p3,int p4 ) {
		float price =p1+p2+p3+p4;
		float discount=0;
		
	     discount=price*0.10f;
		if (price>=2000);		{
		 discount=price*0.20f;		}
		float total =price-discount;
         System.out.println(price);
			System.out.println(discount);
			System.out.println(total);
	}
		public static void main(String[] args) {
			getprice(500,500,500,500);
		}
			
		}
		
//	if(price<2000);
//     
//		discount=price*10/100.f;
//        if( price >2000);
//        {discount=price*0.20f;}
//        float total=price-discount;
//        System.out.println(price);
//        System.out.println(discount);
//        System.out.println(total);}
//	 public static void main(String[] args) {
//		getprice(500,500,500,500);
//	}
//}