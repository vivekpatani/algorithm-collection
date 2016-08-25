package datastructures.tree;

import java.util.NoSuchElementException;

public class BinarySearchTree<E> {

	private Node<E> root;
	private int size;

	/**
	 * Default Constructor.
	 */
	public BinarySearchTree() {
		root = new Node<>();
		;
		size = 0;
	}

	/**
	 * Default Constructor with initial value.
	 * 
	 * @param data
	 */
	public BinarySearchTree(int data) {
		root = new Node<>(data);
		size = 1;
	}

	public boolean insert(int data) {

		if (isEmpty()) {
			root.setData(data);
			size++;
			return true;
		} else {
			Node<E> newNode = new Node<>();
			newNode.setData(data);
			Node<E> currentNode = root;
			Node<E> parent = null;
			while (true) {
				parent = currentNode;

				if (data < currentNode.getData()) {
					currentNode = currentNode.getLeftChild();
					if (currentNode == null) {
						parent.setLeftChild(newNode);
						return true;
					}
				} else {
					currentNode = currentNode.getRightChild();
					if (currentNode == null) {
						parent.setRightChild(newNode);
						return true;
					}
				}
			}
		}
	}
	
	
	public boolean find (int data) {
		
		if (isEmpty()) throw new NoSuchElementException();
		else {
			
			Node<E> currentNode = root;
			while (currentNode!=null) {
				System.out.println(currentNode.getData());
				if (data == currentNode.getData()) return true;
				else if (data < currentNode.getData()) currentNode = currentNode.getLeftChild();
				else currentNode = currentNode.getRightChild();
			}
		}
		return false;
	}

	/**
	 * Checks whether if the tree is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty() {

		if (size < 1)
			return true;
		else
			return false;
	}
}
