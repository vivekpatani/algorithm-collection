package solutions.ctci.chapter2;

import java.util.HashSet;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

/**
 * Eliminate Duplicates from LinkedList
 * 
 * Follow Up: Without additional temporary storage -> O(n^2)
 * 
 * This program has dependency on the linkedList developed by me, if you clone
 * the project it should be fine otherwise manually configure that to run.
 * 
 * @author flipswitch
 *
 */

public class Solution1 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addAtBegining(0);
		list.addAtBegining(1);
		list.addAtBegining(1);
		list.addAtBegining(2);
		list.addAtBegining(2);
		list.addAtBegining(2);

		System.out.println(removeDups(list));
	}

	public static HashSet<Integer> removeDups(LinkedList<Integer> list) {

		HashSet<Integer> hashSet = new HashSet<>();
		Node<Integer> currentNode = list.getRoot();
		Node<Integer> tail = list.getTail();

		while (currentNode != tail.getNext()) {
			hashSet.add(currentNode.getData());
			currentNode = currentNode.getNext();
		}

		return hashSet;
	}

	public static LinkedList<Integer> removeDupsWithoutSpace(LinkedList<Integer> list) {

		Node<Integer> currentNode = list.getRoot();
		Node<Integer> tail = list.getTail();
		while (currentNode != tail.getNext()) {
			Node<Integer> temp = currentNode;
			while (temp!=tail.getNext()){
				
				if (temp.getNext().getData() == currentNode.getData()) {
					//remove
				}
			}	
		}
		return list;
	}
}
