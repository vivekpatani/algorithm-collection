/**
 * Vivek Patani {FlipSwitch}
 * QueuePriority.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.queue;

/**
 * This Class is a simple implementation of Priority Queue
 */
public class QueuePriority {

	private NodeQueue front, rear, currentNode;

	/**
	 * Driver Program to control the flow of Queue
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		QueuePriority queueImplementation = new QueuePriority();
		queueImplementation.enQueue(0, 1);
		queueImplementation.enQueue(1, 2);
		queueImplementation.enQueue(2, 1);
		queueImplementation.enQueue(3, 5);
		queueImplementation.traverseQueue();
		queueImplementation.deQueue();
		queueImplementation.traverseQueue();
	}

	/**
	 * Basic Constructor
	 */
	public QueuePriority() {
		// Silence is Golden
	}

	/**
	 * Method to add an element to the Queue at the end
	 * 
	 * @param value
	 * @return
	 */
	public boolean enQueue(int value, int priority) {
		NodeQueue newNode = new NodeQueue(value, priority);

		if (isEmpty()) {
			setFront(newNode);
			System.out.println(ConstantsQueue.queueConstants[1] + " " + rear.getValue() + " " + rear.getPriority());
			return true;
		} else {
			rear.setNextRef(newNode);
			rear = newNode;
			System.out.println(ConstantsQueue.queueConstants[1] + " " + rear.getValue() + " " + rear.getPriority());
			return true;
		}
	}

	/**
	 * Method used to remove element with the highest priority from the Queue
	 * 
	 * @return
	 */
	public boolean deQueue() {

		if (isEmpty()) {
			System.out.println(ConstantsQueue.queueConstants[3]);
			return false;
		} else {
			int max = 0;
			currentNode = front;
			NodeQueue maxNode = new NodeQueue();
			// First find the maximum priority as it needs to be dequeued
			// (served) first
			while (currentNode != rear) {
				if (currentNode.getPriority() > max) {
					max = currentNode.getPriority();
				}
				currentNode = currentNode.getNextRef();
			}

			currentNode = front;
			while (currentNode.getPriority() != max) {
				currentNode = currentNode.getNextRef();
				maxNode = currentNode;
				System.out.println("\n" + maxNode.getPriority() + " " + maxNode.getValue());
			}

			if (maxNode == front) {
				front = front.getNextRef();
			} else {
				currentNode = front;
				while (currentNode.getNextRef() != maxNode) {
					currentNode = currentNode.getNextRef();
				}

				currentNode.setNextRef(maxNode.getNextRef());
			}

			currentNode.setNextRef(currentNode.getNextRef().getNextRef());
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