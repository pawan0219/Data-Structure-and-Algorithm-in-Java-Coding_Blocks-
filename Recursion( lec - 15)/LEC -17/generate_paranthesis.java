import java.util.*;

public class generate_paranthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> ll = new ArrayList<>();
        paranthesis(n,0,0,"",ll);
    }

    public static void paranthesis(int n, int open, int close, String ans, List<String> ll){
        if(open == n && close == n){
            // System.out.println(ans);
            ll.add(ans);
            return;
        }
        if (open > n || close > open) {
            return;
        }
        paranthesis(n, open + 1, close, ans + "(", ll);
        paranthesis(n, open, close + 1, ans + ")", ll);
    }
}
