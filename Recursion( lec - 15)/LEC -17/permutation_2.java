
public class permutation_2 {
    public static void main(String[] args) {
        String ques = "abac";
        print(ques, "");
    }
    public static void print(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (Ispresent(ques, ch, i + 1) == false) {
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i + 1);
            print(s1 + s2, ans + ch);
        }
    }
    }
    public static boolean Ispresent(String s, char ch, int i ){
        for (int j = i; j < s.length(); j++) {
            if(s.charAt(j) == ch){
                return true;
            }
        }
        return false;
    }
   
}
