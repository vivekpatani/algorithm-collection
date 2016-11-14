package leetcode.solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<Integer>> maxSubArray (int[] nums) {
		
		List<List<Integer>> output = new ArrayList<>();
		backtrack (output, new ArrayList<Integer>(), nums, 0, Integer.MIN_VALUE);
		return output;
	}
	
	public static void backtrack (List<List<Integer>> output, ArrayList<Integer> temp, int[] nums, int start, int max) {
		
		output.add(new ArrayList<Integer>(temp));
		if (sum(temp) > max) {
			max = sum(temp);
			System.out.println(max);
		}
		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backtrack(output, temp, nums, start + 1, max);
			temp.remove(temp.size() - 1);
		}
	}
	
	public static int sum (List<Integer> list) {
		
		int sum = 0;
		for (int x: list) {
			sum += list.get(x);
		}
		return sum;
	}
}
