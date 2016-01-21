/**
 * Vivek Patani {FlipSwitch}
 * StackInteger.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algortihm_collection.stack;

import java.util.ArrayList;

/**
 * This is a simple implementation of the Stack.
 * @param
 */
public class StackInteger {
	
	//Basic Variable required in a stack
	private ArrayList <Integer> stack;
	private int top;
	
	/**
	 * Method to construct the initial variables 
	 */
	public StackInteger() {
		top = -1;
		stack = new ArrayList<Integer>();
	}

	/**
	 * Method to check whether if the stack is empty.
	 * @return
	 */
	boolean isEmpty(){
		if(stack.isEmpty()){
			return true;
		} else return false;
	}
	
	/**
	 * Method to push dataElement in the stack.
	 * @param dataElement
	 * @return
	 */
	void push (int dataElement){
		stack.add(dataElement);
		top++;
		System.out.println("\nPushed: "+dataElement);
	}
	
	/**
	 * Method  to pop the top most element in the stack.
	 * @return
	 */
	int pop() {
		
		//If Stack is empty, there is nothing to pop
		if(isEmpty()){
			return -1;
		} else {
			
			//Remove the last element
			int poppedElement = stack.get(top);
			stack.remove(top);
			System.out.println("Popped: "+poppedElement);
			top--;
			return poppedElement;
		}
	}
	
	/**
	 * To return the top of the stack.
	 * @return
	 */
	int peek(){
		
		//Return -1 if stack is empty.
		if(isEmpty()){
			System.out.println("Nothing to peek, Stack Empty!");
			return -1;
		} else {
			
			//Fetch the top of the stack.
			System.out.println("Peek - a - boo: "+stack.get(top));
			return stack.get(top);
		}
	}
	
	/**
	 * Method to pop multiple elements together.
	 * @return
	 */
	int[] multipop() {
		
		int poppedElement[] = {-1};
		if(isEmpty()){
			return poppedElement;
		} else {
			for(int i=top; i>=0; i--)
				poppedElement[i] = pop();
				return poppedElement;
		}
	}

	
	/**
	 * Method to return the stack
	 * @return
	 */
	public ArrayList<Integer> getStack(){
		return stack;
	}
	
	/**
	 * Method to return top of stack
	 * @return
	 */
	public int getTop(){
		return top;
	}
	
	/**
	 * Method to return the element at the current location.
	 * @param location
	 * @return
	 */
	public int elementAt(int location){
		return stack.get(location);
	}
}