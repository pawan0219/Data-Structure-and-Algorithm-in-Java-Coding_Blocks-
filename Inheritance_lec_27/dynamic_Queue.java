package Inheritance_lec_27;

import lec_24_Queue_Stack.Queue;

public class dynamic_Queue  extends Queue{
    @Override
    public void Enqueue (int item) throws Exception {
        if (isfull()) {
            int[] a = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                int idx = (front + i) % arr.length;
                a[i] = arr[idx];
            }
            arr = a;
            front = 0;
        }
        super.EnQueue(item);
    }
    public static void main(String[] args) throws Exception {
        dynamic_Queue dq = new dynamic_Queue();
        dq.EnQueue(10);
        dq.EnQueue(20);
        dq.EnQueue(30);
        dq.EnQueue(40);
        dq.EnQueue(50);
        System.out.println(dq.DeQueue());
        System.out.println(dq.DeQueue());  
        dq.EnQueue(60);
        dq.EnQueue(70);
        dq.EnQueue(80);
        dq.Display();
    }
}
