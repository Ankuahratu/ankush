
public class Student3 {
   String name;
   int physics;
   int chemistry;
   int maths;
   int op;
   Student3(String n,int p,int c,int m,int o){
	   this.name=n;
	   this.physics=p;
	   this.chemistry=c;
	   this.maths=m;
	   this.op=o;
	   
   }
   void marks() {
	   System.out.println(this.name);
	   System.out.println(this.physics);
	   System.out.println(this.chemistry);
	   System.out.println(this.maths);
	   System.out.println(this.op);
	   
   }
   void per() {
	   float sum= physics+chemistry+maths+op;
	   float percent=(sum/400)*100.0f;
	   System.out.println(percent);
   }
   void total() {
	   float total=physics+chemistry+maths+op;
	   System.out.println(total);
	   
   }
   void details() {
	   marks();
	   per();
	   total();
   }
   public static void main(String[] args) {
	Student3 s1=new Student3("ankush",78,87,96,67);
     s1.details();
     Student3 s2=new Student3("aditya",76,77,86,69);
     s2.details();
     Student3 s3=new Student3("DIVU",58,57,57,57);
     s3.details();
}
   
   
   
}
