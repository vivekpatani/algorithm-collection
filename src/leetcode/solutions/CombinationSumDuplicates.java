package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumDuplicates {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2, 3 };
		System.out.println(combinationSum(nums, 4));
	}

	public static List<List<Integer>> combinationSum(int nums[], int target) {
		Arrays.sort(nums);
		List<List<Integer>> output = new ArrayList<>();
		backtrack(output, new ArrayList<Integer>(), nums, target, 0);
		return output;
	}

	public static void backtrack(List<List<Integer>> output, ArrayList<Integer> temp, int[] nums, int remain,
			int start) {

		if (remain < 0)
			return;
		else if (remain == 0)
			output.add(new ArrayList<Integer>(temp));
		else {
			for (int i = start; i < nums.length; i++) {
				if (i > start && nums[i] == nums[i - 1])
					continue; // Skip Duplicates
				temp.add(nums[i]);
				backtrack(output, temp, nums, remain - nums[i], i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}

}
