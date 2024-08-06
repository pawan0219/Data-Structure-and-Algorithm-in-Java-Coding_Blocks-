package Array;

public class demo_kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {2,3,-6,4,-1,7};
        System.out.print(maximum_sum(arr) + " ");
    }
    public static int maximum_sum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                ans = Math.max(ans, sum);
                if (sum < 0) {
                    sum = 0;
                }
            }
        return ans;
    }
}
