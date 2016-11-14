package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String multiply (String a, String b) {
		
		List<Integer> n1 = getList(a);
		List<Integer> n2 = getList(b);
		List<Integer> prod = new ArrayList<Integer>();
		int k = 0;
		int pcarry = 0;
		int num = 0;
		
		for (int i = b.length() - 1; i >= 0; i--) {
			for (int j = a.length() - 1; j >= 0; j--) {
				
				int p = n1.get(j) * n2.get(i);
				pcarry = p / 10;
				num = p % 10;
				if (prod.get(j - k) != null) {
					
				}
			}
			k++;
		}
		return "";
	}
	
	public static List<Integer> getList(String a) {
		
		List<Integer> number = new ArrayList<Integer>(a.length());
		
		for (int i = a.length() - 1; i >= 0; i--) {
			number.add(i, Character.getNumericValue(a.charAt(i)));
		}
		
		return number;
	}
}
