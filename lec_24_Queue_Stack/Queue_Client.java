package lec_24_Queue_Stack;

public class Queue_Client {
    public static void main(String[] args) throws Exception{
        Queue q = new Queue();
        q.EnQueue(10);
        q.EnQueue(20);
        q.EnQueue(30);
        q.EnQueue(40);
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        q.EnQueue(50);
        q.EnQueue(60);
        q.Display();
    }
}
