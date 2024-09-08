package linked_list_lec_28;
public class cycle_removal_algo {
    private class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	public void addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addLast(int item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
		    nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
    private Node getNode(int k)  {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle()  {
		tail.next = getNode(2);
	}
	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	//    O(N^2)
	public void remove_cycle() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != null) {
				if (temp.next == start) {
					temp.next = null;
				}
				temp = temp.next;
			}
			start = start.next;
		}
 	}
	 public void remove_cycle2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// count of node in cycle
		int count = 0;
		Node temp = meet;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		// move c distance fast node
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	public void floyedCycle() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node start = head;
		while (start.next != fast.next) {
			start = start.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	public static void main(String[] args) throws Exception {
		cycle_removal_algo cl = new cycle_removal_algo();
		cl.addLast(1);
		cl.addLast(2);
        cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);
		// cl.CreateCycle();
		cl.Display();
	}
}
