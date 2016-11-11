package leetcode.solutions;

/**
 * https://leetcode.com/problems/divide-two-integers/
 * 
 * @author flipswitch <<<<<<< Updated upstream Solution:
 *         https://www.careercup.com/question?id=2772 =======
 *
 *         >>>>>>> Stashed changes
 */
public class DivideTwoInteger {

	public static void main(String[] args) {
		System.out.println(divide(-2147483648, 1) + " " + (-2147483648 / 1) + " Ok");
		// System.out.println(divide(15,3) + " " + (15/3) + " Ok");
	}

	/**
	 * Used to divide two numbers without division, mult or modulo.
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static int divide(int dividend, int divisor) {

		if (divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}

		int dividend_sign = dividend < 0 ? -1 : 1;
		int divisor_sign = divisor < 0 ? -1 : 1;

		long dividend_l = Math.abs((long) dividend);
		long divisor_l = Math.abs(divisor);

		long mask = 1;
		int quotient = 0;
		System.out.println(dividend_l);

		// While denominator less than numerator
		// Left Shift by 1, which means multiply by 2.
		// This is to ensure we do not cross the numerator, but ratio reaches
		// about 1.
		while (divisor_l <= dividend_l) {
			divisor_l <<= 1;
			mask <<= 1;

		}

		// While there is value in mask
		// Divide the denominator by 2.
		// Divide the mask by 2.
		// Quotient = quotient OR mask if numerator >= denominator
		while (mask > 1) {
			divisor_l >>= 1;
			mask >>= 1;
			if (dividend_l >= divisor_l) {
				dividend_l -= divisor_l;
				quotient |= mask;
			}
		}

		if (divisor_sign == -1 && dividend_sign == -1)
			return quotient;
		else if (divisor_sign == 1 && dividend_sign == 1)
			return quotient;
		else
			return -quotient;
	}

}
