package leetcode.solutions;

public class RotateList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode tail = head;
		
		ListNode newNode = new ListNode(2);
		tail.next = newNode;
		tail = newNode;
		
		newNode = new ListNode(3);
		tail.next = newNode;
		tail = newNode;
		
		newNode = new ListNode(4);
		tail.next = newNode;
		tail = newNode;
		
		newNode = new ListNode(5);
		tail.next = newNode;
		tail = newNode;
		
		int k = 2;
		
		display(rotateRight(head, k));
	}

	/**
	 * Rotate a given LinkedList right by k times.
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode rotateRight(ListNode head, int k) {
		
		// If it is empty, return head
		if (head == null) return head;
		
		ListNode current = head;
		ListNode tail = head;
		int length = 0;
		
		// Find the length of the linkedList and its tail
		while(current != null) {
			tail = current;
			current = current.next;
			length++;
		}
		
		// Going round and round doesn't make sense, rather just find out
		// what's the rotation offset
		k = k % length;
		
		// If you happen to see that the length of the list and k is equal
		// Do not rotate, just return head
		if (k == 0) return head;
		
		// Just find the reference to the Node before the one that needs to be actually rotated.
		int iter = length - k;
		
		current = head;
		
		// Get to that reference point.
		while (iter > 1) {
			current = current.next;
			iter--;
		}
		
		// Removing the rear section that needs to be rotated and attaching at the head.
		tail.next = head;
		head = current.next;
		current.next = null;
		
		// Job done!
		return head;
	}
	
	/**
	 * Used to print the List Node
	 * @param head
	 */
	public static void display(ListNode head) {
		
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
