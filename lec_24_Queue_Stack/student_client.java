package lec_24_Queue_Stack;

public class student_client {

    public static void main(String[] args) {
        student s = new student("Raju", 22);
        System.out.println("Bye");
        s.setAge(-9);
        System.out.println(s.getAge());
        System.out.println("Hello");
    }
}
