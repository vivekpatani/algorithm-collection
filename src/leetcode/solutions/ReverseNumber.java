package leetcode.solutions;

public class ReverseNumber {

	public static void main(String[] args) {
		//System.out.println(reverse(9646324351));
	}

	public static int reverse(int x) {

		// Storing the number in StringBuffer
		StringBuffer output = new StringBuffer();

		// Check for Negative Number so that I can add negative sign later
		boolean flag = false;

		// If less than 0, it is negative. Ha!
		if (x < 0)
			flag = true;

		// From int to sb
		output.append(Math.abs(x));

		// Left Index
		int i = 0;

		// Right Index
		int j = output.length() - 1;

		// Half way
		while (i <= j) {
			// Replace them every time until i crosses j
			output = replace(output, i, j);
			i++;
			j--;
		}

		// Adding the negative sign and converting back to Integer
		if (flag)
			return -1 * Integer.parseInt(output.toString());
		else
			return Integer.parseInt(output.toString());
	}

	/**
	 * Just some replace method
	 **/
	public static StringBuffer replace(StringBuffer input, int i, int j) {

		char temp = input.charAt(i);
		input.setCharAt(i, input.charAt(j));
		input.setCharAt(j, temp);

		return input;
	}

}
