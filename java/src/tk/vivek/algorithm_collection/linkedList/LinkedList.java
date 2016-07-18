/**
 * Vivek Patani {FlipSwitch}
 * LinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivek.algorithm_collection.linkedList;


/**
 * 
 */
public class LinkedList {
	
	Node head,tail;
	/**
	 * 
	 */
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	public void add(int value){
		
		Node node = new Node(value);
		
		if(isEmpty()){
			head = node;
			tail = node;
		} else {
			Node current = head;
			while(current!=tail)
				current = current.next;
			
			current.next = node;
			node.next = null;
			tail = node;
			System.out.println("Added: "+current.value);
		}
	}
	
	public boolean remove(int value){
		
		if(head.value == value){
			System.out.println("Removed: "+head.value);
			
			head = head.next;
			System.out.println("New Head Value: "+head.value);
			return true;
			} else if (tail.value == value){
				System.out.println("Removed: "+tail.value);
				Node current = head;
				while(current.next!=tail)
					current = current.next;
				
				current.next = null;
				tail = current;
				return true;
			}else {
				Node current = head;
				while(current.next!=null && current.next.value!=value)
					
					current = current.next;
				
				if(current.next==null)
					return false;
				else {
					System.out.println("Removed: "+current.next.value);
					Node temp = current.next;
					current.next = temp.next;
					temp.next = null;
					temp = null;
					return true;
				}	
			}
	}
	public void printList(){
		
		System.out.println("List:");
		Node current = head;
		while(current!=tail.next){
			System.out.print(current.value+" ");
			current = current.next;
			}
		System.out.println();
	}
	
	public boolean isEmpty(){
		if(head == null)
			return true;
		else return false;
	}
	
	public Node getHead(){
		return head;
	}
	
	public Node getTail(){
		return tail;
	}
}
