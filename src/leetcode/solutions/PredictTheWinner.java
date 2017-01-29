package leetcode.solutions;

public class PredictTheWinner {

	public static void main(String[] args) {
		
		int[] nums = {1, 5, 233, 7};
		predictTheWinner(nums);
	}
	
	public static boolean predictTheWinner (int[] nums) {
		
		if (nums.length == 1) return true;
		
		boolean move = true;
		int i = 0, j = nums.length - 1, max = 0, score1 = 0, score2 = 0;
		
		while (i <= j) {
			
			if (nums[i] >= nums[j]) {
				max = nums[i];
				i++;
			} else {
				max = nums[j];
				j--;
			}
			
			// Player 1
			if (move) {
				move = false;
				score1 += max;
				System.out.println("Player 1 : " + score1);
			} else {
				move = true;
				score2 += max;
				System.out.println("Player 2 : " + score2);
			}
		}
		
		System.out.println(score1 + " : " + score2);
		
		return true;
	}

}
