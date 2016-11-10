/**
 * Vivek Patani {FlipSwitch}
 * QueueArray.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.queue;

/**
 * 
 */
public class Queue {

	private NodeQueue front, rear, currentNode;

	/**
	 * Driver Program to control the flow of Queue
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Queue queueImplementation = new Queue();
		queueImplementation.enQueue(0);
		queueImplementation.enQueue(1);
		queueImplementation.enQueue(2);
		queueImplementation.enQueue(3);
		queueImplementation.traverseQueue();
		queueImplementation.deQueue();
		queueImplementation.traverseQueue();
	}

	/**
	 * Basic Constructor
	 */
	public Queue() {
		// Silence is Golden
	}

	/**
	 * Method to add an element to the Queue at the end
	 * 
	 * @param value
	 * @return
	 */
	public boolean enQueue(int value) {
		NodeQueue newNode = new NodeQueue(value);

		if (isEmpty()) {
			setFront(newNode);
			return true;
		} else {
			rear.setNextRef(newNode);
			rear = newNode;
			return true;
		}
	}

	/**
	 * Method used to remove an element from the front of the Queue
	 * 
	 * @return
	 */
	public boolean deQueue() {

		if (isEmpty()) {
			System.out.println(ConstantsQueue.queueConstants[3]);
			return false;
		} else {
			front = front.getNextRef();
			System.out.println(ConstantsQueue.queueConstants[2]);
			return true;
		}

	}

	/**
	 * Method to check whether if Queue is Empty and Report Underflow
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (front == null)
			return true;
		return false;
	}

	/**
	 * Method used to traverse through the elements of a Queue
	 */
	public void traverseQueue() {
		currentNode = front;
		System.out.print(ConstantsQueue.queueConstants[0]);
		while (currentNode != rear) {
			System.out.print(" " + currentNode.getValue());
			currentNode = currentNode.getNextRef();
		}
	}

	/**
	 * Method used to set the front of a Queue
	 * 
	 * @param newNode
	 */
	public void setFront(NodeQueue newNode) {
		front = rear = newNode;
	}
}