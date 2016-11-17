package leetcode.solutions;

import java.util.regex.Pattern;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = new String("Hello World");
		System.out.println(lengthOfLastWord(s));
		
		s = new String("");
		System.out.println(lengthOfLastWord(s));
		
		s = new String("Hello");
		System.out.println(lengthOfLastWord(s));
		
		s = new String(" ");
		System.out.println(lengthOfLastWord(s));
		
	}
	
	public static int lengthOfLastWord (String s) {
		
		if (s.isEmpty() || s.equals("")) return 0;
		
		String[] input = s.split(Pattern.quote(" "));
		
		if (input.length == 0) return 0;
		
		return input[input.length - 1].length();
	}

}
