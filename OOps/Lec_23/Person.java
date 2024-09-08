package OOps.Lec_23;

public class Person {
    private String name = "kaju";
    private int age = 20;

    public Person(String name, int age) {
        this.name  = name;
        this.age  = age;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public String GetName() {
        return this.name;
    }
    public void Setage(int age) {
        this.age = age;
    }
    public int GetAge() {
        return age;
    }
    // public Person() {

    // }
}
