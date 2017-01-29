package solutions.ctci.chapter1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse a String
 * @author flipswitch
 *
 */
public class Solution2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(reverse(input));
		System.out.println(reverse2(input));
		System.out.println(reverseInPlace(input));
		sc.close();
	}
	
	/**
	 * Reverse the String using a Stack
	 * @param input
	 * @return
	 */
	public static String reverse (String input) {
		
		
		StringBuffer output = new StringBuffer();
		Stack<Character> charStack = new Stack<Character>();
		
		for (int i=0; i<input.length(); i++) {
			
			charStack.push(input.charAt(i));
		}
		
		for (int i=0; i<input.length(); i++) {
			output.append(charStack.pop());
		}
		return output.toString();
	}
	
	/**
	 * Using a StringBuilder
	 * O(n)
	 * @param input
	 * @return
	 */
	public static String reverse2 (String input) {
		
		StringBuilder output = new StringBuilder();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			output.append(input.charAt(i));
		}
		
		return output.toString();
	}
	
	/**
	 * This is not technically in place since String is immutable
	 * But this O(n/2) = O(n) but half the computations
	 * @param input
	 * @return
	 */
	public static String reverseInPlace (String input) {
		
		StringBuilder inp = new StringBuilder(input);
		int i = 0, j = input.length() - 1;
		
		while (i < j) {
			char temp = input.charAt(i);
			inp.setCharAt(i, input.charAt(j));
			inp.setCharAt(j, temp);
			
			i++;
			j--;
		}
		
		return inp.toString();
	}

}
