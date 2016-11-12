package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPermutationsDuplicate {
	
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 2, 3};
		System.out.println(permutations(nums));
	}
	
	public static List<List<Integer>> permutations (int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> output = new ArrayList<>();
		backtrack(output, new ArrayList<>(), nums, new boolean[nums.length]);
		return output;
	}
	
	public static void backtrack (List<List<Integer>> output, List<Integer> temp, int[] nums, boolean[] used) {
		
		// If all elements have been included, add it to output list.
		if (nums.length == temp.size()) {
			output.add(new ArrayList<Integer>(temp));
		} else {
			for (int i = 0; i < nums.length; i++) {
				
				// If element is used OR if current value = previous AND it isn't used, there is no need to use the current
				// Just continue
				if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
				used[i] = true;
				temp.add(nums[i]);
				backtrack(output, temp, nums, used);
				used[i] = false;
				temp.remove(temp.size() - 1);
			}
		}
	}
}
