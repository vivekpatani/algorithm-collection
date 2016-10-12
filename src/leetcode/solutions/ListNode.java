package leetcode.solutions;

public class ListNode {
	int val;
	ListNode next;

	/**
	 * Constructor
	 * 
	 * @param x
	 */
	ListNode(int x) {
		val = x;
	}

	/**
	 * Print the LinkedList
	 * @param head
	 */
	public void print(ListNode head) {

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
