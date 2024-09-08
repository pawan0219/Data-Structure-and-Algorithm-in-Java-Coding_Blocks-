package lec_24_Queue_Stack.lec_25;

import java.util.Stack;

public class leetcode_2375 {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(Construct_Smaller(s));
    }
    public static String Construct_Smaller(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n + 1];
        int c = 1;
        for (int i = 0; i <= n; i++) {
            if (i == n || s.charAt(i) == 'I') {
                ans[i] = c;
                c++;
                while (!st.isEmpty()) {
                    ans[st.pop()] = c;
                    c++;
                }
            } else {
                st.push(i);
            }
        }
        String str = "";
            for (int j = 0; j < ans.length; j++) {
                str += ans[j];
            }
            return str;
        }
}
