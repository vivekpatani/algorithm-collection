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
		System.out.println("Top: "+top+"\nElement:"+stack.get(top));
		System.out.println(Constants.STACK_CONSTANTS[0] + ": " + dataElement);
		
	}
	
	/*
	 * This returns the top most elements of the stack
	 */
	public int peek () {
		return stack.get(top);
	}
	
	/*
	 * This is used to remove the top most element
	 * It also should check for underflow while popping
	 */
	public boolean pop () {
		if (isEmpty()){
			return false;
		}
		else {
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
