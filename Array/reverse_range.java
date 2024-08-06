package Array;

public class reverse_range {
    public static void main(String[] args) {
        int[] arr = {3,5,9,7,8,1,2,11,12,31,65,85,95,74,53,65,};
        reverse(arr, 4 , 14);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverse(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
