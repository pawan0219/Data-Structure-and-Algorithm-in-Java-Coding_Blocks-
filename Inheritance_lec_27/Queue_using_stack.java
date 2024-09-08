package Inheritance_lec_27;

import java.util.Stack;

public class Queue_using_stack {
    private Stack<Integer> st;
    public Queue_using_stack() {
        st = new Stack<>();
    }
    public boolean isEmpty() {
        return st.isEmpty();
    }
    public int size() {
        return st.size();
    }
    public void Enqueue(int item) {
        Stack<Integer> s = new Stack<>();
        while (!st.isEmpty()) {
            s.push(st.pop());
        }
        st.push(item);
        while (!s.isEmpty()) {
            st.push(s.pop());
        }
    }
    public int DeQueue() {
        return st.pop();
    }
    public int getfront() {
        return st.peek();
    }
    public static void main(String[] args) {
        Queue_using_stack Q = new Queue_using_stack();
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);
        System.out.println(Q.DeQueue());
        System.out.println(Q.getfront());
    }
}
