/**
 * Vivek Patani {FlipSwitch}
 * ImplementStack.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.Stack;

import com.vivekpatani.Constants.Constants;

/**
 * 
 */
public class ImplementStack {

	/**
	 * Sample Implementation of the Stack Data Structure
	 */
	public static void main(String[] args) {
		
		Stack newStack = new Stack();
		newStack.push(100);
		newStack.push(101);
		newStack.push(102);
		newStack.push(103);
		newStack.push(104);
		
		System.out.println(Constants.STACK_CONSTANTS[2] +": "+ newStack.peek());
		
		newStack.pop();
		newStack.pop();
		
		System.out.println(Constants.STACK_CONSTANTS[2] +": "+ newStack.peek());
		
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		
		System.out.println(Constants.STACK_CONSTANTS[2] +": "+ newStack.peek());
	}

}
