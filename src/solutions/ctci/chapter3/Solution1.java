package solutions.ctci.chapter3;

public class Solution1 {

	public static void main(String[] args) throws Exception {
		StackFixed stack = new StackFixed(3);
		
		// Adding to Stack 1
		stack.push(1, 0);
		stack.push(1, 1);
		stack.push(1, 2);
		
		//Adding to Stack 2
		stack.push(2, 3);
		stack.push(2, 4);
		stack.push(2, 5);
		
		//Adding to Stack 3
		stack.push(3, 6);
		stack.push(3, 7);
		stack.push(3, 8);
		
		stack.displayStack(1);
	}

}
