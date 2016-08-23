package solutions.ctci.chapter1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Question to check whether if the string contains all unique characters.
 * @author flipswitch
 *
 */
public class Solution1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(isUnique(input));
		sc.close();
	}
	
	public static boolean isUnique (String input) {
		
		Collection<Character> charMap = new HashSet<Character>();
		
		for (int i=0; i<input.length(); i++) {
			
			if (!charMap.add(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
