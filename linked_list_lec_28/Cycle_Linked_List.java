package linked_list_lec_28;

public class Cycle_Linked_List {
   
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

  public class Solution {
      public boolean hasCycle(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
          while (fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
              if(slow==fast) {
                  return true;
              }

          }
          return false;

      }
  }
}
