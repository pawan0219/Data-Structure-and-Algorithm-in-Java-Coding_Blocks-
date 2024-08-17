
    import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n/2;
        int space = 1;
    
        while(row <= n)    {
    int j = 1;
    while(j <= star){
        System.out.print("* ");
        j++;
    }
    
    int i = 1;
    while(i <= space){
        System.out.print("  ");
        i++;
    }

    int k =1;
    while (k<= star) {
        System.out.print("* ");
        k++;
    }
   
    if (row <= n/2){
        star--;
        space += 2;
    }else {
        star++;
        space -= 2;
    }
    row++;
    System.out.println();
}    }
    
}


    

