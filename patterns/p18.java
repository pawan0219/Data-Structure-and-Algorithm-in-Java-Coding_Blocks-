public class p18 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = 1;
        int space = n/2;
        while (row <= n) {
            int i =1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            if (row <= n/2) {
                star +=2;
                space--;
            } else {
                star -= 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
