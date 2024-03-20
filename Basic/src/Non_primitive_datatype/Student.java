package Non_primitive_datatype;

public class Student {
	String name, qualification;
	int yop;
	double percent;

	public Student(String name, String qualification, int yop, double percent) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.yop = yop;
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "\nNAME:" +this.name+":"+this.qualification+"\nYOP: "+this.yop+"\npercentage:"+this.percent;
	}

}
