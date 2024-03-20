package Genralization;

public class Student {
    String name;
    String qalification;
    double percentage;
	public Student(String name, String qalification, double percentage) {
		this.name = name;
		this.qalification = qalification;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student name=" + name + "qalification=" + qalification + " percentage=" + percentage ;
	}
}
