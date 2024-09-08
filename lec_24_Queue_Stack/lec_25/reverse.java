package lec_24_Queue_Stack.lec_25;

import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
            Reverse(st);
        }
    public static void Reverse(Stack<Integer> st){
            if (st.isEmpty()) {
                return;
            }
            int x = st.pop();
            Reverse(st);
            Insert(st, x);
    }
    public static void Insert(Stack<Integer> st, int item){
        if (st.empty()) {
            st.push(item);
            return;
        }
        int x = st.pop();
        Insert(st, item);
        st.push(x);
    }
}
