package solutions.ctci.chapter3;

public class StackFixed {
	
	private int[] stack;
	private int[] pointer;
	private int SIZE;
	
	/**
	 * N stacks in one array with a fixed SIZE
	 * @param n
	 */
	public StackFixed (int n) {
		stack = new int[n * 10];
		pointer = new int[n];
		for (int i = 0; i < n; i++) {
			pointer[i] = -1;
		}
		SIZE = 10;
	}
	
	public void push (int stackNum, int num) throws Exception {
		
		if (pointer[stackNum - 1] + 1 >= stackNum * SIZE) {
			throw new Exception("Limit Exceeded");
		}
		pointer[stackNum - 1] += 1;
		stack[pointer[stackNum - 1] + 1] = num;
	}
	
	public int pop (int stackNum) throws Exception {
		
		if (pointer[stackNum] == -1) {
			throw new Exception("Nothing to Pop");
		}
		
		int val = stack[pointer[stackNum]];
		pointer[stackNum] -= 1;
		
		return val;
	}
	
	public int peek (int stackNum) throws Exception {
		if (pointer[stackNum] == -1) {
			throw new Exception("Nothing to Peek");
		}
		
		return stack[pointer[stackNum]];
	}
	
	public void displayStack (int stackNum) throws Exception {
		if (pointer[stackNum] == -1) {
			throw new Exception("Nothing to Peek");
		}
		
		int startPoint = stackNum * SIZE - SIZE;
		
		for (int i = startPoint; i < pointer[stackNum]; i++) {
			System.out.print(stack[i] + " ");
		}
	}

}
