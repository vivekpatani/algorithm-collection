package datastructures.queue;

import common.ConstantsCommon;

public class Queue<E> {

	private Node<E> front;
	private Node<E> rear;
	private int size = -1;

	/**
	 * Default Constructor
	 */
	public Queue() {
		front = new Node<E>();
		rear = front;
		size = 0;
	}

	/**
	 * Default Constructor with default value;
	 * 
	 * @param data
	 */
	public Queue(E data) {
		front = new Node<E>(data);
		rear = front;
		size = 1;
	}

	/**
	 * Enqueue new data elements at the end of the Queue.
	 * 
	 * @param data
	 * @return
	 */
	public boolean enQueue(E data) {

		// If the Queue is empty, initialise it.
		if (isQueueEmpty()) {
			front.setData(data);
			rear.setData(data);
			size++;
		} else {
			// Else, add queue element at end.

			Node<E> newNode = new Node<E>(data);
			rear.setNext(newNode);
			rear = newNode;
			size++;
		}

		return true;
	}

	/**
	 * Returns the element at the front of the Queue and remove it.
	 * 
	 * @return
	 */
	public E pop() {

		if (isQueueEmpty()) {
			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return null;
		} else {

			E value = front.getData();
			if (size == 1) {
				destroy();
			} else {

				front = front.getNext();
				size--;
			}
			return value;
		}
	}

	/**
	 * Returns the element at the front of the element and retains it.
	 * 
	 * @return
	 */
	public E peek() {

		if (isQueueEmpty()) {
			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return null;
		}
		else {
			return front.getData();
		}
	}

	/**
	 * Destroy the Queue.
	 * 
	 * @return
	 */
	public boolean destroy() {

		if (front == null) {
			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return false;
		} else {
			System.out.println(ConstantsCommon.DESTROY);
			front = null;
			rear = null;
			size=0;
			return true;
		}
	}

	/**
	 * Returns whether if the Queue is Empty or not.
	 * 
	 * @return
	 */
	public boolean isQueueEmpty() {

		if (getSize() < 1)
			return true;
		else
			return false;
	}

	/**
	 * Returns the size of the Current Queue.
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Print the Queue in a forward fashion.
	 */
	public void printForward() {

		if (isQueueEmpty())
			System.out.println(ConstantsCommon.QUEUE_EMPTY);
		else {

			Node<E> currentNode = front;
			System.out.println(ConstantsCommon.QUEUE_FORWARD_PRINT);
			do {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNext();
			} while (currentNode != rear.getNext());
		}
	}
}
