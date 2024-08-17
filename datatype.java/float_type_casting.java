import java.util.Scanner;

public class float_type_casting {
    public static void main(String[] args) {
        float f = (float) (8.9);
        // float f = 8.9f;          it doesn't vhange value
        System.out.println(f);
        double d = 8.9;
        System.out.println(d);
        Scanner sc = new Scanner(System.in);
        f = sc.nextFloat();
        d = sc.nextDouble();
    }
}
