package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets-ii/
 * @author flipswitch
 *
 */
public class FindAllSubsetsDuplicates {

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 1, 2, 3};
		System.out.println(subsetsWithDup(nums) + " -> " + subsetsWithDup(nums).size());
	}
	
	/**
	 * Find all subsets containing duplicate elements
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        
		Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        backtrack (output, new ArrayList<>(), nums, 0);
        return output;
    }

	/**
	 * Backtracking all the solutions and generating each of them.
	 * @param output
	 * @param temp
	 * @param nums
	 * @param start
	 */
	public static void backtrack (List<List<Integer>> output, List<Integer> temp, int[] nums, int start) {
        
        output.add(new ArrayList<Integer>(temp));
        for (int i = start; i < nums.length; i++) {
        	
        	
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(output, temp, nums, i+1);
            temp.remove(temp.size() - 1);
        }
    }

}
