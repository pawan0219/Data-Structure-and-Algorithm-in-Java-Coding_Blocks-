public class random {
    public static void main(String[] args) {
     int n = 5;
     int row = n;
     while(row >= 0){
      for(int i = n; i >= 0;i--){
        if(i > row){
          System.out.print("  ");
        }else {
          System.out.print(i+" ");
        }
      }
      for(int i = 1; i <= n;i++){
       if(i <= n)
       {
        System.out.print(i+" ");
       }else{
        System.out.print("  ");
       }
      }
      row--; 
      System.out.println();        
    }
    
    while (row <= n) {
    for(int i = n; i >= 0;i--){
      if(i >= row){
        System.out.print("  ");
      }else {
        System.out.print(i+" ");
      }
    }
    for(int i = 1; i <= n;i++){
     if(i <= n)
     {
      System.out.print(i+" ");
     }else{
      System.out.print("  ");
     }
    }
    row++;
    System.out.println();
  }
}
}