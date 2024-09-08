package lec_24_Queue_Stack.lec_25;

import lec_24_Queue_Stack.Queue;

public class queue_reverse {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.EnQueue(10);
        q.EnQueue(10);
        q.EnQueue(10);
        q.EnQueue(10);
        q.EnQueue(10);
        reverse(q);
        q.Display();
    }
    public static void reverse(Queue q) throws Exception  {
        if (q.isEmpty()) {
            return; 
        }
        int x = q.DeQueue();
        reverse(q);
        q.EnQueue(x);
    }
}
