/**
 * Vivek Patani {FlipSwitch}
 * Node.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivek.algorithm_collection.linkedList;

/**
 * 
 */
public class Node {
	
	int value;
	Node next, previous;
	
	Node(int value){
		this.value = value;
		this.next = null;
		this.previous = null;
	}
	
	Node (){
		this.value = 0;
		this.next = null;
		this.previous = null;
	}
}
