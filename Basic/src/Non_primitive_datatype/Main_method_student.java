package Non_primitive_datatype;

public class Main_method_student {
	public static void main(String[] args) {
		Student s1 = new Student("Ankush", "b-tech", 2024, 75.0);
		Student s2 = new Student("dIVYAM", "CSE", 2023, 72.0);
		Student s3 = new Student("aditya", "b-tech", 2022, 85.0);
		Student s4 = new Student("daman", "b-tech", 2021, 89.0);
		Student s5 = new Student("deepak", "CSE", 2020, 87.0);
		Student s6 = new Student("guleria", "b-tech", 2019, 65.0);
		Student s7 = new Student("sunny", "b-tech", 2015, 66.0);
		
		Student[] x= {s1,s2,s3,s4,s5,s6,s7};
		for(int i=0;i<=x.length-1;i++) {
			String S=x[i].qualification;
//			if(S.equalsIgnoreCase("cse"))
			if(x[i].yop<2020 && x[i].percent<90)
			
			System.out.println(x[i]);
		}
	}
}
