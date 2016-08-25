package datastructures.tree;

public class Node<E>{

	private int data;
	private Node<E> leftChild;
	private Node<E> rightChild;

	/**
	 * Default Constructor
	 */
	public Node() {
		leftChild = null;
		rightChild = null;
	}

	/**
	 * Default Constructor with initial value.
	 * 
	 * @param data
	 */
	public Node(int data) {
		data = this.data;
		leftChild = null;
		rightChild = null;
	}

	/**
	 * Returns data for the corresponding node.
	 * 
	 * @return
	 */
	public int getData() {
		return data;
	}

	/**
	 * Sets data for the corresponding node.
	 * 
	 * @param data
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Returns the Left Child for the corresponding node.
	 * 
	 * @return
	 */
	public Node<E> getLeftChild() {
		return leftChild;
	}

	/**
	 * Sets the Left Child for corresponding node.
	 * 
	 * @param leftChild
	 */
	public void setLeftChild(Node<E> leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Returns the Right Child for corresponding node.
	 * 
	 * @return
	 */
	public Node<E> getRightChild() {
		return rightChild;
	}

	/**
	 * Sets the Right Child for corresponding node.
	 * 
	 * @param rightChild
	 */
	public void setRightChild(Node<E> rightChild) {
		this.rightChild = rightChild;
	}

//	/**
//	 * Compares two Elements and returns integer.
//	 */
//	@Override
//	public int compareTo(E other) {
//		
//		return ((Comparable)data).compareTo((Comparable)other);
//	}
	
}
