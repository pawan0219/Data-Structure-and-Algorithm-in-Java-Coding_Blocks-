package sorting;

public class demo_insertion {
    public static void main(String[] args) {
         int [] arr = {2,3,11,12,6,4,5,8,9};
         sort(arr);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
    }
    public static void sort(int[] arr){ 
        for (int i = 1; i < arr.length; i++) {
            insert_last_element(arr, i);
        }
    }
    public static void insert_last_element(int[] arr, int i ){
        int item = arr[i];
        int j = arr[i - 1];
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = item;
    }
}
