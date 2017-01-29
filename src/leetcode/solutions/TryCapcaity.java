package leetcode.solutions;

public class TryCapcaity {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(fiboRecursive(8));
		System.out.println(fiboIterative(8));
	}
	
	public static int fiboRecursive (int n) {
		
		if (n <= 1) return n;
		return fiboRecursive(n-1) + fiboRecursive(n - 2);
	}
	
	public static int fiboIterative (int n) {
		
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		
		for (int i = 0; i < n; i++) {
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		
		return num1;
	}
}
