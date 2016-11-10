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
		sc.close();
	}
	
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

}
