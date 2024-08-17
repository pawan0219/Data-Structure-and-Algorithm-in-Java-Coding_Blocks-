public class p8 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while (row <= n) {
            for (int i = 1; i <= star; i++) {
                if (row == i || row + i == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            row++;
            System.out.println();
        }
    }
}
