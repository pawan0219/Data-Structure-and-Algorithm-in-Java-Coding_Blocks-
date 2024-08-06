package Array;

public class swap_3 {
        public static void main(String[] args) {
            int[] arr = {3,5,7,6,8};
            int[] other = {31,51,71,61,81};
            System.out.println(arr[0]+ " "+ other[0]);
            swap(arr, other);
            System.out.println(arr[0]+ " "+ other[0]);
         }   
         public static void swap(int arr[], int other[]){
            int []temp = arr;
            arr = other;
            other = temp;
         }
    }

