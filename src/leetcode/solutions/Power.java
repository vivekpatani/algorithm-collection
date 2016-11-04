package leetcode.solutions;

public class Power {

	public static void main(String[] args) {
		System.out.println(mathPow(2,8));
	}
	
	public static double mathPow (double x, int n) {
		
		if (n == 0 && x == 0) return 1;
		
		if (n == 0) return 1;
		
		if (n < 0) {
			n = -n;
			x = 1/x;
		}
		
		if (n % 2 == 0) return mathPow(x*x, n/2);
		else return x * mathPow (x*x, n/2);
	}

}
