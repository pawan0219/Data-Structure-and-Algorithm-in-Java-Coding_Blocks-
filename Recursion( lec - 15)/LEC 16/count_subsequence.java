public class count_subsequence {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.println("/n" + count(ques, ""));
    }

    public static int count(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans + " ");
            return 1;
        }
        char ch = ques.charAt(0);  //0
        int c1 = count(ques.substring(1), ans);  //no
        int c2 = count(ques.substring(1), ans + ch);  //yes
        return c1 + c2;
    }
}
