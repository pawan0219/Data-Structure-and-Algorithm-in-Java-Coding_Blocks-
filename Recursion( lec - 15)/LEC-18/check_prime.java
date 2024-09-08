
public class check_prime {
    public static void main(String[] args) {
        int n = 189;
        System.out.println(Isprime(n));
    }

    public static boolean Isprime(int n){
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
