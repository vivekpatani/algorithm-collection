/**
 * Vivek Patani {FlipSwitch}
 * StackCharacter.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.stack;

import java.util.Vector;

import dump.commonconstants.Constants;

/**
 * 
 */
public class StackCharacter {
	private static int top;
	private static Vector stack;
	private static char[] poppedElements;

	/*
	 * Public constructor to initiate the Stack
	 */
	public StackCharacter() {
		top = -1;
		stack = new Vector(5, 2);
	}

	/*
	 * This method is simply used to add elements to a Stack It pushes int
	 * elements to the Stack
	 */
	public void push(char dataElement) {
		top++;
		stack.add(dataElement);
		System.out.println(Constants.STACK_CONSTANTS[0] + ": " + dataElement);
	}

	/*
	 * This returns the top most elements of the stack The type cast is used to
	 * return a character as Vector deals with Objects
	 */
	public char peek() {

		if (isEmpty()) {
			return ' ';
		} else {
			return (char) stack.get(top);
		}
	}

	/*
	 * This is used to remove the top most element It also should check for
	 * underflow while popping The pop method is boolean since we might need it
	 * to return boolean while using it another implementation such as trees or
	 * other such algorithms
	 */
	public char pop() {
		if (isEmpty()) {
			System.out.println(Constants.STACK_CONSTANTS[3]);
			return ' ';
		} else {
			// Use only for testing
			// System.out.println(Constants.STACK_CONSTANTS[1]+":
			// "+stack.get(top));
			char poppedElement = (char) stack.get(top);
			stack.remove(top);
			top--;
			return poppedElement;
		}
	}

	/*
	 * Use to pop k elements together Returns a String value
	 */

	public String multiPop(int k) {
		poppedElements = new char[k];
		while (k != 0) {
			k--;
			poppedElements[k] = pop();
			System.out.println(poppedElements[k]);
		}
		return String.valueOf(poppedElements);
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

	/*
	 * To get the character Array back
	 */
	public char[] getCharArray() {
		return poppedElements;
	}
}