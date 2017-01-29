package interviews.mathworks;

import java.io.*;
import java.util.*;

public class SubString {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int numArgs = sc.nextInt();

		one: for (int i = 0; i < numArgs; i++) {
			char[] str1 = sc.nextLine().toCharArray();
			char[] str2 = sc.nextLine().toCharArray();

			HashSet<Character> set = new HashSet<Character>();

			for (int p = 0; p < str1.length; p++)
				set.add(str1[p]);
			for (int q = 0; q < str2.length; q++)
				if (set.contains(str2[q])) {
					System.out.println("YES");
					continue one;
				}

			System.out.println("NO");
		}

	}
}