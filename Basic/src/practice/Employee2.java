package practice;
import oops.Employee;
public class Employee2 {
public static void main(String[] args) {
	Employee e1=new Employee(01,"ANKUSH",22);
	System.out.println("EMPLOYEE ID ="+e1.getId());
	System.out.println("EMPLOYEE NAME ="+e1.getName());
	System.out.println("EMPLOYEE AGE ="+e1.getAge());
	System.out.println();
	//update or write data
	e1.setId(02);
	e1.setName("divyam");
	e1.setAge(23);
	System.out.println("EMPLOYEE ID ="+e1.getId());
	System.out.println("EMPLOYEE NAME ="+e1.getName());
	System.out.println("EMPLOYEE AGE ="+e1.getAge());
	System.out.println();
	e1.setId(03);
	e1.setName("Aditya");
	e1.setAge(21);
	System.out.println("EMPLOYEE ID ="+e1.getId());
	System.out.println("EMPLOYEE NAME ="+e1.getName());
	System.out.println("EMPLOYEE AGE ="+e1.getAge());
	
}
}
