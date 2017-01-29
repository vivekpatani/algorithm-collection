package solutions.ctci.chapter2;

import java.util.Scanner;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

/**
 * Remove element at the middle of linkedlist with only one reference.
 * @author flipswitch
 *
 */
public class Solution3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addAtBegining(0);
		list.addAtBegining(1);
		list.addAtBegining(2);
		list.addAtBegining(3);
		list.addAtBegining(4);
		list.addAtBegining(5);
		list.addAtBegining(6);
		
		int position = 4;
		
		Node<Integer> current = list.getRoot();
		
		while (position != 0) {
			current = current.getNext();
			position--;
		}
		
		System.out.println("Current Data: " + current.getData());
		list = remove(current, list);
		list.printListForward();

	}
	
	/**
	 * Remove the middle of the linkedlist
	 * @param root
	 * @param list
	 * @return
	 */
	public static LinkedList<Integer> remove (Node<Integer> root, LinkedList<Integer> list) {
		
		if (root.getNext() == null) return list;
		
		Node<Integer> forward = root.getNext();
		
		while (forward != null) {
			
			root.setData(forward.getData());
			root.setNext(forward.getNext());
			root = forward;
			forward = forward.getNext();
		}
		
		root.setNext(null);
		return list;
	}

}
