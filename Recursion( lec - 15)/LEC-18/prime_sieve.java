
public class prime_sieve {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sieve_of_eratosthenes(n));
    }
    // 0 --> index is prime no.
    // 1 --> index is not prime
    public static int sieve_of_eratosthenes(int n){
        int[] prime = new int[n + 1];
        prime[0] = 1;   // not prime number
        prime[1] = 1;   // not prime number
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == 0) {
                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = 1;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < prime.length; i++) {
            if(prime[i] == 0){
                c++;
            }
        }
        return c;
    }
}
