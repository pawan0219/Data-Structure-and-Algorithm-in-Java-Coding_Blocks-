package OOps.Lec_23;

public class Student_Client {
    public static void main(String[] args) {
        // ArrayList<Integer> ll = new ArrayList<>();
        System.out.println("hello");
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name = "kaju";
        s.age = 20;
        System.out.println(s.name);
        System.out.println(s.age);
        s.Intro_yourself();
        Student s1 = new Student();
        s1.name = "Raju";
        s1.age = 21;
        s1.Intro_yourself();
        s1.SayHello("Ramesh");
    }
}
