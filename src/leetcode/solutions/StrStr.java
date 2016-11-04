package leetcode.solutions;

public class StrStr {

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issip"));
	}

	public static int strStr(String haystack, String needle) {

		if (haystack.isEmpty() && needle.isEmpty())
			return 0;
		
		if (needle.isEmpty()) return 0;
		
		if (haystack.isEmpty()) return -1;

		for (int i = 0; i < haystack.length(); i++) {

			if (haystack.charAt(i) == needle.charAt(0)) {
				int j = 0;
				int k = i;
				int anchor = i;
				while (k < haystack.length() && j < needle.length() && haystack.charAt(k) == needle.charAt(j)) {
					System.out.println("Compare: " + haystack.charAt(k) + " " + needle.charAt(j) + " " + k + " " + j);
					k++;
					j++;
				}
				if (j == needle.length())
					return anchor;
			}
		}
		return -1;
	}
}