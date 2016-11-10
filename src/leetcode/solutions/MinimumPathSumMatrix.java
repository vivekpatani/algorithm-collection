package leetcode.solutions;

/**
 * https://leetcode.com/problems/minimum-path-sum/
 * @author flipswitch
 *
 */
public class MinimumPathSumMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = new int[][] {{1, 1, 2},{1, 3, 3}, {2, 4, 4}};
		System.out.println(minPathSum(matrix));

	}

	public static int minPathSum(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (i == 0 && j == 0)
					continue;
				else if (j == 0)
					grid[i][j] += grid[i - 1][j];
				else if (i == 0)
					grid[i][j] += grid[i][j - 1];
				else
					grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
			}
		}
		return grid[grid.length - 1][grid[0].length - 1];
	}

}