package leetcode.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSubArray {

	public static void main(String[] args) {
		
		int[] nums = new int[] {-2,1,3};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray (int[] nums) {
		
		List<Integer> output = new ArrayList<>();
		backtrack (output, new ArrayList<Integer>(), nums, 0);
		return Collections.max(output);
	}
	
	public static void backtrack (List<Integer> output, ArrayList<Integer> temp, int[] nums, int start) {
		
		output.add(sum(new ArrayList<Integer>(temp)));
		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backtrack(output, temp, nums, start + 1);
			temp.remove(temp.size() - 1);
		}
	}
	
	public static int sum (List<Integer> list) {
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
