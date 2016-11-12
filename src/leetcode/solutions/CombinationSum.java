package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3};
		System.out.println(combinationSum(nums, 4));
	}
	
	public static List<List<Integer>> combinationSum (int candidates[], int target) {
		Arrays.sort(candidates);
		List<List<Integer>> output = new ArrayList<>();
		backtrack (output, new ArrayList<Integer>(), candidates, target, 0);
		return output;
	}
	
	public static void backtrack (List<List<Integer>> output, ArrayList<Integer> temp, int[] nums, int remain, int start) {
		
		if (remain < 0) return;
		else if (remain == 0) output.add(new ArrayList<Integer>(temp));
		else {
			for (int i = start; i < nums.length; i++) {
				temp.add(nums[i]);
				backtrack(output, temp, nums, remain - nums[i], i);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
