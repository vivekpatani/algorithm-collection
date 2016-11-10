package datastructures.queue;

public class Node<E> {
	
	private Node<E> next;
	private Node<E> prev;
	private E data;
	
	/**
	 * Default Constructor.
	 */
	public Node() {
		next = null;
		prev = null;
	}
	
	/**
	 * Default Constructor with initial value;
	 * @param data
	 */
	public Node(E data) {
		this.data = data;
		next = null;
		prev = null;
	}

	/**
	 * Gets Reference to the next node to corresponding current Node.
	 * @return
	 */
	public Node<E> getNext() {
		return next;
	}
	
	/**
	 * Gets Reference to the previous node to corresponding current Node.
	 * @return
	 */
	public Node<E> getPrev() {
		return prev;
	}

	/**
	 * Sets Reference to the previous node to corresponding current Node.
	 * @param prev
	 */
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	/**
	 * Gets Reference to the next node to corresponding current Node.
	 * @param next
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**
	 * Returns the data to corresponding Node.
	 * @return
	 */
	public E getData() {
		return data;
	}

	/**
	 * Sets the data value for the corresponding node.
	 * @param data
	 */
	public void setData(E data) {
		this.data = data;
	}
}