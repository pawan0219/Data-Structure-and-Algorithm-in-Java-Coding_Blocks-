package OOps.Lec_23;

public class Person_Client {
    public static void main(String[] args) {
        System.out.println("hello");
        Person p = new Person("Ankita", 22);
        System.out.println(p.GetName());
        p.SetName("Ankit");
        System.out.println(p.GetName());
        p.Setage(19);
        System.out.println(p.GetAge());
        // System.out.println(p.name);
        // System.out.println(p.age);
    }
}
