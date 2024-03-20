package oops;

public class car {
	String name,colour;
	int price ,cc;
	car(String n,String c,int p ,int cc){
		this.name=n;
		this.colour=c;
		this.price=p;
		this.cc=cc;
	}
	float gettax() {

		float tax=0;
		if(tax<1000000) {
			tax=price*(17.0f/100);
		}
		else if(tax>=1000000 && tax<2000000) {
			tax=price*(21.0f/100);
		}	else if(tax>=2000000 && tax<5000000) {
			tax=price*(26.0f/100);
		}else {
			tax=price*(.0f/100);
		}
		return  tax;

	}
	int getinsurance() {
		int insurance=0;
		if (cc<1000) {
			insurance=2399;}
		else if(cc>=1000&&cc<2000) {
			insurance=3799;	
		}	else if(cc>=2000&&cc<3000) {
			insurance=5799;	
		}
		else {
			insurance=7499;	
		}


		return insurance;
	}
	void details() {
		System.out.println("NAME="+this.name);
		System.out.println("colour="+this.colour);
		System.out.println("price="+this.price);
		System.out.println("cc="+this.cc);
		int insurance=getinsurance();
		float tax=gettax();
		int insurance_5y= insurance*5;
		System.out.println("TAX="+tax);
		System.out.println("INSURANCE="+insurance);
		System.out.println(" insurance_5y="+insurance_5y);
		System.out.println("total price="+(price+tax+insurance_5y));


	}
	public static void main(String[] args) {
		car c1=new car("VERNA","BALCK",1375000,1300);
		car c2=new car("I20","white",800000,1200);
		c1.details();
	}

}
