package Array;

public class array1 {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println(arr);
        int[] other = arr;
        arr[0] = 10;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(other.length);
    }
    
}
