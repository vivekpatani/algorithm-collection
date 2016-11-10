package datastructures.linkedlist;

import common.ConstantsCommon;;

public class CircularLinkedList<E> {

	private Node<E> root;
	private Node<E> tail;
	private int size = -1;

	/**
	 * Default Constructor.
	 */
	public CircularLinkedList() {
		root = new Node<E>();
		size++;
	}

	/**
	 * Default Overloaded Constructor with data.
	 * 
	 * @param data
	 */
	public CircularLinkedList(E firstData) {
		root = new Node<E>(firstData);
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

			Node<E> newNode = new Node<E>(data);

			tail.setNext(newNode);
			newNode.setPrev(tail);

			tail = newNode;
			tail.setNext(root);

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
			System.out.println(ConstantsCommon.GENERIC_ERROR);
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
			tail.setNext(root);
			root.setPrev(tail);
			size++;
			return true;
		}
	}

	/**
	 * First Element of the LinkedList is removed.
	 * 
	 * @return
	 */
	public boolean removeFirst() {

		// If the List is Empty.
		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
			return false;
		} else if (size == 1) {
			// If List contains only one element, destroy the LinkedList.
			destroy();
			size--;
			return true;
		} else {

			// Else replace root with the next element of root.
			Node<E> temp = root.getNext();
			root.setNext(null);
			root = temp;
			root.setPrev(tail);
			tail.setNext(root);
			size--;

			return true;
		}
	}

	/**
	 * Remove the First Instance of the Element.
	 * 
	 * @param data
	 * @return
	 */
	public boolean removeFirstInstance(E data) {

		// If List is empty.
		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
			return false;
		}

		else if (size == 1) {
			// If List contains only one element, check if it is the same
			// element.
			if (root.getData() == data) {
				destroy();
				return true;
			} else {
				// The user entered an invalid element.
				System.out.println(ConstantsCommon.LINKEDLIST_NO_SUCH_ELEMENT + data);
				return false;
			}
		} else {

			// The Element is not in root and List has elements.

			int count = 1;
			Node<E> currentNode = root;

			// Look for the element or count should exhaust.
			while (count != size && currentNode.getData() != data) {
				currentNode = currentNode.getNext();
				count++;
			}

			// If the node is tail.
			if (currentNode == tail) {
				removeLast();
				return true;
			}

			// If count is greater than size, element does not exist.
			if (count > size) {
				System.out.println(ConstantsCommon.LINKEDLIST_NO_SUCH_ELEMENT + data);
				return false;
			} else {
				// Handle references.
				currentNode.getNext().setPrev(currentNode.getPrev());
				currentNode.getPrev().setNext(currentNode.getNext());
				currentNode = null;
				size--;

				return true;
			}
		}
	}

	/**
	 * Remove all instances of a desired data point.
	 * 
	 * @param data
	 * @return
	 */
	public boolean removeAllInstances(E data) {

		// If the list is empty.
		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
			return false;
		} else if (size == 1) {
			destroy();
			size--;
			return true;
		} else {

			Node<E> currentNode = root;
			boolean flag = false;
			do {

				Node<E> temp = currentNode;
				if (currentNode.getData() == data) {

					if (currentNode == tail) {
						removeLast();
					} else {
						currentNode.getNext().setPrev(currentNode.getPrev());
						currentNode.getPrev().setNext(currentNode.getNext());
						currentNode = null;

						size--;
					}
					flag = true;
				}
				currentNode = temp.getNext();
			} while (currentNode != root);
			return flag;
		}
	}

	/**
	 * Remove Element a desired position.
	 * 
	 * @param position
	 * @return
	 */
	public boolean removeAtPosition(int position) {

		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
			return false;
		} else if (position > size || position < 1)
			return false;
		else if (position == 1)
			removeFirst();
		else if (position == size)
			removeLast();
		else {

			int count = 0;
			Node<E> currentNode = root;

			while (++count != position)
				currentNode = currentNode.getNext();

			currentNode.getNext().setPrev(currentNode.getPrev());
			currentNode.getPrev().setNext(currentNode.getNext());
			currentNode = null;
			size--;

		}
		return true;
	}

	/**
	 * Last Element of the LinkedList is removed.
	 * 
	 * @return
	 */
	public boolean removeLast() {

		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
			return false;
		}
		else if (size == 1) {
			destroy();
			size--;
			return true;
		} else {
			size--;
			Node<E> temp = tail.getPrev();
			tail.setPrev(null);
			tail = temp;
			root.setPrev(tail);
			tail.setNext(root);

			return true;
		}
	}

	/**
	 * Deletes all the references to the LinkedList, gc will clean in its next
	 * cycle.
	 * 
	 * @return
	 */
	public boolean destroy() {

		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
			return false;
		}
		else {
			size = 0;
			root = null;
			tail = null;
			System.out.println(ConstantsCommon.DESTROY);
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

		if (isLinkedListEmpty())
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
		else if (size == 1)
			System.out.println(ConstantsCommon.LINKEDLIST_FORWARD_PRINT + "\n" + root.getData() + " Size: " + getSize());
		else {

			Node<E> currentNode = root;

			System.out.println(ConstantsCommon.LINKEDLIST_FORWARD_PRINT);
			do {
				System.out.print(currentNode.getData() + " -> ");
				currentNode = currentNode.getNext();
			} while (currentNode != root);
			System.out.println("Size: " + getSize());
		}
	}

	/**
	 * Print the LinkedList in a Backward Manner.
	 */
	public void printListBackward() {

		if (isLinkedListEmpty()) {
			System.out.println(ConstantsCommon.LINKEDLIST_EMPTY);
		} else if (size == 1)
			System.out.println(ConstantsCommon.LINKEDLIST_BACKWARD_PRINT + "\n" + root.getData() + " Size: " + getSize());
		else {
			Node<E> currentNode = tail;

			System.out.println(ConstantsCommon.LINKEDLIST_BACKWARD_PRINT);
			do {
				System.out.print(currentNode.getData() + " <- ");
				currentNode = currentNode.getPrev();
			} while (currentNode != root);
			System.out.println("Size: " + getSize());
		}
	}
}
