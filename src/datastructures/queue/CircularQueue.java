package datastructures.queue;

import common.ConstantsCommon;

public class CircularQueue<E> {

	private Node<E> front;
	private Node<E> rear;
	private int size = -1;

	/**
	 * Default Constructor to initialise a Queue.
	 */
	public CircularQueue() {
		front = new Node<E>();
		rear = front;
		size = 0;
	}

	/**
	 * Default Constructor to initialise a Queue with first Element.
	 * 
	 * @param firstData
	 */
	public CircularQueue(E firstData) {

		front = new Node<E>();
		front.setData(firstData);
		rear = front;
		size = 1;
	}

	/**
	 * Appends an element to the the end of the Queue.
	 * 
	 * @param data
	 * @return
	 */
	public boolean enQueue(E data) {

		if (isQueueEmpty()) {
			front.setData(data);
			rear = front;
			size++;
		} else {

			Node<E> newNode = new Node<E>(data);
			rear.setNext(newNode);
			rear = newNode;
			rear.setNext(front);
			size++;
		}
		return true;
	}

	/**
	 * Returns and Removes the element at the front of Queue.
	 * 
	 * @return
	 */
	public E pop() {

		if (isQueueEmpty()) {
			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return null;
		} else {
			E data = front.getData();

			if (size == 1) {
				destroy();
			} else {
				front = front.getNext();
				size--;
			}
			return data;
		}
	}

	/**
	 * Returns the front of the Queue.
	 * 
	 * @return
	 */
	public E peek() {

		if (isQueueEmpty())
			return null;
		else
			return front.getData();
	}

	/**
	 * Destroy the Queue.
	 * 
	 * @return
	 */
	public boolean destroy() {

		if (isQueueEmpty()) {
			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return false;
		} else {
			System.out.println(ConstantsCommon.DESTROY);
			front = rear = null;
			size = 0;
			return true;
		}
	}

	/**
	 * Returns whether if the Queue is empty or not.
	 * 
	 * @return
	 */
	public boolean isQueueEmpty() {

		if (size < 1)
			return true;
		else
			return false;
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
