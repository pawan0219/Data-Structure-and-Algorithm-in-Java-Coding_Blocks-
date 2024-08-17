public class p20 {
       public static void main(String[] args) {
          int n  = 7;
          int row = 1;
          int sp1 = n/2;
          int star = 1;
          int sp2 = 0;
          while (row <= n) {
            for(int i = 1; i <= sp1; i++){
                System.out.print("  ");
            }            
                for(int j = 1; j <= star; j++){
                    System.out.print("* ");
                }
            for (int k = 0;k <= sp2 ; k++) {
                System.out.print("  ");
            }
            if (row != 1 || row != n) {
                for(int j = 1; j <= star; j++){
                        System.out.print("* ");
                        continue;
                    }
                   }
            if (row <= n/2) {
                if (row != 1) {
                    sp1--;
                sp2 +=2;
                // } else {
                //     sp1--;
                //     sp2++;
                // }
            } else{
                sp1++;
                sp2 -=2;
            }
            row++;
            System.out.println();
          }
        }
    }
}
       