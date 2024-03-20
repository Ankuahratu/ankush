package practice;

public class bike {
	String model;
	String colour;
	int price;
	bike(String m,String c,int p){
		this.model=m;
		this.colour=c;
		this.price=p;
		
	}
void details() {
	System.out.println("model ="+this.model);
	System.out.println("colour ="+this.colour);
	System.out.println("price ="+this.price);
	float tax=this.price*0.18f;
	float insurance=1800*5;
	System.out.println(tax);
	System.out.println(insurance);
}
public static void main(String[] args) {
	bike b1=new bike("splendor","black",100000);
	bike b2=new bike("passion+","blue",85000);
	b1.details();
	b2.details();
}
}
