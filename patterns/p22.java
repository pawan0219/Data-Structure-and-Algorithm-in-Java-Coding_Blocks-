public class p22 {
    public static void main(String[] args) {
    int n = 5;
    int row = 1;
    int star = n;
    int space = -1;
    while (row <= n) {
        int k = 1;
        while (k <= star) {
            System.out.print("* ");
            k++;
        }
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
        space++;
        star--;    
        row++;
        System.out.println();

}
}
}