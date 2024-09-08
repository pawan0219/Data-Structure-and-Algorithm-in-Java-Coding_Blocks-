public class replace {
    public static void main(String[] args) {
        int n = 102;
       System.out.print(repzero(n));

    }
    public static int repzero(int n){
        if(n == 0){
            return 5;
        }
        int sum = 0;
        int multi = 1;
        while(n > 0){
            int rem = n % 10;
            if( rem == 0){
                rem = 5;
            }
        sum = sum + rem *multi;
        multi *= 10;
        n = n / 10;
        }
        return sum;
    }
}
