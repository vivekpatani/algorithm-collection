/**
 * Vivek Patani {FlipSwitch}
 * SimpleMultiplication.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

/**
 * 
 */
public class SimpleMultiplication {	
		private static float userInput1, userInput2, result;
		private static String tag;
		
		public SimpleMultiplication (float userInput1, float userInput2, String tag) {
			this.userInput1 = userInput1;
			this.userInput2 = userInput2;
			this.tag = tag;
			callMulitplication();
		}
		private static void callMulitplication(){
			result = userInput1 * userInput2;
			System.out.println(tag + " :" + result);
		}
	}