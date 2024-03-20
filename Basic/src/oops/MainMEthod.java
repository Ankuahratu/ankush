package oops;

public class MainMEthod {
	
		public static void main(String[] args) {
	       person p1=new person("ankush",22,'M');
	       System.out.println("NAME OF PERSON ="+p1.name);
	       System.out.println("AGE OF PERSON ="+p1.age);
	       System.out.println("GENDER OF PERSON ="+p1.gender);
	       System.out.println();
	       System.out.println();
	       System.out.println();
	       
	       Employee5 E1=new Employee5("ankush",22,'M',01,50000.0,4);
	       
	       System.out.println("NAME OF emp ="+E1.name);
	       System.out.println("AGE OF emp ="+E1.age);
	       System.out.println("GENDER OF emp="+E1.gender);
	       System.out.println("id OF EMP ="+E1.id);
	       System.out.println("salary OF EMP ="+E1.sal);
	       System.out.println("EXPERIANCE OF EMP ="+E1.ex);
	       System.out.println();
	       System.out.println();
	       System.out.println();
	       
	       
	       Student S1=new Student("rishu",15,'M',"SBSSU",01,78.0);
	       System.out.println("NAME OF STUDENT ="+S1.name);
	       System.out.println("AGE OF STUDENT ="+S1.age);
	       System.out.println("GENDER OF STUDENT="+S1.gender);
	       System.out.println("COLLAGE NAME OF STUDENT ="+S1.collagename);
	       System.out.println("ROLLNO OF STUDENT ="+S1.rollno);
	       System.out.println("MARKS OF STUDENT ="+S1.marks);
	       
		}

	}


