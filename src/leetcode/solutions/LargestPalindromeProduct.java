package leetcode.solutions;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		largestPalindrome(3);
	}

	public static int largestPalindrome(int n) {

		int lower = (int) Math.pow(10, n - 1);
		int higher = (int) Math.pow(10, n) - 1; // - lower;
		int product = 1;
		
		for (int i = higher; i >= lower; i--) {
			for (int j = higher; j >= lower; j--) {
				long prod = i * j;
//				if (isPalin(prod)) return (prod % 1337);
			}
		}
		
		return higher;
	}
	
	public static boolean isPalin (long number) {
		
//		String n = 
		int i = 0;
//		int j = n
		
		return true;
	}
}
