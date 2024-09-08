package lec_24_Queue_Stack;

public class student {
        private String name = "Kaju";
        private int age = 21;
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try{
        if (age < 0) {
            throw new Exception ("age -ve nahi ho sakta");
        }
        this.age = age;
    }
    catch (Exception e){
        e.printStackTrace();
    } finally {
        System.out.println("I am in finally block");
        // System.exit(1);
    }
}
    // public void setAge(int age) throws Exception{
    //     if (age < 0) {
    //         throw new Exception ("age -ve nahi ho sakta");
    //     }
    //     this.age = age;
    // }
}
