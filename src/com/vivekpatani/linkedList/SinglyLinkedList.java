/**
 * Vivek Patani {FlipSwitch}
 * LinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.linkedList;

/**
 * Used to implement a Simple Singly LinkedList
 */
public class SinglyLinkedList {
	
	private static NodeLinkedList head ,tail ,currentNode;
	private static int count = 0;
	
	/**
	 * Driver Method to control the flow of Singly Linked List Implementation
	 * @param args
	 */
	public static void main(String[] args){
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.addAtEnd(1);
		sLL.addAtEnd(2);
		sLL.addAtEnd(3);
		sLL.addAtEnd(4);
		sLL.addAtEnd(5);
		sLL.addAtEnd(6);
		sLL.addAtEnd(7);
		sLL.addAtStart(0);
		sLL.addAfterValue(4,9);
		traverseForward();
	}
	
	/**
	 * Basic Constructor
	 */
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	/**
	 * This is used to add a Node at the start of the LinkedList
	 * Boolean is to just make sure the addition went through (Debugging Purpose Only)
	 * @return
	 */
	public boolean addAtStart (int value){
		NodeLinkedList newNode = new NodeLinkedList(value);
		if(isEmpty()) {
			setHead(newNode);
			return true;
		} else {
			newNode.setNextRef(head);
			head = newNode;
			return true;
		}
	}
	
	/**
	 * Method to add a node after a certain index
	 * The term index is also eventually a value
	 * Boolean is to just make sure the addition went through (Debugging Purpose Only) 
	 * @param value
	 * @param indexValue
	 * @return
	 */
	public boolean addAfterValue (int value, int indexValue){
		NodeLinkedList newNode = new NodeLinkedList(value);
		NodeLinkedList currentNode = head;
		
		while (currentNode.getValue() != indexValue && currentNode.getNextRef()!=null){
			currentNode = currentNode.getNextRef();
		}
		
		if (currentNode.getNextRef() == null) {
			return false;
		} else {
			newNode.setNextRef(currentNode.getNextRef());
			currentNode.setNextRef(newNode);
		}
		return true;
	}
	
	/**
	 * Method used to add a node at the end of the LinkedList
	 * @param value
	 */
	public void addAtEnd (int value){
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		//Check for Empty List
		if (isEmpty()){
			setHead(newNode);
		} else {
			tail.setNextRef(newNode);
			tail = newNode;
			tail.setNextRef(null);
		}
	}
	
	/**
	 * Checks whether if the LinkedList is empty or not
	 * The idea is to check whether if head is null or not
	 */
	public boolean isEmpty(){
		if (head == null) return true;
		return false;
	}
	
	/**
	 * Method used to the LinkedList in a forward manner
	 */
	public static void traverseForward(){
		currentNode = head;
		System.out.println(ConstantsLinkedList.LinkedListConstants[0]);
		while (currentNode != null) {
			System.out.print(" " + currentNode.getValue());
			currentNode = currentNode.getNextRef();
		}
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
	 * Method to know the number of Elements in the LinkedList
	 */
	public int getNumberOfElments(){	
		currentNode = head;
		while (currentNode!=null){
			currentNode = currentNode.getNextRef();
			count++;
		}	
		return count;
	}
}
