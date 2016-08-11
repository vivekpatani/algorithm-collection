package misc.linkedlist;

public class Node<E> {

	private E data;
	private Node<E> next;
	private Node<E> prev;

	/**
	 * Node Constructor.
	 * @return
	 */
	public Node() {
		next = null;
		prev = null;
	}

	/**
	 * Node Constructor with Initial Value.
	 * @param
	 * @return
	 */
	public Node(E initialValue) {
		data = initialValue;
		next = null;
		prev = null;
	}

	/**
	 * Returns Data for the corresponding Node.
	 * @return
	 */
	public E getData() {
		return data;
	}

	/**
	 * Sets Data for the corresponding Node.
	 * @param
	 * @return
	 */
	public boolean setData(E data) {
		this.data = data;
		return true;
	}

	/**
	 * Returns Next Location to the current Location.
	 * @return
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * Returns Previous Location to the current Location.
	 * @return
	 */
	public Node<E> getPrev() {
		return prev;
	}

	/**
	 * Sets Next Location to the current Location.
	 * @param
	 * @return
	 */
	public boolean setNext(Node<E> next) {
		this.next = next;
		return true;
	}

	/**
	 * Sets Previous Location to the current Location.
	 * @param
	 * @return
	 */
	public boolean setPrev(Node<E> prev) {
		this.prev = prev;
		return true;
	}
}