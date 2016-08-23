package solutions.ctci.chapter1;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String replacer = "%20";
		System.out.println(replace(input, replacer, 150));
		sc.close();
	}

	public static String replace (String input, String replacer, int size) {
		
		char[] outputArray = new char[size];
		int k=0;
		
		for (int i=0; i < input.length(); i++) {
			
			if (input.charAt(i) == ' ') {
				outputArray[k] = '%';
				outputArray[++k] = '2';
				outputArray[++k] = '0';
				++k;
			} else {
				outputArray[k] = input.charAt(i);
				k++;
			}
		}
		
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]);
		}
		
		return outputArray.toString();
	}
}
