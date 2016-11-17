package leetcode.solutions;

public class JumpGame {

	public static void main(String[] args) {
		
		int[] nums = new int[]{2,3,1,1,4};
		System.out.println(jumpGame(nums));
		
		nums = new int[] {3,2,1,0,4};
		System.out.println(jumpGame(nums));
	}
	
	public static boolean jumpGame (int nums[]) {
		int idx = nums[0] % (nums.length + 1);
		for (int i = 1; i < nums.length; i++) {
			
			if (idx == nums.length - 1) return true;
			idx = (nums[idx] + idx) % (nums.length + 1);
		}
		
		return false;
	}
}
