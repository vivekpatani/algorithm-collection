package datastructures.linkedlist;

import common.ConstantsCommon;

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
	 * 
	 * @param firstMember
	 */
	public LinkedList(E firstMember) {
		root = new Node<E>(firstMember);
		size = 1;
	}

	/**
	 * LinkedList Element Addition at the end.
	 * 
	 * @param data
	 * @return
	 */
	public boolean addAtEnd(E data) {

		// If List is Empty, make it the root.
		if (isLinkedListEmpty()) {
			root.setData(data);
			tail = root;
			size++;
			return true;
		} else {

			// The List is not empty, append element and mark it as tail.
			Node<E> currentNode = root;
			while (currentNode.getNext() != null)
				currentNode = currentNode.getNext();
			Node<E> newNode = new Node<E>(data);

			currentNode.setNext(newNode);
			newNode.setPrev(currentNode);

			tail = newNode;
			size++;
			return true;
		}
	}

	/**
	 * LinkedList Element Addition at a desired position in the LinkedList.
	 * 
	 * @param data
	 * @param position
	 * @return
	 */
	public boolean addAtPosition(E data, int position) {

		// If Position is out of bounds, return error. +1 is because user can
		// give position as last.
		if (position > size + 1 || position < 0) {
			System.out.println(ConstantsCommon.ERROR);
			return false;
		}

		// If the user enters the index 1 beyond the size, append it to
		// LinkedList
		if (position == (size + 1)) {
			addAtEnd(data);
			return true;
		}

		// If List is Empty, make it the root.
		if (isLinkedListEmpty()) {
			root.setData(data);
			tail = root;
			size++;
			return true;
		} else {

			// The List is not empty, find the correct position and insert it
			// there, fix references.
			Node<E> currentNode = root;

			int counter = 1;
			while (position != counter) {

				currentNode = currentNode.getNext();
				counter++;
			}

			Node<E> newNode = new Node<E>(data);

			newNode.setNext(currentNode);
			currentNode.getPrev().setNext(newNode);
			newNode.setPrev(currentNode.getPrev());
			currentNode.setPrev(newNode);
			size++;
			return true;
		}
	}

	/**
	 * LinkedList Element Addition at the Beginning.
	 * 
	 * @param data
	 * @return
	 */
	public boolean addAtBegining(E data) {
		
		// If the List is empty, initialise it
		if (isLinkedListEmpty()) {
			root.setData(data);
			tail = root;
			size++;
			return true;
		} else {

			// The List is not empty, prepend the Element.
			Node<E> newNode = new Node<E>(data);
			newNode.setNext(root);
			root.setPrev(newNode);
			root = newNode;

			return true;
		}
	}

	/**
	 * Checks whether if the list is empty or not.
	 * 
	 * @return
	 */
	public boolean isLinkedListEmpty() {
		if (size < 1)
			return true;
		else
			return false;
	}

	/**
	 * Returns the Size of the LinkedList.
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Print the LinkedList in a Forward Manner.
	 */
	public void printListForward() {

		Node<E> currentNode = root;

		System.out.println(ConstantsLinkedList.PRINT_FORWARD);
		while (currentNode != tail.getNext()) {
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
		while (currentNode != root.getPrev()) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getPrev();
		}
	}
}