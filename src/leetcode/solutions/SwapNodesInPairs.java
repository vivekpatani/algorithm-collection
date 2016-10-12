package leetcode.solutions;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		
		ListNode head = createLinkedList(0, 10);
		System.out.println("Input: ");
		head.print(head);
		System.out.println("\nOutput: ");
		ListNode answer = swapPairs(head);
		answer.print(head);
		
	}

	public static ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode current = head;

		while (current != null) {

			if (current.next == null)
				break;

			// Switching
			int temp = current.next.val;
			current.next.val = current.val;
			current.val = temp;

			// Move to the next combination
			current = current.next.next;
		}

		return head;
	}

	public static ListNode createLinkedList(int begin, int end) {

		ListNode output = new ListNode(0);
		ListNode current = output;
		for (int i = begin; i < end; i++) {
			ListNode newNode = new ListNode(i);
			current.next = newNode;
			current = current.next;
		}

		return output.next;
	}

}
