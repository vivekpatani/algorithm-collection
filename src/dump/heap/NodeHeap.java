/**
 * Vivek Patani {FlipSwitch}
 * NodeHeap.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.heap;

/**
 * 
 */
public class NodeHeap {

	private NodeHeap left, right;
	private int value;

	public NodeHeap() {
		left = null;
		right = null;
	}

	public NodeHeap(int value) {
		left = null;
		right = null;
		this.value = value;
	}

	/**
	 * @return the left
	 */
	public NodeHeap getLeftRef() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeftRef(NodeHeap left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public NodeHeap getRightRef() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(NodeHeap right) {
		this.right = right;
	}

	/**
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
