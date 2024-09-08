public class reverse_num {
    public static void main(String[] args) {
        int n = 2346;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n/10;
        }
        System.out.print("sum");
    }
}
