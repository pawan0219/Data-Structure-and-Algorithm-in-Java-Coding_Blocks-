public class p23 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("1");
                j++;
            }
            // int k = 1;
            // while (i <= space) {
            //     System.out.print("  ");
            //     k++;
            row++;
            System.out.println();
            star += 2;
            space--;
        
        }
    }
}
