package leetcode.solutions;

import java.util.Random;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		
		int n = 5;
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = randInt(0,9);
			}
		}
		
		System.out.println("Original:");
		display(matrix);
		
		System.out.println("\nOutput:");
		
	}
	
//	public static int[][] setZeroes(int[][] matrix) {
//		
//		
//	}
	
	public static int randInt(int min, int max) {
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static void display (int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
