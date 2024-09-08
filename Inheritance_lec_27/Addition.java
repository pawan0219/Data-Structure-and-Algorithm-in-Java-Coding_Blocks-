package Inheritance_lec_27;

public class Addition {
    public static void main(String[] args) {
        System.out.println(add(2, 8));
        System.out.println(add(2, 8, 7));
        System.out.println(add(2, 8.6, 7));
        System.out.println(add(2, 8, 7, 54, 5, 6, 5, 8, 96, 45, 63, 23, 11, 23, 22, 20, 79));
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, double b, int c) {
        return (int) (a + b + c);
    }
    public static int add(int y, int ...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
