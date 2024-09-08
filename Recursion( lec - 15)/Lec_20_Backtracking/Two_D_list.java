import java.util.*;

public class Two_D_list {
    public static void main(String[] args) {
        // List<List<Integer>> ll = new ArrayList<>();
        // ll.add(new ArrayList<>());
        // ll.add(new ArrayList<>());
        // ll.add(new ArrayList<>());
        // ll.add(new ArrayList<>());
        // System.out.println(ll.get(0));
        // ll.get(1).add(9);
        // System.out.println(ll);

                                                   //OR
        List<Integer> ll1 = new ArrayList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        List<Integer> ll2 = new ArrayList<>();
        ll2.add(100);
        ll2.add(200);
        ll2.add(300);
        List<Integer> ll3 = new ArrayList<>();
        ll3.add(101);
        ll3.add(201);
        ll3.add(301);

        List<List<Integer>> ll4 = new ArrayList<>();
        ll4.add(ll1);
        ll4.add(ll2);
        ll4.add(ll3);
        System.out.println(ll4);
    }
}
