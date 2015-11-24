/**
 * Vivek Patani {FlipSwitch}
 * NodeQueue.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.queue;

/**
 * The basic Structure of a Node in Queue
 */
public class NodeQueue {
	
	private NodeQueue next;
	private int value;
	
	/**
	 * Basic Constructor
	 */
	public NodeQueue(){
		next = null;
	}
	
	/**
	 * Basic Constructor with value initiate
	 * @param value
	 */
	public NodeQueue(int value){
		this.value = value;
	}
	
	/**
	 * Method used to return the next node reference
	 * @return
	 */
	public NodeQueue getNextRef(){
		return next;
	}
	
	/**
	 * Method used to return the value
	 * @return the value
	 */
	public void setNextRef(NodeQueue next){
		this.next = next;
	}

	/**
	 * Method used to return the value
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
