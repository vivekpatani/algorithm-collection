/**
 * Vivek Patani {FlipSwitch}
 * DoublyLinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.linkedList;

/**
 * To implement a simple DoublyLinkedList
 */
public class DoublyLinkedList {

	private static NodeLinkedList head, tail, currentNode;
	
	/**
	 * The driver method used to run the class
	 * @param args
	 */
	public static void main(String[] args){
		DoublyLinkedList dLL = new DoublyLinkedList();
		
		dLL.addAtEnd(0);
		dLL.addAtEnd(1);
		dLL.addAtEnd(2);
		dLL.addAtEnd(3);
		dLL.addAfter(1,2);
		traverseForward();
		removeElement(3);
		traverseBackward();
	}
	
	public DoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	/**
	 * This is use to just assign the header when the LinkedList is empty.
	 * @param newNode
	 */
	public static void setHead(NodeLinkedList newNode){
		head = newNode;
		tail = newNode;
	}
	
	/**
	 * Method used to add a node at the start of the LinkedList
	 * @param value
	 */
	public static void addAtStart(int value){
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		if(isEmpty()){
			setHead(newNode);
		} else {
			head.setPrevRef(newNode);
			head.setNextRef(head);
			head = newNode;
			head.setPrevRef(null);
		}
	}
	
	/**
	 * Method used to add a node at the end of the LinkedList
	 * @param value
	 */
	public void addAtEnd (int value) {
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		if (isEmpty()){
			head = newNode;
			tail = newNode;
		} else {
			tail.setNextRef(newNode);
			newNode.setPrevRef(tail);
			tail = newNode;
		}
	}
	
	/**
	 * This is used to add a Node after a certain value.
	 * @param value
	 */
	public void addAfter(int value, int index){
		NodeLinkedList newNode = new NodeLinkedList(value);
		currentNode = head;
		
		if(isEmpty()){
			setHead(newNode);
		} else {
			do {
				currentNode = currentNode.getNextRef();
			} while (currentNode!=null && currentNode.getValue()!= index);
			
			if(currentNode == null){
				System.out.println(ConstantsLinkedList.LinkedListConstants[2]);
			} else if (currentNode == tail){
				addAtEnd(value);
			} else {
				currentNode.getNextRef().setPrevRef(newNode);
				newNode.setNextRef(currentNode.getNextRef());
				currentNode.setNextRef(newNode);
				newNode.setPrevRef(currentNode);
				
			}
		}
	}
	
	/**
	 * Method used to the LinkedList in a reverse manner
	 */
	public static void traverseBackward () {
		
		System.out.println("\n"+ConstantsLinkedList.LinkedListConstants[1]);
		currentNode = tail;
		while (currentNode!=null) {
			System.out.print(" "+currentNode.getValue());
			currentNode = currentNode.getPrevRef();
		}
	}
	
	/**
	 * Method used to the LinkedList in a forward manner
	 */
	public static void traverseForward (){
		
		System.out.println(ConstantsLinkedList.LinkedListConstants[0]);
		currentNode = head;
		while (currentNode!=null){
			System.out.print(" "+currentNode.getValue());
			currentNode = currentNode.getNextRef();
		}
	}
	
	/**
	 * Method used to remove an element from the Doubly LinkedList
	 * @param value
	 */
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
	
	/**
	 * Checks whether if the LinkedList is empty or not
	 * The idea is to check whether if head is null or not
	 */
	private static boolean isEmpty() {
		if(head == null) return true;
		return false;
	}
	
}
