/**
 * Vivek Patani {FlipSwitch}
 * SimpleSubtraction.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

/**
 * This is a simple Subtraction Class.
 */
public class SimpleSubtraction {
	
	private static float userInput1, userInput2, result;
	private static String tag;
	
	public SimpleSubtraction (float userInput1, float userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callSubtraction();
	}
	private static void callSubtraction (){
		result = userInput1 - userInput2;
		System.out.println(tag + " :" + result);
	}
}