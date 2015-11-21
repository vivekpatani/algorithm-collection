/**
 * Vivek Patani {FlipSwitch}
 * CircularLinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.linkedList;

/**
 * 
 */
public class CircularLinkedList {
	
	private static NodeLinkedList head;
	private NodeLinkedList tail;
	private static NodeLinkedList currentNode;
	
	public static void main(String[] args){
		
		CircularLinkedList cLL = new CircularLinkedList();
		
		cLL.addAtEnd(0);
		cLL.addAtEnd(0);
		cLL.addAtEnd(0);
		cLL.addAtEnd(0);
		cLL.addAtEnd(0);
		traverseForward();
	}
	
	public CircularLinkedList(){
		head = tail = null;
	}
	
	public void addAtEnd (int value) {
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		if (head == null){
			head = newNode;
			tail = newNode;
		} else {
			tail.setNextRef(newNode);
			tail = newNode;
			tail.setNextRef(head);
		}
	}
	
	public static void traverseForward(){
		currentNode = head;
		do {
			System.out.print(" "+currentNode.getValue());
			currentNode = currentNode.getNextRef();
		} while(currentNode!=head);
	}

}
