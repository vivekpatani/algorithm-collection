package leetcode.solutions;

public class RotateImageby90 {

	public static void main(String[] args) {
		
		int[][] image = new int[][] {{1,4,7},{2,5,8},{3,6,9}};
		rotate(image);
		display(image);
	}

	public static void rotate(int[][] image) {

		int temp = 0;
		
		for (int i = 0; i < image.length; i++) {
			for (int j = i+1; j < image[0].length; j++) {
				temp = image[i][j];
				image[i][j] = image[j][i];
				image[j][i] = temp;
			}
		}
		
		
		for (int i = 0; i < image.length; i++) {
			int j = 0; int k = image[0].length - 1;
			while (j < k) {
				temp = image[i][j];
				image[i][j] = image[i][k];
				image[i][k] = temp;
				j++;
				k--;
			}
		}
	}

	public static void display(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
