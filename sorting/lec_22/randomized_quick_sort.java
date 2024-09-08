package sorting.lec_22;

import java.util.Random;

public class randomized_quick_sort {
    public static void main(String[] args) {
        int [] arr = {5, 7, 2, 1, 8, 3, 4};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int[] arr, int si, int ei){
        if (si >= ei) {
            return;
        }
        int idx = Partition(arr, si, ei);
        sort(arr, si, idx - 1);
        sort(arr, idx + 1, ei);
    }
    public static int Partition(int[] arr, int si, int ei){

        Random rn = new Random();
        int ri = rn.nextInt(ei - si) + si;
        int t = arr[ri];
        arr[ri] = arr[ei];
        arr[ei] = t;

        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = temp;
        return idx;
    }
}
