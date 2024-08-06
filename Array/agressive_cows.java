package Array;
import java.util.*;
public class agressive_cows {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int  t = sc.nextInt();
    while (t-- > 0) {
   
    int nos = sc.nextInt();
    int noc = sc.nextInt();
    int[] stall = new int[nos];
    for (int i = 0; i < stall.length; i++) {
        stall[i] = sc.nextInt();
    }
    Arrays.sort(stall);       //for sorting
    System.out.println(min_distance(stall, noc));
    }     
}
    public static int min_distance(int[] stall, int noc){
        int lo = 0;
        int hi = stall[stall.length - 1] - stall[0];                  // 9 - 1
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(isitsafe(stall,noc, mid) == true){
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isitsafe(int[] stall, int noc, int mid){
        int cow = 1;
        int pos = stall[0];
        for (int i = 1; i < stall.length; i++) {
            if ((stall[i] - pos) >= mid) {
            cow++;
            pos = stall[i];
        }
        if (cow == noc) {
            return true;
        }
    }
    return false;
}
}
