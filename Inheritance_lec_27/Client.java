package Inheritance_lec_27;

public class Client {
    public static void main(String[] args) {
                      // case 1
        // P obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // obj.fun();
        // obj.fun1();
                      //  case  2
            // P obj = new C();
            // System.out.println(obj.d);
            // System.out.println(obj.d1);
            // System.out.println(((C) obj).d2);   
            // System.out.println(((C) obj).d);   
 ///////////////////////method overiding :- if the method function parameter etc. is same for both the classes (C and P)            
            // obj.fun();
            // obj.fun1();
            // ((C) obj).fun2();

                     //  Case 3
        //    C obj = new P();
        //    System.out.println(obj.d);
        //    System.out.println(obj.d1);
        //    System.out.println(obj.d2)  
        
                     //  Case 4
            C obj = new C();
            System.out.println(obj.d);  // 2
            System.out.println(obj.d1); // 10
            // System.out.println(obj.d2); // 20
            System.out.println(((P) obj).d); // 1
            obj.fun();    // C
            obj.fun1();  // P
            obj.fun2();  // C
            ((P) obj).fun(); // C


    }
    
}
