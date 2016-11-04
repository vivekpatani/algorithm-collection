package leetcode.solutions;

public class LongestValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(longestValidParentheses("()()()((()()()()"));
	}
	
	public static int longestValidParentheses(String s) {
		
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length() - 1; i++) {
			
			if (i+1 < s.length() && s.charAt(i) == '(' && s.charAt(i+1) == ')') {
				count++;
				count++;
				i++;
				if (count > max) max = count;
				
			} else count = 0;
		}
		return max == Integer.MIN_VALUE ? 0 : max;
	}
}
