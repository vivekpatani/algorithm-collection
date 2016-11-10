package leetcode.solutions;

public class LongestPallindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int low = 0, max = 0;

	public String longestPalindrome(String s) {

		// If length is less than 2
		if (s.length() < 2)
			return s;

		int len = s.length() - 1;

		for (int i = 0; i < len; i++) {

			// Give the starting point and let the function explore palindromes
			extendedPalindrome(s, i, i); // odd
			extendedPalindrome(s, i, i + 1); // even
		}

		// Return substring of the palindrome
		return s.substring(low, low + max);
	}

	public void extendedPalindrome(String s, int i, int j) {

		// Explore to the left and right of the current index
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}

		// If the new max is greater than the previous max, voila, update it!
		// We need to reduce max by 1 and add 1 to low, because the executions have
		// gone one step ahead because of the while loop
		if (max < j - i - 1) {
			low = i + 1;
			max = j - i - 1;
		}
	}

}
