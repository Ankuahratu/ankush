package oops;

public class Student extends person {
		String collagename;
		int rollno;
		double marks;

		Student(String name, int age, char gender, String collagename, int rollno, double marks) {
	super(name ,age,gender);
			this.collagename = collagename;
			this.rollno = rollno;
			this.marks = marks;
		}

	}

	