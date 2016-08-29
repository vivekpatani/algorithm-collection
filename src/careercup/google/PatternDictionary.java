package careercup.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://careercup.com/question?id=5704645247762432
 * Given a Pattern and a dictionary, print out all the strings
 * that match the pattern. where a
 * character in the pattern is mapped uniquely to a character in the dictionary
 * ( this is what i was given first). 
 * 
 * e.g 1. ("abc" , &lt;"cdf", "too", "hgfdt","paa"&gt;) 
 * output = "cdf"
 * 
 * 2. ("acc" , &lt;"cdf", "too", "hgfdt","paa"&gt;)
 * output = "too", "paa"
 * 
 * @author priyesh
 *
 */
public class PatternDictionary {

	public static void main(String[] args) {
		String pattern = "ccc";
		String[] dictionary = { "cdf", "too", "hfgdt", "paa", "aaa" };
		System.out.println(findMatch(dictionary, pattern));
	}

	private static List<String> findMatch(String[] dictionary, String pattern) {
		List<String> result = new ArrayList<String>();
		String encodePattern = encode(pattern);
		for (String s : dictionary) {
			if (encode(s).equals(encodePattern)) {
				System.out.println(encode(s));
				result.add(s);
			}
		}
		return result;
	}

	private static String encode(String pattern) {
		Map<Character, Integer> encoder = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		int counter = 1;
		for (char c : pattern.toCharArray()) {
			if (null == encoder.get(c)) {
				encoder.put(c, counter++);
			}
			sb.append(encoder.get(c));
		}
		return sb.toString();
	}

}
