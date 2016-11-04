package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class AddTwoIntegersLinkedList {

	public static void main(String[] args) {

		ListNode head1 = new ListNode(7);
		ListNode tail1 = head1;

		ListNode newNode = new ListNode(2);
		tail1.next = newNode;
		tail1 = newNode;

		newNode = new ListNode(4);
		tail1.next = newNode;
		tail1 = newNode;

		newNode = new ListNode(3);
		tail1.next = newNode;
		tail1 = newNode;

		ListNode head2 = new ListNode(5);
		ListNode tail2 = head2;

		newNode = new ListNode(6);
		tail2.next = newNode;
		tail2 = newNode;

		newNode = new ListNode(4);
		tail2.next = newNode;
		tail2 = newNode;

		ListNode output = addTwoNumbers(head1, head2);

		display(output);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		List<Integer> list1 = getList(l1);
		List<Integer> list2 = getList(l2);

		System.out.println(list1);
		System.out.println(list2);
		
		int i = list1.size() - 1;
		int j = list2.size() - 1;
		int carry = 0;
		
		int sum = 0;
		ListNode head = null;
		
		while (i >= 0 || j >= 0 || carry != 0) {
			sum = 0;
			if (i >= 0) {
				sum += list1.get(i);
				i--;
			}
			
			if (j >= 0) {
				sum += list2.get(j);
				j--;
			}
			
			sum += carry;
			
			ListNode newNode = new ListNode (sum%10);
			newNode.next = head;
			head = newNode;
			
			carry = (sum) / 10;
			//System.out.println(i + " " + j + " " + carry + " " + sum);
		}
		
		return head;
	}

	public static List<Integer> getList(ListNode l) {
		List<Integer> list = new ArrayList<Integer>();

		while (l != null) {
			list.add(l.val);
			l = l.next;
		}

		return list;
	}

	public static void display(ListNode head) {

		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
