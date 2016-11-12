package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-partitioning/
 * @author flipswitch
 *
 */
public class PalindromeParitioning {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String("aab");
		System.out.println(palindromePartition(s));
	}
	
	/**
	 * Generates all palindrome partitions
	 * @param s
	 * @return
	 */
	public static List<List<String>> palindromePartition (String s) {
		
		List<List<String>> output = new ArrayList<>();
		backtrack(output, new ArrayList<String>(), s, 0);
		return output;
	}
	
	/**
	 * Backtracks its way up to all possible solutions
	 * @param output
	 * @param temp
	 * @param s
	 * @param start
	 */
	public static void backtrack (List<List<String>> output, ArrayList<String> temp, String s, int start) {
		
		if (s.length() == start) output.add(new ArrayList<String>(temp));
		for (int i = start; i < s.length(); i++) {
			if (isPalindrome(s, start, i)) {
				temp.add(s.substring(start, i + 1));
				backtrack(output, temp, s, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	/**
	 * Checks whether if input string is palindrome or not.
	 * @param s
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean isPalindrome (String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) return false;
			start++;
			end--;
		}
		return true;
	}
}
