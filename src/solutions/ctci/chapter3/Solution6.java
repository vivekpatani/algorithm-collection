package solutions.ctci.chapter3;

import java.util.Stack;

/**
 * Sort a stack with one additional stack at most.
 * @author flipswitch
 *
 */
public class Solution6 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.push(9);
		stack.push(4);
		stack.push(5);
		stack.push(1);
		stack.push(100);
		
		stack = sort (stack);
		
		System.out.println("Sorted:\n"+stack);
	}
	
	public static Stack<Integer> sort (Stack<Integer> stack) {
		
		Stack<Integer> tempStack = new Stack<>();
		
		while (!stack.isEmpty()) tempStack.push(stack.pop());
		
		while (!tempStack.isEmpty()) {
			
			if (stack.isEmpty()) stack.push(tempStack.pop());
			else {
				
				int data = tempStack.pop();
				int count = 0;
				while (data < stack.peek()) {
					tempStack.push(stack.pop());
					count++;
				}
				stack.push(data);
				while (count!=0) {
					stack.push(tempStack.pop());
					count--;
				}
			}
		}
		return stack;
	}
}
