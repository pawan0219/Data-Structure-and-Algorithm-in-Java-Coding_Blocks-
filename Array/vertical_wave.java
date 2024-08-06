package Array;

public class vertical_wave {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{10,12,13,15}};
        print(arr);
    } 
    public static void print(int[][] arr){
        for( int coln = 0; coln < arr[0].length;coln++){
            if(coln % 2 == 0){
                for(int row = 0; row < arr.length; row++){
                    System.out.print(arr[row][coln] + " ");
                }
            }else{
                for(int row = arr.length - 1; row >= 0; row++ ){
                    System.out.print(arr[row][coln]);
                }
            }
        }
    }
}