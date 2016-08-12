package datastructures.linkedlist;

import java.io.*;

public class LinkedListImplementation<E> {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>(4);
		
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(8);
		linkedList.addAtEnd(6);
		linkedList.addAtEnd(7);
		linkedList.addAtEnd(8);
		linkedList.addAtEnd(8);
		linkedList.addAtEnd(9);
		linkedList.addAtBegining(3);
		linkedList.addAtPosition(10, 9);
		linkedList.printListForward();
		linkedList.removeLast();
		linkedList.printListForward();
		linkedList.removeFirst();
		linkedList.printListForward();
		linkedList.removeFirstInstance(8);
		
		linkedList.printListForward();
		linkedList.printListBackward();
	}
}