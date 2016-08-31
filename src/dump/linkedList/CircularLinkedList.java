/**
 * Vivek Patani {FlipSwitch}
 * CircularLinkedList.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.linkedList;

/**
 * 
 */
public class CircularLinkedList {

	private static int count = 0;
	private static NodeLinkedList head, tail, currentNode;

	/**
	 * Driver Method to control the flow of Circular Linked List Implementation
	 * 
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		CircularLinkedList cLL = new CircularLinkedList();

		cLL.addAtEnd(0);
		cLL.addAtEnd(1);
		cLL.addAtEnd(2);
		cLL.addAtEnd(3);
		cLL.addAtEnd(4);
		cLL.addAfter(7, 3);
		traverseForward();
		cLL.removeNode(0);
		traverseForward();
	}

	/**
	 * Basic Constructor
	 */
	public CircularLinkedList() {
		head = tail = null;
	}

	/**
	 * Method to add a new node at the start of the Circular Linked List.
	 * 
	 * @param value
	 */
	public void addAtStart(int value) {
		NodeLinkedList newNode = new NodeLinkedList(value);

		if (isEmpty()) {
			setHead(newNode);
		} else {
			head.setPrevRef(newNode);
			newNode.setNextRef(head);
			head = newNode;
			head.setPrevRef(tail);
		}
	}

	/**
	 * Method to add a node after a certain index The term index is also
	 * eventually a value
	 * 
	 * @param value
	 * @param index
	 */
	public static void addAfter(int value, int index) {

		currentNode = head;
		do {
			currentNode = currentNode.getNextRef();
			// System.out.println(" "+currentNode.getValue());
		} while (currentNode.getValue() != index && currentNode != head);

		if (currentNode == tail) {
			addAtEnd(value);
		} else {
			NodeLinkedList newNode = new NodeLinkedList(value);
			newNode.setNextRef(currentNode.getNextRef());
			newNode.setPrevRef(currentNode);
			currentNode.getNextRef().setPrevRef(newNode);
			currentNode.setNextRef(newNode);
		}
	}

	/**
	 * Method to add a new node at the end of the Circular Linked List.
	 * 
	 * @param value
	 */
	public static void addAtEnd(int value) {
		NodeLinkedList newNode = new NodeLinkedList(value);

		if (isEmpty()) {
			setHead(newNode);
		} else {
			tail.setNextRef(newNode);
			tail = newNode;
			tail.setNextRef(head);
		}
	}

	/**
	 * To check whether if the List is empty or not The basic logic is to simply
	 * check the head for null value
	 * 
	 * @return
	 */
	public static boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	/**
	 * Method to remove an element from the LinkedList
	 * 
	 * @param value
	 * @return
	 */
	public boolean removeNode(int value) {

		if (isEmpty())
			return false;
		else {
			currentNode = head;
			System.out.println();
			do {
				currentNode = currentNode.getNextRef();
			} while (currentNode != head && currentNode.getValue() != value);

			if (currentNode == null)
				return false;
			else if (currentNode == head) {
				tail.setNextRef(head.getNextRef());
				head.getNextRef().setPrevRef(tail);
				head = head.getNextRef();
				return true;
			}

			else if (currentNode == tail) {
				head.setPrevRef(tail.getPrevRef());
				tail.getPrevRef().setNextRef(head);
				return true;
			} else {
				currentNode.getPrevRef().setNextRef(currentNode.getNextRef());
				currentNode.getNextRef().setPrevRef(currentNode.getPrevRef());
				return true;
			}
		}
	}

	/**
	 * Method used to Traverse Forward in the LinkedList
	 */
	public static void traverseForward() {
		currentNode = head;
		do {
			System.out.print(" " + currentNode.getValue());
			currentNode = currentNode.getNextRef();
		} while (currentNode != head);
	}

	/**
	 * Method used to Traverse Backward in the LinkedList
	 */
	public static void traverseBackward() {
		currentNode = tail;
		System.out.println(ConstantsLinkedList.LinkedListConstants[1]);
		do {
			System.out.print(" " + currentNode.getValue());
			currentNode = currentNode.getNextRef();
		} while (currentNode != head);
	}

	/**
	 * This is use to just assign the header when the LinkedList is empty.
	 * 
	 * @param newNode
	 */
	public static void setHead(NodeLinkedList newNode) {
		head = tail = newNode;
	}

	/**
	 * Method to know the number of Elements in the LinkedList
	 */
	public int getNumberOfElments() {

		currentNode = head;
		do {
			currentNode = currentNode.getNextRef();
			count++;
		} while (currentNode != head);

		return count;
	}
}
