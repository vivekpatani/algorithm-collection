package solutions.ctci.chapter1;

import java.util.Scanner;

/**
 * Check if the rotated string == original string eg: waterbottle -> terbottlewat
 * @author flipswitch
 *
 */
public class Solution8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String compare = sc.nextLine();
		System.out.println("What I understood:" + rotationWrong(input, compare));
		System.out.println("What they expected:" + rotationRight(input, compare));
		sc.close();
	}

	public static boolean rotationWrong(String input, String compare) {

		int length = input.length();
		int index = 0;
		StringBuilder temp = new StringBuilder(input);

		while (length != index) {

			char c = temp.charAt(length - 1);
			temp.deleteCharAt(length - 1);
			temp.insert(0, c);
			if (temp.toString().equals(compare.toString())) {
				System.out.println(temp + " " + input);
				return true;
			}
			index++;
		}

		return false;
	}

	public static boolean rotationRight(String input, String compare) {

		if (input.length() != compare.length())
			return false;
		String combine = input + input;

		return combine.toLowerCase().contains(compare.toLowerCase());
	}
}
