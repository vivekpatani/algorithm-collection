/**
 * Vivek Patani {FlipSwitch}
 * SimpleAddition.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.calculator;

/**
 * This is a simple addition class in Calculator
 */
public class SimpleAddition {

	private static double userInput1, userInput2, result;
	private static String tag;

	public SimpleAddition(double userInput1, double userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callAddition();
		System.out.println(tag + " :" + getResult());
	}

	private static void callAddition() {
		result = userInput1 + userInput2;
	}

	public double getResult() {
		return result;
	}

}