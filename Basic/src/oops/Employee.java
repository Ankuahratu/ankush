package oops;

public class Employee {
	private int id;
	private String name;
	private int age;
	public Employee(int id,String name,int age){

		this.id=id;
		this.name=name;
		this.age=age;
	}
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
	public int getAge() {
		if(age>0 && age<100) {
			this.age=age;
		}else {
			System.out.println("invalid age");
		}
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;

	}

}


