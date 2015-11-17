/**
 * Vivek Patani {FlipSwitch}
 * DecimalToBinary.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.stack;

import com.vivekpatani.constants.Constants;

/**
 * This is conversion of decimal to binary using a stack.
 */
public class DecimalToBinary {
	
	private static int decimalInput;
	public DecimalToBinary (){
		init();
	}

	private static void init() {
		
		int count = 0;
		System.out.println(Constants.STACK_CONSTANTS[4]);
		decimalInput = Constants.sc.nextInt();
		
		Stack binaryStack = new Stack();
		while (decimalInput!=0){
			
			count++;
			binaryStack.push(decimalInput%2);
			decimalInput /= 2;
			
		}
		
		int[] poppedElement = new int[count];
		poppedElement = binaryStack.multiPop(count);
		
		displayOutput(poppedElement);
	}
	
	private static void displayOutput (int[] poppedElemenet) {
		
		System.out.print(Constants.STACK_CONSTANTS[5]);
		for (int i = 0; i < poppedElemenet.length; i++) {
			System.out.print(poppedElemenet[i]);
		}
	}
}
