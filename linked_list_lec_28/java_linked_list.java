package linked_list_lec_28;

import java.util.*;

public class java_linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(1, -9);
        System.out.println(ll);
        for(int val : ll) {
            System.out.println(val + " ");
        }
        System.out.println();
        System.out.println(ll.get(1));
        System.out.println(ll.remove()); // remove last
        // System.out.println(ll.removeFirst());
        // System.err.println(ll.remove(0));

        //Queue                              add last remove first
        // LinkedList<Integer> ll1 = new LinkedList<>();
        Queue<Integer> ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);
        System.out.println(ll1.remove());
    }
}
