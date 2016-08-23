package solutions.ctci.chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * If One String is permutation of the other
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
		sc.close();
	}

	public static boolean checkPermutation (String input1, String input2) {
		
		char[] inputArray1 = input1.toCharArray();
		char[] inputArray2 = input2.toCharArray();
		
		Arrays.sort(inputArray1);
		Arrays.sort(inputArray2);
		
		System.out.println(inputArray1);
		System.out.println(inputArray2);
		
		return inputArray1.toString().equals(inputArray2.toString());
		
	}
}
