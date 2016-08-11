package misc.linkedlist;

public class LinkedList<E> {

	private int size = -1;
	private Node<E> root;
	private Node<E> tail;

	/**
	 * LinkedList Constructor.
	 */
	public LinkedList() {
		root = new Node<E>();
		size++;
	}

	/**
	 * LinkedList Constructor with initial Value.
	 * @param firstMember
	 */
	public LinkedList(E firstMember) {
		root = new Node<E>(firstMember);
		size=1;
	}
	
	/**
	 * LinkedList Element Addition at the end.
	 * @param data
	 * @return
	 */
	public boolean addAtEnd(E data) {
		
		if (size == 0) {
			root.setData(data);
			tail = root;
			size++;
			return true;
		} else {
			
			Node<E> currentNode = root;
			while(currentNode.getNext() != null) currentNode = currentNode.getNext();
			Node<E> newNode = new Node<E>(data);
			
			currentNode.setNext(newNode);
			newNode.setPrev(currentNode);
			
			tail = newNode;
			
			return true;
		}
	}
	
	/**
	 * Print the LinkedList in a Forward Manner.
	 */
	public void printListForward() {
		
		Node<E> currentNode = root;
		
		System.out.println(ConstantsLinkedList.PRINT_FORWARD);
		while(currentNode != tail.getNext()) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
	}
	
	/**
	 * Print the LinkedList in a Backward Manner.
	 */
	public void printListBackward() {
		
		Node<E> currentNode = tail;
		
		System.out.println(ConstantsLinkedList.PRINT_BACKWARD);
		while(currentNode != root.getPrev()) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getPrev();
		}
	}
}