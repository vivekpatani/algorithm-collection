package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> output = spiralOrder(matrix);
		System.out.println(output);
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> output = new ArrayList<Integer>();

		if (matrix == null || matrix.length == 0) return output;

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		while (true) {
			// Going from l -> r on top section
			for (int i = top; i <= right; i++) {
				output.add(matrix[top][i]);
			}
			top++;

			if (checkBoundaries(matrix, left, right, top, bottom)) break;

			for (int i = top; i <= bottom; i++) {
				output.add(matrix[i][right]);
			}
			right--;

			if (checkBoundaries(matrix, left, right, top, bottom)) break;
			
			for (int i = right; i >= left; i--) {
				output.add(matrix[bottom][i]);
			}
			bottom--;
			
			if (checkBoundaries(matrix, left, right, top, bottom)) break;

			for (int i = bottom; i >= top; i--) {
				output.add(matrix[i][left]);
			}
			left++;
			
			if (checkBoundaries(matrix, left, right, top, bottom)) break;

		}
		return output;
	}

	public static boolean checkBoundaries(int[][] matrix, int left, int right, int top, int bottom) {

		if (left > right || top > bottom)
			return true;
		return false;
	}

}
