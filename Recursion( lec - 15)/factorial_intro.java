
public class factorial_intro {
    public static void main(String[] args) {
        int n =  4;
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if(n == 0){
            return 1;
        }
        int fn = fac(n - 1);
        return fn * n; 
    }
}
