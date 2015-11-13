/**
 * Vivek Patani {FlipSwitch}
 * SimpleAddition.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

/**
 *  This is a simple addition class in Calculator
 */
public class SimpleAddition {
	
	private static float userInput1, userInput2, result;
	private static String tag;
	public SimpleAddition (float userInput1, float userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callAddition();
	}
	private static void callAddition (){
		result = userInput1 + userInput2;
		System.out.println(tag + " :" + result);
	}
}