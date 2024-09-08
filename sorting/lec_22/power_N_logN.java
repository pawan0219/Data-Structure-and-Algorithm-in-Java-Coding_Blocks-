package sorting.lec_22;

public class power_N_logN {
    public static void main(String[] args) {
        int a = 3;
        int n = 9;
        System.out.println(pow(a, n));
    }
    public static int pow(int a, int n){
        if (n == 1) {
            return a;
        }
        int ans  = pow(a, n / 2);
        ans = ans * ans;
        if (n % 2 != 0) {
            ans *= a;
        }
        return ans;
    }
}
