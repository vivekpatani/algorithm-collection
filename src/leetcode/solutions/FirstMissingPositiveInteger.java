package leetcode.solutions;

public class FirstMissingPositiveInteger {

	public static void main(String[] args) {
		
		int[] nums = new int[] {-1, -2, 2, 3, 4};
		System.out.println(findFirstMissingPositiveInteger(nums));
		
		nums = new int[] {0};
		System.out.println(findFirstMissingPositiveInteger(nums));
	}
	
	public static int findFirstMissingPositiveInteger (int[] nums) {
		
		int i = 0;
		while (i < nums.length) {
			
			// If number at this position = index OR if it is 0 or -ve OR if is greater than index
			if (nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) i++;
			else if (nums[nums[i] - 1] != nums[i]) swap (nums, i, nums[i] - 1);
			else i++;
		}
		
		int j = 0;
		while (j < nums.length && nums[j] == j+1) {
			j++;
		}
		
		return ++j;
	}
	
	public static void swap (int[] nums, int i, int j) {
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
