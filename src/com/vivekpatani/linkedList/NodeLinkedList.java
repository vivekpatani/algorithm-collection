/**
 * Vivek Patani {FlipSwitch}
 * NodeLinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.linkedList;

/**
 * 
 */
public class NodeLinkedList {
	
	private int value;
	private NodeLinkedList next,prev;
	
	NodeLinkedList (){
		next = null;
		prev = null;
	}
	
	NodeLinkedList (int value){
		setValue (value);
	}
	
	public NodeLinkedList getNextRef (){
		return next;
	}
	
	public void setNextRef (NodeLinkedList nextNode){
		this.next = nextNode;
	}
	
	public NodeLinkedList getPrevRef () {
		return prev;
	}
	
	public void setPrevRef (NodeLinkedList prevNode) {
		this.prev = prevNode;
	}
	
	public int getValue () {
		return value;
	}
	
	public void setValue (int value) {
		this.value = value;
	}
}
