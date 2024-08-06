package Array;
import java.util.*;
public class jagged_array {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int [][] arr = new int [n][];
        
        //take input
        for (int i = 0; i < arr.length; i++) {
            int c = sc.nextInt();  //coln
            arr[i] = new int[c];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
}
