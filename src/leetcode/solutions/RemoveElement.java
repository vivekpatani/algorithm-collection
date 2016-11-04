package leetcode.solutions;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] nums = new int[] {3,2,2,3};
		display(nums, removeElement(nums, 3));
	}

	public static int removeElement(int[] nums, int val) {
		
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				n--;
			}
			else i++;
		}
		return n;
	}
	
	public static void display(int[] nums, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}

}
