package leetcode.solutions;

/**
 * https://leetcode.com/problems/count-and-say/
 * @author flipswitch
 *	Incomplete
 *
 */
public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
		System.out.println(countAndSay(11));
		System.out.println(countAndSay(21));

	}
	
	public static String countAndSay(int n) {
        
		StringBuilder output = new StringBuilder();
		String nums = Integer.toString(n);
		
		for (int i = 0; i < nums.length(); i++) {
			char current = nums.charAt(i);
			
			if (i == nums.length() - 1) {
			}
		}
		
		return output.toString();
    }
}
