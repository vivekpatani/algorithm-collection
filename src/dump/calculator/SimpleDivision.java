/**
 * Vivek Patani {FlipSwitch}
 * SimpleDivision.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.calculator;

import dump.commonconstants.Constants;

/**
 * This code executes simple Division.
 */
public class SimpleDivision {

	private static double userInput1, userInput2, result1, result2;
	private static String tag;
	private static boolean zeroResult = false;

	public SimpleDivision(double userInput1, double userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		zeroResult = zeroErrorHandler(userInput1, userInput2);
		if (zeroResult) {
			System.out.println(Constants.ERROR_MESSAGE_OTHER);
			System.exit(0);
		}
		callDivision();
		System.out.println(tag + ": " + getResult1() + "\n" + tag + ": " + getResult2());
	}

	private static void callDivision() {
		result1 = userInput1 / userInput2;
		callDivisionInvert();
	}

	public double getResult1() {
		return result1;
	}

	private static void callDivisionInvert() {
		result2 = userInput2 / userInput1;

	}

	public double getResult2() {
		return result2;
	}

	private static boolean zeroErrorHandler(double userInput1, double userInput2) {
		if (userInput1 == 0.0 || userInput2 == 0.0)
			zeroResult = true;
		return zeroResult;
	}

	public boolean getZeroResult() {
		return zeroResult;
	}
}