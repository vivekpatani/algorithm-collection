/**
 * Vivek Patani {FlipSwitch}
 * DoublyLinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.linkedList;

/**
 * 
 */
public class DoublyLinkedList {

	private static NodeLinkedList head, tail, currentNode;
	
	public static void main(String[] args){
		DoublyLinkedList dLL = new DoublyLinkedList();
		
		dLL.addAtEnd(0);
		dLL.addAtEnd(1);
		dLL.addAtEnd(2);
		dLL.addAtEnd(3);
		traverseForward();
		removeElement(2);
		traverseBackward();
	}
	
	public DoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	public void addAtEnd (int value) {
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		if (head == null){
			head = newNode;
			tail = newNode;
		} else {
			tail.setNextRef(newNode);
			newNode.setPrevRef(tail);
			tail = newNode;
			tail.setNextRef(null);
		}
		
	}
	
	public static void traverseBackward () {
		
		System.out.println("\n"+ConstantsLinkedList.LinkedListConstants[1]);
		currentNode = tail;
		while (currentNode!=null) {
			System.out.print(" "+currentNode.getValue());
			currentNode = currentNode.getPrevRef();
		}
	}
	
	public static void traverseForward (){
		
		System.out.println(ConstantsLinkedList.LinkedListConstants[0]);
		currentNode = head;
		while (currentNode!=null){
			System.out.print(" "+currentNode.getValue());
			currentNode = currentNode.getNextRef();
		}
	}
	
	public static void removeElement(int value) {
		
		currentNode = head;
		while (currentNode!= null && currentNode.getValue()!=value){
			currentNode = currentNode.getNextRef();
		}	
		if (currentNode == null){
			System.out.println("\n"+ConstantsLinkedList.LinkedListConstants[2]);
		} else {
			if (currentNode == head){
				head = head.getNextRef();
				head.setPrevRef(null);
			} else if (currentNode == tail){
				tail = tail.getPrevRef();
				tail.setNextRef(null);
			} else {
				currentNode.getPrevRef().setNextRef(currentNode.getNextRef());
				currentNode.getNextRef().setPrevRef(currentNode.getPrevRef());
			}
			System.out.println(ConstantsLinkedList.LinkedListConstants[3]);
		}
	}
}
