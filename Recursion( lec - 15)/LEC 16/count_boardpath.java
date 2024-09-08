public class count_boardpath {
   
        public static void main(String[] args) {
            int n = 4;
            // count(n, 0, "");
            System.out.println("/n" + count(n, 0, ""));
        }
    
        public static  int count(int n, int curr, String ans){
            if(curr == n){
                System.out.println(ans);
                return 1;
            }
            if(curr > n){
                return 0;
            }
            int Count = 0;
            for (int dice = 1; dice <= 3; dice++) {
               Count += count(n, curr + dice, ans + dice);
            }
            return Count;
        }
    }

