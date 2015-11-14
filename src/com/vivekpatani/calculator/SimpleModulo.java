/**
 * Vivek Patani {FlipSwitch}
 * SimpleModulo.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

/**
 * This class finds out the modulus of one another.
 */
public class SimpleModulo {
	private static int userInput1, userInput2, result1, result2;
	private static String tag;
	public SimpleModulo (int userInput1, int userInput2, String tag) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
		this.tag = tag;
		callModulo();
		System.out.println(tag + ": " + result1+"\n"+tag+": "+result2);
	}
	
	private static void callModulo (){
		result1 = userInput1 % userInput2;
		
		callModuloInvert();
	}
	
	public int getResult1(){
		return result1;
	}
	
	private static void callModuloInvert() {
		result2 = userInput2 % userInput1;
	}
	
	public int getResult2(){
		return result2;
	}
}