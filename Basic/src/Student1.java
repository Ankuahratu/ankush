public class Student1 {
    String name;
    String qualification;
    int yop;
    int phone;
    String mail;

    Student1(String n, String q, int y, int p, String m) {
        this.name = n;
        this.qualification = q;
        this.yop = y;
        this.phone = p;
        this.mail = m;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Adi", "10th", 2016, 123456789, "adhi12@mailcom");
        Student1 s2 = new Student1("ankush", "degree", 2024, 123322, "ankush@.com");
        
        System.out.println(s1.name + s1.qualification + s1.yop + s1.phone + s1.mail);
        System.out.println(s2.name + s2.qualification + s2.yop + s2.phone + s2.mail);
    }
}
