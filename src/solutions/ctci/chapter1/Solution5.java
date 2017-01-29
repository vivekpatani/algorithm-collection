package solutions.ctci.chapter1;

import java.util.Scanner;

/**
 * Compress a String such that aaaabbcc is a4b2c2 and return the shorter of them both.
 * @author flipswitch
 *
 */
public class Solution5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(compressor(input));
		sc.close();
	}
	
	/**
	 * Compressing String to a given standard.
	 * @param input
	 * @return
	 */
	public static String compressor (String input) {
		
		StringBuffer result = new StringBuffer();
		int count = 0;
		char prev = input.charAt(0);
		for (int i = 0; i < input.length(); i++) {
			
			char current = input.charAt(i);
			if (current!=prev) {
				result.append(prev+""+count+"");
				count=1;
			} else {
				count++;
			}
			prev = input.charAt(i);
		}
		result.append(prev+""+count+"");
		
		if (result.toString().length() < input.length())
			return result.toString();
		else return input;
	}

}
