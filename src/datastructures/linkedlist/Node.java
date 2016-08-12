package datastructures.linkedlist;

public class Node<E> {

	private E data;
	private Node<E> next;
	private Node<E> prev;
	private Node<E> down;
	private Node<E> up;

	/**
	 * Node Constructor.
	 * @return
	 */
	public Node() {
		next = null;
		prev = null;
		up = null;
		down = null;
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
		up = null;
		down = null;
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
	
	/**
	 * Returns The Child to current Node.
	 * @return
	 */
	public Node<E> getDown() {
		return down;
	}

	/**
	 * Sets The Child to current Node.
	 * @param down
	 */
	public void setDown(Node<E> down) {
		this.down = down;
	}

	/**
	 * Returns The Parent to current Node.
	 * @return
	 */
	public Node<E> getUp() {
		return up;
	}

	/**
	 * Sets The Parent to current Node.
	 * @param up
	 */
	public void setUp(Node<E> up) {
		this.up = up;
	}

	/**
	 * Returns Data for the corresponding Node.
	 * @return
	 */
	public E getData() {
		return data;
	}
}