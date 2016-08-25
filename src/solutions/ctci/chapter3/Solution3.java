package solutions.ctci.chapter3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Stack of plates problem.
 * 
 * @author flipswitch
 *
 */
public class Solution3 {

	private static LinkedList<Stack> listOfStacks = new LinkedList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		sc.close();

		// To make it dynamic change for to while and ask for user prompt to
		// exit.
		for (int i = 0; i < limit; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = 0; j < limit; j++) {
				int value = (int) (Math.random() * 10); // sc.nextInt();
				stack.push(value);
			}
			listOfStacks.add(stack);
			System.out.println("Stack Created: " + listOfStacks.size());
		}

		System.out.println(listOfStacks);

		System.out.println(pop());
		System.out.println(pop(3));
	}

	public static int pop() {

		if (listOfStacks.isEmpty())
			return -1;
		Stack<Integer> temp = listOfStacks.getLast();
		if (temp.isEmpty()) {
			listOfStacks.removeLast();
			pop();
		}
		return temp.pop();
	}

	public static int pop(int position) {

		if (listOfStacks.isEmpty() || position > listOfStacks.size() - 1 || position < 1)
			return -1;
		Stack<Integer> temp = listOfStacks.get(position - 1);
		if (temp.isEmpty()) {
			listOfStacks.remove(position - 1);
			return -1;
		} else
			return temp.pop();
	}
}
