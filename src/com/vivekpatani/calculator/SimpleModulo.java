/**
 * Vivek Patani {FlipSwitch}
 * SimpleModulo.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

/**
 * 
 */
public class SimpleModulo {
	private static float userInput1, userInput2, result;
	private static String tag;
	public SimpleModulo (float userInput1, float userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callModulo();
	}
	
	private static void callModulo (){
		result = userInput1 % userInput2;
		System.out.println(tag + ": " + result);
		callModuloInvert();
	}
	
	private static void callModuloInvert() {
		result = userInput2 % userInput1;
		System.out.println(tag + ": " +result);
	}
}