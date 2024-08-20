public class string_addition {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "bye";
        String s = "kaju" + " " + s2;
        String s5 = "kaju" + "katli";
        String s3 = s1.concat(s2);
        System.out.println(s);
        System.out.println(s3);
        System.out.println("hey" + 10 + 30 + "bye" + 4 + 2);
        System.out.println(2 + 3 + "bye" + 5 + 5);
        System.out.println("hey" + (10 + 30) + "bye" + 4 + 2);
    }
}
