import java.util.*;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        Partitioning(ques, ll, ans);
        System.out.println(ans);
    }
    public static void Partitioning(String ques, List<String> ll, List<List<String>> ans){
        if(ques.length() == 0){
            // System.out.println(ans);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (Palindrome(s)) {
                ll.add(s);
            Partitioning(ques.substring(i), ll, ans); 
            ll.remove(s);                  
           }
        }
    }
    public static boolean Palindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
