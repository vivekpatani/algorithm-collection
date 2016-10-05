package leetcode.solutions;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb")); //abc
		System.out.println(lengthOfLongestSubstring("bbbbb")); //b
		System.out.println(lengthOfLongestSubstring("pwwkew")); //wke
	}

	public static int lengthOfLongestSubstring(String s) {

		HashSet<Character> longest = new HashSet<Character>();
		int i = 0; // Slow Pointer
		int j = 0; // Fast Pointer
		int max = 0; // Max

		while (j < s.length()) {

			if (!longest.contains(s.charAt(j))) {
				longest.add(s.charAt(j++));
				max = Math.max(longest.size(), max);
			} else {
				longest.remove(s.charAt(i++));
			}
		}
		return max;

	}

}
