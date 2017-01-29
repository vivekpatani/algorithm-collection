package solutions.ctci.chapter2;

import java.util.Scanner;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

/**
 * Return the kth to last element from a linkedList.
 * @author flipswitch
 *
 */
public class Solution2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.addAtBegining(14);
		list.addAtBegining(13);
		list.addAtBegining(12);
		list.addAtBegining(11);
		list.addAtBegining(10);
		list.addAtBegining(9);
		
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		System.out.println("\n" + getKthToLastElement(list, k));
		sc.close();

	}
	
	/**
	 * Assuming it is a singly linkedlist
	 * Find the offset.
	 * @param list
	 * @param k
	 * @return
	 */
	public static int getKthToLastElement(LinkedList<Integer> list, int k){
		
		Node<Integer> root = list.getRoot();
		Node<Integer> current = list.getRoot();
		int length = 0;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
			length++;
		}
		
		length = k % length;
		
		if (length == 0) return root.getData();
		
		while (length != 0) {
			length--;
			root = root.getNext();
		}
		
		return root.getData();
	}

}
