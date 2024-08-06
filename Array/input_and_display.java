package Array;
import java.util.Scanner;
public class input_and_display {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();//row
    int m = sc.nextInt();   //coln
    int[] [] arr = new int[n][m];
    System.out.println(arr[2][3]);

    //take input
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    //print
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.println(arr[i][j] + " ");
        }
        System.out.println();
    }
    }
}
