public class Maze_path {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;     //  matrix m * n
        print(n - 1, m - 1, 0, 0, "");
    }
                                                                               //er --> end row
                                                                               //ec --> end column
                                                                               //cr --> current row
                                                                               //cc --> current column
    public static void print(int er, int ec, int cr, int cc, String ans){
         if(cr == er && cc == ec){
            System.out.println(ans + " ");
            return;
         }
         if (cr > er || cc > ec) {
            return;
         }
         print(er, ec, cr, cc + 1, ans + "H");
         print(er, ec, cr + 1, cc, ans + "V");
    }
}
