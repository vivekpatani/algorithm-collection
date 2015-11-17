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
	
	/*
	 * Basic Constructor to Call the init method
	 */
	private static Stack binaryStack;
	public DecimalToBinary (){
		
		binaryStack = new Stack();
		init();
	}

	/*
	 * This is the basic driver programme in order to convert the input
	 * to binary
	 */
	private static void init() {
		
		int count = 0;
		System.out.println(Constants.STACK_CONSTANTS[4]);
		decimalInput = Constants.sc.nextInt();
		
		while (decimalInput!=0){
			count++;
			binaryStack.push(convertToBinary(decimalInput));
			decimalInput = dividerByTwo(decimalInput);
		}
		
		int[] poppedElement = new int[count];
		poppedElement = binaryStack.multiPop(count);
		
		displayOutput(poppedElement);
	}
	
	/*
	 * This is simply used to convert the input to Binary
	 */
	private static int convertToBinary (int number) {
		return (number%2);
	}
	
	/*
	 * This function simply divides the input by 2
	 */
	private static int dividerByTwo (int number) {
		return (number/2);
	}
	
	/*
	 * Function to simply displayed the multipopped output
	 */
	private static void displayOutput (int[] poppedElemenet) {
		
		System.out.print(Constants.STACK_CONSTANTS[5]);
		for (int i = 0; i < poppedElemenet.length; i++) {
			System.out.print(poppedElemenet[i]);
		}
	}
}