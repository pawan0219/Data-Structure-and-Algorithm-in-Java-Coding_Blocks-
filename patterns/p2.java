public class p2 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1 ;
        while (row<=n) {
            //star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            row++;
            System.out.println();    
            star++;        
        }
    }
    
    
}
