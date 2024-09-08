public class count {
    public static void main(String[] args) {
        int n = 5433231;
        System.out.print(countdigit(n));
    }
    public static int countdigit(int n){
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
