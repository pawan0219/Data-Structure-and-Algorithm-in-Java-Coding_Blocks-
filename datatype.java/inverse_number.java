import java.util.*;
public class inverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pos = 1;
        while(n > 0){
            int rem = n % 10;
            sum = (int) (sum + pos * Math.pow(10, rem - 1));
            // sum += pos * Math.pow(10, rem - 1);
            n = n/10;
           pos++;
        }
        System.out.println(sum);
    }
}
