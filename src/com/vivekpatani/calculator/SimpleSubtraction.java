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
	
	private static double userInput1, userInput2, result;
	private static String tag;
	
	public SimpleSubtraction (double userInput1, double userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callSubtraction();
		System.out.println(tag + " :" + getResult());
	}
	private static void callSubtraction (){
		result = userInput1 - userInput2;
	}
	
	public double getResult(){
		return result;
	}
}