package oops;

public class Chaining {
	String name;
	
 Chaining(String x){
		this.name=x;
	}

}class demo extends Chaining{
  int age;
  demo(int y,String x){
	  super(x);
	  this.age= y;
	  
  }

}
class demo2 extends demo{
	 int ID;
	
	demo2(int z,String x,int y){
		super(y, x);
		this.ID=z;
	}
	
}class demo3 extends demo2{
	float sal;
	demo3(String x,int y,int z,float w){
		super(z,x,y);
		this.sal=w;
	}
	
}
