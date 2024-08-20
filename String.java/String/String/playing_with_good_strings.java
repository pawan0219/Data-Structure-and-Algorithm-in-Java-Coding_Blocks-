import java.util.*;
public class playing_with_good_strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            System.out.println(longest_good_strings(s));
        }
    }
    public static int longest_good_strings(String s){
        int ans = 0; 
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isvowel(ch) == true){
                count++;
            }else{
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
    public static boolean isvowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
