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
		
		List<Integer> top = new ArrayList<Integer>();
		List<Integer> bottom = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		List<Integer> left = new ArrayList<Integer>();
		int k = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				top.add(matrix[i][j]);
				right.add(matrix[j][i]);
				bottom.add(matrix[matrix.length - i - 1][matrix[0].length - j - 1]);
				right.add(matrix[matrix[0].length -j - 1][matrix.length - i - 1]);
			}
			output.addAll(new ArrayList(top));
			output.addAll(right);
			output.addAll(bottom);
			output.addAll(left);
			
			top.clear();
			right.clear();
			bottom.clear();
			left.clear();
			k++;
		}
		
		return output;
	}

}
