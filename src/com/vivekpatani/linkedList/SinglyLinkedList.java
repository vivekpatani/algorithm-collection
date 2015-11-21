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
	
	/*
	 * Driver Programme
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
		displayList();
	}
	
	/*
	 * Initialises the LinkedList
	 */
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	/*
	 * Checks whether if the LinkedList is empty or not
	 */
	public boolean isEmpty(){
		if (head == null) return true;
		return false;
	}
	
	/*
	 * This is used to add a Node at the start of the LinkedList
	 */
	public void addAtStart (int value){
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		if(isEmpty()) head = tail = newNode;
		
		else {
			newNode.setNextRef(head);
			head = newNode;
		}
	}
	
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
	
	/*
	 * This is used to add a Node at the end of the LinkedList
	 */
	public void addAtEnd (int value){
		NodeLinkedList newNode = new NodeLinkedList(value);
		
		//Check for Empty List
		if (isEmpty()){
			head = tail = newNode;
			//Only use while testing
			//System.out.println("Head Added"+newNode.getValue());
		} else {
			tail.setNextRef(newNode);
			tail = newNode;
			//Only use while testing
			//System.out.println("New Node:"+newNode.getValue());
			tail.setNextRef(null);
		}
	}
	
	/*
	 * Simply used to Display the LinkedList
	 */
	public static void displayList (){
		currentNode = head;
		System.out.println(ConstantsLinkedList.LinkedListConstants[0]);
		while (currentNode != null) {
			System.out.print(" " + currentNode.getValue());
			currentNode = currentNode.getNextRef();
		}
	}
}
