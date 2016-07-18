/**
 * Vivek Patani {FlipSwitch}
 * LinkedListImpl.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivek.algorithm_collection.linkedList;

/**
 * 
 */
public class LinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);
		linkedList.add(600);
		linkedList.add(700);
		linkedList.printList();
		linkedList.remove(100);
		linkedList.printList();
		linkedList.remove(600);
		linkedList.printList();
		linkedList.remove(300);
		linkedList.printList();
		linkedList.remove(700);
		linkedList.printList();

	}

}
