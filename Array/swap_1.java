package Array;

public class swap_1 {
 public static void main(String[] args) {
    int[] arr = {3,5,7,6,8};
    System.out.println(arr[0]+ " "+ arr[1]);
    swap(arr[0] , arr[1]);
    System.out.println(arr[0]+ " "+ arr[1]);
 }   
 public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
 }
}
