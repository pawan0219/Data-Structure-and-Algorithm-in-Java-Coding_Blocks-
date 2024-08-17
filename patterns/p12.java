public class p12 {
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
                if (j % 2 == 0) {
                    System.out.print("! ");
                } 
                else {
                    System.out.print("* ");
                }
                j++;
            }
            // int k = 1;
            // while (i <= space) {
            //     System.out.print("  ");
            //     k++;
            row++;
            System.out.println();
            space--;
            star += 2;
        }
    }
}
