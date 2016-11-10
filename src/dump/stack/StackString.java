/**
 * Vivek Patani {FlipSwitch}
 * StackString.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.stack;

import java.util.ArrayList;

import dump.commonconstants.Constants;

/**
 * 
 */
public class StackString {

	private static int top;
	private static ArrayList<String> stack;

	/*
	 * Public constructor to initiate the Stack
	 */
	public StackString() {
		top = -1;
		stack = new ArrayList<String>();
	}

	/*
	 * This method is simply used to add elements to a Stack It pushes int
	 * elements to the Stack
	 */
	public void push(String dataElement) {
		top++;
		stack.add(dataElement);
		System.out.println(Constants.STACK_CONSTANTS[0] + ": " + dataElement);

	}

	/*
	 * This returns the top most elements of the stack
	 */
	public String peek() {

		if (isEmpty()) {
			return Constants.NULLL;
		} else {
			return stack.get(top);
		}
	}

	/*
	 * This is used to remove the top most element It also should check for
	 * underflow while popping The pop method is boolean since we might need it
	 * to return boolean while using it another implementation such as trees or
	 * other such algorithms
	 */
	public String pop() {
		if (isEmpty()) {
			System.out.println(Constants.STACK_CONSTANTS[3]);
			return Constants.NULLL;
		} else {
			// Use only for testing
			// System.out.println(Constants.STACK_CONSTANTS[1]+":
			// "+stack.get(top));
			String poppedElement = stack.get(top);
			stack.remove(top);
			top--;
			return poppedElement;
		}
	}

	/*
	 * Use to pop k elements together
	 */

	public String[] multiPop(int k) {
		String[] poppedElements = new String[k];
		while (k != 0) {
			poppedElements[k - 1] = pop();
			k--;
		}

		return poppedElements;

	}

	/*
	 * Checks whether if the stack is empty or not
	 */
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	/*
	 * Used to destroy the complete Stack.
	 */
	public void destroyStack() {
		stack.clear();
	}

}