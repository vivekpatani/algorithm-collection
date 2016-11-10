package leetcode.solutions;

/**
 * Input: PAYPALISHIRING
 * Output: PAHNAPLSIIGYIR for numRows = 3
 * @author flipswitch
 *
 */
public class ZigZagString {

	
	public static void main(String[] args) {
		
		System.out.println(convert("PAYPALISHIRING",3));
	}

	/**
	 * Converts the string to a zigzag format
	 * @param s
	 * @param numRows
	 * @return
	 */
	public static String convert(String s, int numRows) {

		char[] c = s.toCharArray();
		StringBuilder[] output = new StringBuilder[numRows];
		for (int i = 0; i < output.length; i++)
			output[i] = new StringBuilder();

		int len = s.length();
		int i = 0;
		while (i < len) {
			for (int j = 0; j < numRows && i < len; j++)
				output[j].append(c[i++]);
			for (int j = numRows - 2; j >= 1 && i < len; j--)
				output[j].append(c[i++]);
		}

		for (i = 1; i < output.length; i++)
			output[0].append(output[i]);
		return output[0].toString();
	}
}