package leetcode.solutions;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		
		display(generateMatrix(100));
	}
	
	public static int[][] generateMatrix (int n) {
		
		int[][] matrix = new int[n][n];
		
		if (n==0) return matrix;
		
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		int count = 0;
		
		while (true) {
			
			for (int i = top; i <= right; i++) {
				matrix[top][i] = ++count;
			}
			top++;
			
			if (checkBoundaries(left, right, top, bottom)) break;
			
			for (int i = top; i<=bottom; i++) {
				matrix[i][right] = ++count;
			}
			right--;
			
			if (checkBoundaries(left, right, top, bottom)) break;
			
			for (int i = right; i >= left; i--) {
				matrix[bottom][i] = ++count;
			}
			bottom--;
			
			if (checkBoundaries(left, right, top, bottom)) break;
			
			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = ++count;
			}
			left++;
			
			if (checkBoundaries(left, right, top, bottom)) break;
		}
		
		return matrix;
	}
	
	public static boolean checkBoundaries(int left, int right, int top, int bottom) {
		
		if (left > right || top >  bottom) return true;
		return false;
	}
	
	public static void display(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
