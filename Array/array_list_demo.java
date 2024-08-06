package Array;
import java.util.*;
public class array_list_demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        System.out.println(ll.size());
        System.out.println(ll);
        //add
        ll.add(10);
        ll.add(20);
        System.out.println(ll);
        ll.add(1,90); // index 0 to size
        ll.add(5);
        ll.add(51);
        System.out.println(ll);
        ll.add(1,15);
        System.out.println(ll);
        //get
        System.out.println(ll.get(2)); //index 0 to size - 1
        //remove
        System.out.println(ll.remove(1));
        System.out.println(ll);
        //update
        ll.set(2,-5);
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
