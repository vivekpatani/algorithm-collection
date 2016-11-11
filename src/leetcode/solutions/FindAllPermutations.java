package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 * @author flipswitch
 *
 */
public class FindAllPermutations {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 2, 3};
		System.out.println(permutation(nums));
	}
	
	/**
	 * Find all permutations
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> permutation(int[] nums) {
		
		List<List<Integer>> output = new ArrayList<>();
		backtrack (output, new ArrayList<>(), nums);
		return output;
	}
	
	/**
	 * Backtrack recursively to all solutions and generate.
	 * @param output
	 * @param temp
	 * @param nums
	 */
	public static void backtrack (List<List<Integer>> output, List<Integer> temp, int[] nums) {
		
		// If the list is same as num size, it means
		// We have generated numbers for all possible combinations for this 
		// current number.
		if (temp.size() == nums.length) {
			// Each time store solution in a new list, because the current
			// temp may be mutated further.
			output.add(new ArrayList<>(temp));
			
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (temp.contains(nums[i])) continue; // If already there, skip it
				// Else add the missing number
				temp.add(nums[i]);
				backtrack(output, temp, nums);
				System.out.print(temp);
				temp.remove(temp.remove(temp.size() - 1));
				System.out.print(" -> " + temp);
				System.out.print(" ==== " + output);
				System.out.println();
				
			}
		}
	}

}
