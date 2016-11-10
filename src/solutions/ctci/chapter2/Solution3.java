package solutions.ctci.chapter2;

import java.util.Scanner;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

/**
 * Remove element at certain location
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
		
		Scanner sc = new Scanner (System.in);
		int position = sc.nextInt();
		System.out.println(position);
		sc.close();
		list = remove(list, position);
		list.printListForward();

	}
	
	public static LinkedList<Integer> remove (LinkedList<Integer> list, int position) {
		
		if (list.getSize() < position) {
			System.out.println("Duh!");
			return list;
		}
		
		int count = 0;
		Node<Integer> currentNode = list.getRoot();
		
		while (count!=position) {
			currentNode = currentNode.getNext();
			count++;
		}
		
		currentNode.getPrev().setNext(currentNode.getNext());
		currentNode = currentNode.getNext();
		
		
		return list;
	}

}
