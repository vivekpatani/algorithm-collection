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
		list.addAtBegining(0);
		list.addAtBegining(1);
		list.addAtBegining(1);
		list.addAtBegining(2);
		list.addAtBegining(2);
		list.addAtBegining(2);
		
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		System.out.println(getKthToLastElement(list, k));
		sc.close();

	}
	
	public static int getKthToLastElement(LinkedList<Integer> list, int k){
		
		if (k > (list.getSize()-1)) return -1;
		else {
			
			Node<Integer> currentNode =list.getTail();
			int count = 0;
			
			while (count!=k) {
				currentNode = currentNode.getPrev();
				count++;
			}
			
			return currentNode.getData();
		}
	}

}
