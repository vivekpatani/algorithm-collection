/**
 * Vivek Patani {FlipSwitch}
 * NodeQueue.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.queue;

/**
 * The basic Structure of a Node in Queue
 */
public class NodeQueue {

	private NodeQueue next;
	private int value, priority;

	/**
	 * Basic Constructor
	 */
	public NodeQueue() {
		next = null;
		priority = 0;
	}

	/**
	 * Basic Constructor with value
	 * 
	 * @param value
	 */
	public NodeQueue(int value) {
		this.value = value;
		priority = 0; // This is used for normal Queue, hence all Nodes are of
						// same priority.
	}

	/**
	 * Basic Constructor with value and priority
	 * 
	 * @param value
	 * @param priority
	 */
	public NodeQueue(int value, int priority) {
		this.value = value;
		this.priority = priority;
	}

	/**
	 * Method used to return the next node reference
	 * 
	 * @return
	 */
	public NodeQueue getNextRef() {
		return next;
	}

	/**
	 * Method used to get the priority of the Node
	 * 
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Method used to set the priority of the Node
	 * 
	 * @param priority
	 *            to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * Method used to return the value
	 * 
	 * @return the value
	 */
	public void setNextRef(NodeQueue next) {
		this.next = next;
	}

	/**
	 * Method used to return the value
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
