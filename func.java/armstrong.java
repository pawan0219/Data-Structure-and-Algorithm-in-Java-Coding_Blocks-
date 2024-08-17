public class armstrong {
    public static void main(String[] args) {
        int n = 371;
        System.out.println(Armstrong(n));
    }
    public static boolean Armstrong(int n ){
        int c = countofdigits(n);
        int sum = 0;
        int p = n;
        while(n > 0){
        int rem = n % 10;
        sum = (int) (sum + Math.pow(rem, c));
        n = n / 10;
    }
    if(sum == p){
        return true;
    }else{
        return false;
    }
}
    public static int countofdigits(int n){
        int count = 0;
        while(n > 0){
            count++;
        n = n / 10;
        }
        return count;
    }
}
