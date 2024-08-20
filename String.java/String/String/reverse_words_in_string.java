import java.util.Scanner;

public class reverse_words_in_string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // String s = sc.nextLine();
            // System.out.println(s);
            String s = "  hello world";
            System.out.println(reverse_words(s));
            // s.trim();  //for removing space (both front or rear)
    
  }   
}
       public static String reverse_words(String s){
            s = s.trim();
            String[] arr = s.split("\s+");
            String ans = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                ans = ans + arr[i] +" ";
            }
        return ans.trim();
    }
}

