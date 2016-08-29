package datastructures.tree;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

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

	/**
	 * Insert data in the tree.
	 * 
	 * @param data
	 * @return
	 */
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

	/**
	 * Deletes the node given by user.
	 * 
	 * @param data
	 * @return
	 */
	public boolean delete(int data) {

		// Make sure the node exist.
		if (!find(data))
			return false;
		else {
			Node<E> currentNode = root;
			Node<E> parent = null;
			boolean isLeftChild = false;

			// Get the location of the node
			while (true) {
				parent = currentNode;

				if (currentNode.getData() == data)
					break;
				else if (data < currentNode.getData()) {
					currentNode = currentNode.getLeftChild();
					isLeftChild = true;
				} else {
					currentNode = currentNode.getRightChild();
					isLeftChild = false;
				}
			}

			// Case 1: When the node to be deleted has 0 children.
			if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
				if (currentNode == root)
					root = null;
				else if (isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}

			// Case 2: When the node to be deleted has 1 child.
			else if (currentNode.getLeftChild() == null || currentNode.getRightChild() == null) {
				if (currentNode.getRightChild() == null) {
					// The Left Child is present.

					if (currentNode == root)
						root = root.getLeftChild();

					if (isLeftChild)
						parent.setLeftChild(currentNode.getLeftChild());
					else
						parent.setRightChild(currentNode.getLeftChild());

				} else {
					// The Right Child is present.
					if (currentNode == root)
						root = root.getRightChild();

					if (isLeftChild)
						parent.setLeftChild(currentNode.getRightChild());
					else
						parent.setRightChild(currentNode.getRightChild());
				}
			}

			// Case 3: When the node to be deleted has 2 children.
			else if (currentNode.getLeftChild() != null && currentNode.getRightChild() != null) {
				Node<E> successor = getSuccessor(currentNode);

				if (currentNode == root) {
					root = successor;
				} else if (isLeftChild) {
					parent.setLeftChild(successor);
				} else
					parent.setRightChild(successor);
			}
		}
		return true;
	}

	/**
	 * Finds an eligible node to replace while deletion.
	 * 
	 * @param deleteNode
	 * @return
	 */
	public Node<E> getSuccessor(Node<E> deleteNode) {

		Node<E> successor = null;
		Node<E> successorParent = null;
		Node<E> currentNode = deleteNode.getRightChild();
		while (currentNode != null) {
			successorParent = successor;
			successor = currentNode;
			currentNode = currentNode.getLeftChild();
		}

		// This is to make sure that once we remove the successor node, we clean
		// up the references to any node connected to it.
		if (successor != deleteNode.getRightChild()) {
			successorParent.setLeftChild(successor.getRightChild());
			successor.setRightChild(deleteNode.getRightChild());
		}
		return successor;
	}

	/**
	 * Display the BST in order.
	 */
	public void display() {
		System.out.println("Tree: ");
		inOrderTraversal(root);
	}

	/**
	 * In Order Traversal of the tree.
	 * 
	 * @param root
	 */
	public void inOrderTraversal(Node<E> root) {

		if (isEmpty())
			System.out.println("What's wrong with you?");
		else if (root != null) {
			inOrderTraversal(root.getLeftChild());
			System.out.print(root.getData() + " ");
			inOrderTraversal(root.getRightChild());
		}
	}

	public void postOrderTraversal(Node<E> root) {

		if (isEmpty())
			System.out.println("What's wrong with you?");
		else if (root != null) {
			System.out.print(root.getData() + " ");
			inOrderTraversal(root.getLeftChild());
			inOrderTraversal(root.getRightChild());
		}
	}

	/**
	 * Search for a certain node in the tree.
	 * 
	 * @param data
	 * @return
	 */
	public boolean find(int data) {

		if (isEmpty())
			throw new NoSuchElementException();
		else {

			Node<E> currentNode = root;
			while (currentNode != null) {
				System.out.println(currentNode.getData());
				if (data == currentNode.getData())
					return true;
				else if (data < currentNode.getData())
					currentNode = currentNode.getLeftChild();
				else
					currentNode = currentNode.getRightChild();
			}
		}
		return false;
	}

	public void levelOrderTraversal() {

		if (isEmpty())
			System.out.println("Excuse me?!");
		else {

			System.out.println("\nLevel Order Traversal:");
			Queue<Node<E>> queue = new ConcurrentLinkedQueue<Node<E>>();
			queue.add(root);
			Node<E> currentNode = root;
			while (queue.size() > 0) {
				currentNode = queue.remove();
				System.out.print(currentNode.getData() + " ");
				if (currentNode.getLeftChild() != null)
					queue.add(currentNode.getLeftChild());
				if (currentNode.getRightChild() != null)
					queue.add(currentNode.getRightChild());
			}
		}
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

	/**
	 * Returns Root for the Tree.
	 * 
	 * @return
	 */
	public Node<E> getRoot() {
		return root;
	}

	/**
	 * Returns the size of tree.
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

}
