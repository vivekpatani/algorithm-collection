package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 * @author flipswitch
 *
 */
public class FindAllSubsets {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 2, 3};
		System.out.println(subsets(nums) + " -> " + subsets(nums).size());
	}
	
	/**
	 * Find all possible combin
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> subsets (int[] nums) {
		
		List<List<Integer>> output = new ArrayList<>();
		backtrack (output, new ArrayList<>(), nums, 0);
		return output;
	}
	
	public static void backtrack (List<List<Integer>> output, ArrayList<Integer> temp, int[] nums, int start) {
		
		output.add(new ArrayList<Integer>(temp));
		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backtrack(output, temp, nums, i+1);
			temp.remove(temp.size() - 1);
		}
	}

}
