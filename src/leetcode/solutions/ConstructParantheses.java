package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class ConstructParantheses {

	public static void main(String[] args) {
		
		System.out.println(calling(4));
	}
	
	public static List<String> calling (int n) {
		
		List<String> result = new ArrayList<String>();
		
		if (n == 0) return result;
		
		construction(result, "", n, n);
		return result;
		
	}
	
	public static void construction (List<String> result, String present, int left, int right) {
		
		if (right == 0) result.add(present);
		
		if (left > 0) {
			System.out.println("Result: " + result + " Present: " + present + " Left: " + left + " Right: " + right);
			construction (result, present + "(", left - 1, right);
		}
		
		if (right > left) {
			System.out.println("Result: " + result + " Present: " + present + " Left: " + left + " Right: " + right);
			construction (result, present + ")", left, right - 1);	
		}
		
	}

}
