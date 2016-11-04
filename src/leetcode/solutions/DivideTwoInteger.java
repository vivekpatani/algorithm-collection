package leetcode.solutions;

/**
 * https://leetcode.com/problems/divide-two-integers/
 * @author flipswitch
 *
 */
public class DivideTwoInteger {

	public static void main(String[] args) {
		System.out.println(divide(21,3) + " " + (15/4) + " Ok");
		System.out.println(divide(15,3) + " " + (15/3) + " Ok");
	}
	
	public static int divide(int dividend, int divisor) {
		
		while (divisor != 1) {
			divisor >>= 1;
			dividend >>= 1;
			System.out.println(Integer.toBinaryString(dividend) + " " + Integer.toBinaryString(divisor));
			
		}
		return dividend;
	}

}
