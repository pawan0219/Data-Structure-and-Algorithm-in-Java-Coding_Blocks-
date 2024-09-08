package lec_24_Queue_Stack;

import java.util.Stack;

public class stack_java {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());  //50
        System.out.println(st.pop());  //50
        System.out.println(st.peek());  //40
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        for (int v : st) {
            System.out.println(v + " ");
        }
    }
}
