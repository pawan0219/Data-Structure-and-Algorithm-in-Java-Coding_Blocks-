//for 1-D
// import java.util.*;
// public class array {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size  = sc.nextInt();
//         int [] numbers = new int[size];

//         for(int i= 0; i<size; i++){
//              numbers[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();

//         for(int i = 0; i<numbers.length; i++){
//             if(numbers[i] == x){
//                 System.out.println("X is found : " +i);
//             }
//         }
//     }
// }


//FOR 2-D
import java.util.*;
public class array {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [] [] numbers = new int [rows] [cols];

        //input
        for(int i = 0; i<rows; i++ ){
            for(int j =0; j< cols; j++){
                numbers [i] [j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for(int i = 0; i< rows; i++){
            for( int j = 0; j< cols; j++){
                if( numbers [i] [j] == x){
                    System.out.print("X is found ( " + i + "," + j + ")");
                }
            }
        }

    }
}