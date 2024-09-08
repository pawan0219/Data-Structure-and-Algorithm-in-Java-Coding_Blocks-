package Inheritance_lec_27;

public class Stack_using_queue {
    private dynamic_Queue Q;
    public Stack_using_queue() {
        Q = new dynamic_Queue();
    }
    public int size() {
        return Q.size();
    }
    public boolean isEmpty() {
        return Q.isEmpty();
    }
    public void push(int item) throws Exception {
        Q.EnQueue(item);
    }
    public int pop() throws Exception {
        dynamic_Queue q = new dynamic_Queue();
        while (Q.size() > 1) {
            q.EnQueue(Q.DeQueue());
        }
        int rv = Q.DeQueue();
        while (q.size() > 0) {
            Q.EnQueue(q.DeQueue());
        }
        return rv;
    }
    public int peek() throws Exception {
        dynamic_Queue q1 = new dynamic_Queue();
        while (Q.size() > 1) {
            q1.EnQueue(Q.DeQueue());
        }
        int rv = Q.DeQueue();
        while (q1.size() > 0) {
            Q.EnQueue(q1.DeQueue());
        }
        Q.EnQueue(rv);
        return rv;
    }
    public static void main(String[] args) throws Exception {
        Stack_using_queue s1 = new Stack_using_queue();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
    }
}
