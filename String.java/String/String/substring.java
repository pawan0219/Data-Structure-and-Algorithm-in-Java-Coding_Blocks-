public class substring {
    public static void main(String[] args) {
        String s = "hellobye";
        // System.out.println(s.substring(2, 5));
        // System.out.println(s.substring(2 ));
    }
    public static void print_substring(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
