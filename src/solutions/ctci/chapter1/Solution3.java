package solutions.ctci.chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * If One String is permutation of the other
 * Given two strings, write a method to decide if one is a permutation of the other
 * @author flipswitch
 *
 */
public class Solution3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();

		if (input1.length() < input2.length()) {
			String temp = input1;
			input1 = input2;
			input2 = temp;
		}

		System.out.println(checkPermutation(input1, input2));
		System.out.println(checkPermutation2(input1, input2));
		System.out.println(checkPermutation3(input1, input2));
		sc.close();
	}

	/**
	 * Checking permutation by sorting the String
	 * 
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static boolean checkPermutation(String input1, String input2) {

		char[] inputArray1 = input1.toCharArray();
		char[] inputArray2 = input2.toCharArray();

		Arrays.sort(inputArray1);
		Arrays.sort(inputArray2);

		System.out.println(inputArray1);
		System.out.println(inputArray2);

		return new String(inputArray1).equals(new String(inputArray2));
	}

	/**
	 * Checking permutation with hashset
	 * 
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static boolean checkPermutation2(String input1, String input2) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < input1.length(); i++) {
			if (charMap.containsKey(input1.charAt(i)))
				charMap.put(input1.charAt(i), charMap.get(input1.charAt(i)) + 1);
			else
				charMap.put(input1.charAt(i), 1);
		}

		for (int i = 0; i < input2.length(); i++) {
			if (!charMap.containsKey(input2.charAt(i)) || charMap.get(input2.charAt(i)) <= 0) {
				return false;
			} else {
				charMap.put(input2.charAt(i), charMap.get(input1.charAt(i)) - 1);
			}
		}
		return true;
	}
	
	/**
	 * Checking permutation with the help of arrays
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static boolean checkPermutation3 (String input1, String input2) {
		
		int[] asciiVal = new int[256];
		
		for (int i = 0; i < input1.length(); i++) {
			asciiVal[(int) input1.charAt(i)] += 1;
		}
		
		for (int j = 0; j < input2.length(); j++) {
			if (asciiVal[(int) input2.charAt(j)] <= 0) return false;
			asciiVal[(int) input2.charAt(j)] -= 1;
		}
		
		return true;
	}
	
}