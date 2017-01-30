package solutions.ctci.chapter2;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

/**
 * Split the list over x, such that elements less than x on left and greater
 * than equal to on right.
 * 
 * @author flipswitch
 *
 */
public class Solution4 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.addAtBegining(0);
		list.addAtBegining(1);
		list.addAtBegining(2);
		list.addAtBegining(3);
		list.addAtBegining(4);
		list.addAtBegining(5);
		list.addAtBegining(6);

		int x = 3;
		LinkedList<Integer> newList = split(list, x);
		newList.printListForward();
	}

	/**
	 * The logic here seems correct, but my LL implementation has some fault maybe.
	 * @param list
	 * @param x
	 * @return
	 */
	public static LinkedList<Integer> split(LinkedList<Integer> list, int x) {

		Node<Integer> current = list.getRoot();
		
		LinkedList<Integer> newList = new LinkedList<>(x);
		Node<Integer> head = newList.getRoot();
		Node<Integer> tail = newList.getRoot();
		
		while (current != null) {
			Node<Integer> newNode = new Node<Integer>(current.getData());
			if (current.getData() < x) {
				newNode.setNext(head);
				head = newNode;
			} else {
				tail.setNext(newNode);
				tail = newNode;
				tail.setNext(null);
			}
			newList.printListForward();
			current = current.getNext();
		}
		
		return newList;
	}

}
