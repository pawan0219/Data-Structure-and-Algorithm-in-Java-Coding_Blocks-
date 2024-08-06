package Array;

public class max_value {
    public static void main(String[] args) {
        int[] arr = {3,5,6,4,1};
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > m){
                m = arr[i];
            }
        }
        return m ;
    }
}
// public static int max1(int arr[]){
//     int m = Integer.MIN_VALUE;               -2^31
//     int m = Integer.MIN_VALUE;                -2^31 - 1        
//     for (int i = 0; i < arr.length; i++) {
//         if(arr[i] > m){
//             m = arr[i];


//     m = Math.max(m , arr[i] );
            