package interviews.eai;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorialRecursive(0));
		System.out.println(factorialIterative(0));
	}
	
	public static int factorialRecursive (int num) {
		
		if (num == 0) return 1;
		return num * factorialRecursive(num - 1);
	}
	
	public static int factorialIterative (int num) {
		
		int solution = 1;
		for (int i = num; i > 0; i--) {
			solution *= i;
		}
		
		return solution;
	}
}
