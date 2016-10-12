package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLinkedLists {

	public static void main(String[] args) {

		pleaseMerge();
	}

	public static ListNode pleaseMerge() {

		ListNode head0 = new ListNode(0);
		ListNode head1 = createLinkedList(-2, 6);
		ListNode head2 = createLinkedList(6, 11);
		ListNode head3 = createLinkedList(11, 15);
		ListNode head4 = createLinkedList(7, 13);
		
		List<ListNode> list = new ArrayList<>();
		list.add(head1);
		list.add(head2);
		list.add(head3);
		list.add(head4);
		
		ListNode merged = head0;
		
		for (int i = 0; i < list.size(); i++) {
			
			merged = mergeTwo(merged, list.get(i));
		}
		
		merged = merged.next;
		System.out.println("\nMerged:");
		while (merged!= null) {
			System.out.print(merged.val + " ");
			merged = merged.next;
		}
		
		return null;
	}

	public static ListNode mergeTwo(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode head = new ListNode(0);

		ListNode current = head;
		while (l1 != null && l2 != null) {

			ListNode newNode;
			if (l1.val < l2.val) {
				newNode = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				newNode = new ListNode(l2.val);
				l2 = l2.next;
			}
			current.next = newNode;
			current = current.next;
		}

		if (l1 != null) {
			current.next = l1;
		}

		if (l2 != null) {
			current.next = l2;
		}

		return head.next;
	}
	
	public static ListNode createLinkedList (int begin, int end) {
		
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
