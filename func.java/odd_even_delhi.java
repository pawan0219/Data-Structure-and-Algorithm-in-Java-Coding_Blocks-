import java.util.*;
public class odd_even_delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        int carno = sc.nextInt();
        if(even_sum_delhi(carno) == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        t--;
    }
    }
    public static boolean even_sum_delhi(int n){
        int sumeven = 0;
        int sumodd = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem % 2 == 0){
                sumeven += rem;
            }else {
                sumodd += rem;
            }
           n =  n / 10;
        }       
        if(sumeven % 4 == 0 || sumodd % 3 == 0){
            return true;
        } else {
            return false;
        }
    }
}
