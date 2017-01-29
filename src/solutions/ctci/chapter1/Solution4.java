package solutions.ctci.chapter1;

import java.util.Scanner;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the
 * string has sufficient space at the end of the string to hold the additional characters,
 * and that you are given the "true" length of the string. (Note: if implementing in Java,
 * please use a character array so that you can perform this operation in place.)
 * @author flipswitch
 *
 */
public class Solution4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String replacer = "%20";
		System.out.println(replace(input, replacer, 150));
		sc.close();
	}

	/**
	 * Replace space with %20
	 * @param input
	 * @param replacer
	 * @param size
	 * @return
	 */
	public static String replace (String input, String replacer, int size) {
		
		char[] outputArray = new char[size];
		int k=0;
		
		for (int i=0; i < input.length(); i++) {
			
			if (input.charAt(i) == ' ') {
				outputArray[k] = replacer.charAt(0);
				outputArray[++k] = replacer.charAt(1);
				outputArray[++k] = replacer.charAt(2);
				++k;
			} else {
				outputArray[k] = input.charAt(i);
				k++;
			}
		}
		
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]);
		}
		
		return outputArray.toString();
	}
}
