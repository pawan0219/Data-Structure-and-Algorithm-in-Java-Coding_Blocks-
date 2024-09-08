import java.util.*;

public class Lexico_counting {
    public static void main(String[] args) {
        int n = 1000;
        List<Integer> ll = new ArrayList<>();
        Print(0, n, ll);
    }

    public static void Print(int curr, int end, List<Integer> ll){
        if(curr > end ){
            return;
        }
 
        if (curr != 0) {
                    System.out.println(curr);
            // ll.add(curr);
        }
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for(; i <= 9; i++){
            Print(curr * 10 + i, end, ll);
        }
    }
}
