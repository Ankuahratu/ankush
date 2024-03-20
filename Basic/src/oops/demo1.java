package oops;

public class demo1 {
	private int id;
   private String name;
   private double marks;
public demo1(int id, String name, double marks) {
	this.id = id;
	this.name = name;
	this.marks = marks;
}//initializing using blocks
/*{
	  this.name="ankush";
	  this.  id=6;
	  this . marks=78.0;
	  }*/
public int getId() {
	return this.id;
	
}
   public void setId(int id) {
	   this.id=id;
   }
   public String getName() {
		return this.name;
		
	}
	   public void setName(String name) {
		   this.name=name;
	   }
	   public double getMarks() {
			return this.marks;
			
		}
		   public void setMarks(int marks) {
			   this.marks=marks;
		   }
		  

}
