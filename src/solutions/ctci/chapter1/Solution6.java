package solutions.ctci.chapter1;

public class Solution6 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		display(rotateBy90(matrix));
	}
	
	/**
	 * Rotating a given Matrix by 90
	 * 1.) Transpose
	 * 2.) Reverse each row in terms of columns
	 * @param image
	 * @return
	 */
	public static int[][] rotateBy90 (int[][] image) {
		
		// Transpose in place
		for (int i = 0; i < image.length; i++) {
			for (int j = i + 1; j < image[0].length; j++) {
				int temp = image[i][j];
				image[i][j] = image[j][i];
				image[j][i] = temp;
			}
		}
		
		for (int i = 0; i < image.length; i++) {
			int j = 0, k = image[0].length - 1;
			while(j < k) {
				int temp = image[i][k];
				image[i][k] = image[i][j];
				image[i][j] = temp;
				
				j++;
				k--;
			}
		}
		
		return image;
	}
	
	/**
	 * Display the Matrix.
	 * @param matrix
	 */
	public static void display (int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
