package CASTING;

public class Test {
	
		public static void main(String[] args) {
			Watch w1 = new Watch("mi", 5999);
			Watch w2 = new Watch("realmi", 6999);
			Student s1 = new Student("ankush", "B-tech");
			Student s2 = new Student("sunny", "BCA");

			Object x[] = { w1, s1, w2, s2 };
			Object a1 = x[0];
			Watch x1 = (Watch) a1;
			System.out.println(x1);
			Object a2 = x[1];
			Student x2 = (Student) a2;
			System.out.println(x2);
			Object a3 = x[2];
			Watch x3 = (Watch) a3;
			System.out.println(x3);
			Object a4 = x[3];
			Student x4 = (Student) a4;
			System.out.println(x4);
		}
	}


