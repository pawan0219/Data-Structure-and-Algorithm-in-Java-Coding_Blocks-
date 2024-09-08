package sorting;

public class demo_selection {
    public static void main(String[] args) {
        int[] arr = {4,-1,5,3,2,1};
            System.out.print(min_index(arr, 2)); 
    }
    public static int min_index(int[] arr, int idx){
        int mini = idx;
        for(int i = idx + 1; i < arr.length; i++ ){
            if(arr[i] < arr[mini]){
                mini = i;
            }
        }
        return mini;
    } 
}
