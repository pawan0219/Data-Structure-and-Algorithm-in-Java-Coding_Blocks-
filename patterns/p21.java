public class p21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 2*(n-row-1);
        while (row <= n) {
            int i = 1;
            while ( i <= star) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row == n){
                k = 2;
            }
            while (k <= star) {
                System.out.print("* ");
            k++;  }
            if (row <= n) {
                space--;
                star++;; 
            }
           row++; 
           System.out.println();  

        }
    }
}
