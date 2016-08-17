package datastructures.queue;

import common.ConstantsCommon;

public class Dequeue<E> {

	private Node<E> front;
	private Node<E> rear;
	private int size = -1;

	/**
	 * Default Constructor.
	 */
	public Dequeue() {

		front = new Node<E>();
		rear = front;
		size = 0;
	}

	/**
	 * Default Constructor with initial value.
	 * 
	 * @param firstElement
	 */
	public Dequeue(E firstElement) {

		front = new Node<E>(firstElement);
		rear = front;
		size = 1;
	}

	/**
	 * Enqueue a new element at the end of the Queue.
	 * 
	 * @param data
	 * @return
	 */
	public boolean enqueue(E data) {

		if (isQueueEmpty()) {

			front.setData(data);
			rear = front;
			size++;
			return true;
		} else {

			Node<E> newNode = new Node<E>(data);
			rear.setNext(newNode);
			newNode.setNext(front);
			rear = newNode;
			size++;
			return true;
		}
	}

	/**
	 * Enqueue a new Element at the end of the Queue
	 * 
	 * @param data
	 * @return
	 */
	public boolean addAtEnd(E data) {

		// This method is to maintain naming consistency.
		return enqueue(data);
	}

	public boolean addAtBegining(E data) {

		if (isQueueEmpty()) {
			front.setData(data);
			rear = front;
		} else {

			Node<E> newNode = new Node<E>(data);
			newNode.setNext(front);
			front = newNode;
			rear.setNext(front);
		}
		size++;
		return true;
	}

	/**
	 * Returns the element at the front of the Queue.
	 * 
	 * @return
	 */
	public E pop() {

		if (isQueueEmpty()) {

			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return null;
		} else {

			E data = front.getData();
			if (size == 1)
				destroy();
			else {

				front = front.getNext();
				rear.setNext(front);
				size--;
			}
			return data;
		}
	}

	/**
	 * Returns the element at the front of the Queue.
	 * 
	 * @return
	 */
	public E removeFirst() {

		// This method is just to maintain consistency in naming.
		return pop();
	}

	/**
	 * Returns the element at the rear of the Queue.
	 * @return
	 */
	public E removeLast() {

		if (isQueueEmpty()) {

			System.out.println(ConstantsCommon.QUEUE_EMPTY);
			return null;
		} else {
			
			E data = rear.getData();
			
			Node<E> currentNode = front;
			
			while (currentNode!=rear) currentNode = currentNode.getNext();
			
			currentNode.setNext(null);
			rear = currentNode;
			size--;
			
			return data;
		}
	}

	/**
	 * Destroy the Queue
	 * 
	 * @return
	 */
	public boolean destroy() {

		if (isQueueEmpty())
			return false;
		else {

			rear = front = null;
			size = 0;
			System.out.println(ConstantsCommon.DESTROY);
			return true;
		}
	}

	/**
	 * Returns boolean to check whether if a Queue is empty or not.
	 * 
	 * @return
	 */
	public boolean isQueueEmpty() {

		if (size < 1)
			return true;
		else
			return false;
	}

	
	public void printForward () {
		
		if (isQueueEmpty()) System.out.println(ConstantsCommon.QUEUE_EMPTY);
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
