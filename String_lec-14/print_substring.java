public class print_substring {
    public static void main(String[] args) {
        String str = "hello";
        substring(str);
    }
    public static void substring(String str){
        for (int len = 1; len < str.length(); len++) {
            for (int i = len; i <= str.length(); i++) {
                int j = i - len;
                System.out.println(str.substring(j,i));
            }
        }
    }
}
