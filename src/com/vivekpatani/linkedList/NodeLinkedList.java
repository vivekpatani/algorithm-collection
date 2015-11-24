/**
 * Vivek Patani {FlipSwitch}
 * NodeLinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.linkedList;

/**
 * This is the strucutre of a Node in the LinkedList
 */
public class NodeLinkedList {
	
	private int value;
	private NodeLinkedList next,prev;
	
	/**
	 * Basic Constructor
	 */
	NodeLinkedList (){
		next = null;
		prev = null;
	}
	
	/**
	 * Basic Constructor
	 * @param value
	 */
	NodeLinkedList (int value){
		setValue (value);
		next = null;
		prev = null;
	}
	
	/**
	 * Returns the Next Reference to the calling method
	 * @return
	 */
	public NodeLinkedList getNextRef (){
		return next;
	}
	
	/**
	 * Used to edit the next reference or simply set it
	 * @param nextNode
	 */
	public void setNextRef (NodeLinkedList nextNode){
		this.next = nextNode;
	}
	
	/**
	 * Returns the previous reference to the calling method
	 * @return
	 */
	public NodeLinkedList getPrevRef () {
		return prev;
	}
	
	/**
	 * Used to set the next reference or simply set it
	 * @param prevNode
	 */
	public void setPrevRef (NodeLinkedList prevNode) {
		this.prev = prevNode;
	}
	
	/**
	 * Returns the value held by this node
	 * @return
	 */
	public int getValue () {
		return value;
	}
	
	/**
	 * Used to edit the value or simply set it
	 * @param value
	 */
	public void setValue (int value) {
		this.value = value;
	}
}
