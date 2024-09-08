public class fact_tail {
    public static void main(String[] args) {
        int n =  4;
        System.out.println(fac(n,1));
    }
    public static int fac(int n, int ans){
        if(n == 0){
            return ans;
        }
        // int fn = fac(n - 1);
        return fac (n-1 , ans * n) ; 
    }
}
