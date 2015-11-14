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
		private static double userInput1, userInput2, result;
		private static String tag;
		
		public SimpleMultiplication (double userInput1, double userInput2, String tag) {
			this.userInput1 = userInput1;
			this.userInput2 = userInput2;
			this.tag = tag;
			System.out.println(tag + " :" + getResult());
			callMulitplication();
		}
		private static void callMulitplication(){
			result = userInput1 * userInput2;
			}
		
		public double getResult(){
			return result;
		}
	}