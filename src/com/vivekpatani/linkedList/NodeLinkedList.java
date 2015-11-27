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
	
	private int value, visited;
	/**
	 * Returns 0 when not visited and 1 when visited
	 * @return the visited
	 */
	public int getVisited() {
		return visited;
	}

	/**
	 * Method used to set the visited node
	 * @param visited the visited to set
	 */
	public void setVisited(int visited) {
		this.visited = visited;
	}

	private NodeLinkedList next,prev;
	
	/**
	 * Basic Constructor
	 */
	NodeLinkedList (){
		next = null;
		prev = null;
		visited = 0;
	}
	
	/**
	 * Basic Constructor
	 * @param value
	 */
	NodeLinkedList (int value){
		setValue (value);
		next = null;
		prev = null;
		visited = 0;
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
