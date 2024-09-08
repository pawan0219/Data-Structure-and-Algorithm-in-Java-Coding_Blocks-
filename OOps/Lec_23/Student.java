package OOps.Lec_23;

public class Student {
    String name;
    int age;
    public void Intro_yourself() {
        System.out.println("My Name is " + name + " and age is " + age);

    }
    public void SayHello(String name) {
        System.out.println(this.name + " say Hey " + name);
    }
}
