/**
 * Vivek Patani {FlipSwitch}
 * SimpleDivision.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

/**
 * 
 */
public class SimpleDivision {
	
	private static float userInput1, userInput2, result;
	private static String tag;
	public SimpleDivision (float userInput1, float userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callDivision();
	}
	
	private static void callDivision (){
		result = userInput1 / userInput2;
		System.out.println(tag + ": " + result);
		callDivisionInvert();
	}
	
	private static void callDivisionInvert() {
		result = userInput2/userInput1;
		System.out.println(tag + ": " +result);
	}
}