import java.util.Scanner;

public class cb_number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); 
            for (int i = 0; i <= n; i++) { 
                String s = sc.next();
                print(s);
            }
        }
       

    }
    public static void print(String s){
        int count = 0;
        boolean visited [] = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {     //substring
            for (int j = len; j <= s.length(); j++) {
            int i = j - len;
            String str = s.substring(i, j);
            if(is_cb_number(Long.parseLong(str)) == true && is_valid(visited, i, j -1) == true){
                count++;
                for(int k = i; k < j; k++){
                    visited[k] = true;
                }
            }
            } 
        }
        System.out.println(count);
    }
    public static boolean is_valid(boolean[] visited, int i, int j){
        for(int k = i; k <= j; k++){
            if(visited[k] == true){
                return false;
            }
        }
        return true;
    }
    public static boolean is_cb_number(Long num){
        int [] arr = {2 ,3, 5, 7 ,11 ,13, 17 , 19 , 23, 29};
        // point 1
        if (num == 0 || num == 1){
            return false;
        }
        //point 2
        for (int i = 0 ; i < arr.length; i++) {
            if( arr[i] == num){
                return true;
            }
        }
        // point 3
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
