/**
 * Vivek Patani {FlipSwitch}
 * Stack.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.Stack;

import java.util.ArrayList;

import com.vivekpatani.Constants.Constants;

/**
 * Simple implementation of a Stack Data Structure
 */
public class Stack {
	
	private static int top;
	private static ArrayList<Integer> stack;
	
	/*
	 * Public constructor to initiate the Stack
	 */
	public Stack () {
		top = -1;
		stack = new ArrayList <Integer>();
	}
	
	/*
	 * This method is simply used to add elements to a Stack
	 * It pushes int elements to the Stack
	 */
	public void push (int dataElement) {
		top++;
		stack.add(dataElement);
		System.out.println(Constants.STACK_CONSTANTS[0] + ": " + dataElement);
		
	}
	
	/*
	 * This returns the top most elements of the stack
	 */
	public int peek () {
		
		if (isEmpty()){
			return -1;
		} else {
			return stack.get(top);
		}
	}
	
	/*
	 * This is used to remove the top most element
	 * It also should check for underflow while popping
	 * The pop method is boolean since we might need it to return boolean while using it another implementation
	 * such as trees or other such algorithms
	 */
	public boolean pop () {
		if (isEmpty()){
			System.out.println(Constants.STACK_CONSTANTS[3]);
			return false;
		}
		else {
			System.out.println(Constants.STACK_CONSTANTS[1]+": "+stack.get(top));
			top--;
			return true;
		}
	}
	
	/*
	 * Checks whether if the stack is empty or not 
	 */
	public boolean isEmpty () {
		if (top == -1) return true;
		else return false;
	}
	
}
