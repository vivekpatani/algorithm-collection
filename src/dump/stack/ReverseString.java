/**
 * Vivek Patani {FlipSwitch}
 * ReverseString.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.stack;

import dump.commonconstants.Constants;

/**
 * 
 */
public class ReverseString {

	private static StackCharacter stack = new StackCharacter();
	private static String inputString;

	ReverseString() {
		// Silence is Golden.
		init();
	}

	private static void init() {
		getInput();
		stringReversal(inputString);
	}

	private static void getInput() {
		System.out.print("Please Enter String: ");
		inputString = Constants.sc.next();
	}

	private static void stringReversal(String inputString) {

		int count = 0;
		int length = inputString.length();
		while (length != 0) {
			stack.push(inputString.charAt(count));
			count++;
			length--;
		}
		System.out.println("Reversed String: " + stack.multiPop(count));
	}

}
