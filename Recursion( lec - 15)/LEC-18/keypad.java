public class keypad {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        
        String ques = "23";
        key_pad(ques, "");
    }

    public static void key_pad(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);   // '2'
        String press = key[ch - '0']; // abc
        for (int i = 0; i < press.length(); i++) {
            key_pad(ques.substring(1) , ans + press.charAt(i));
        }
    }
}
