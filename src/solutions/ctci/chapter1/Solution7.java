package solutions.ctci.chapter1;

import java.util.Scanner;

/**
 * Making column and row zero if any element of the row and column are zero.
 * @author flipswitch
 *
 */
public class Solution7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] input = new int[n][m];
		if (n < 1 || m < 1)
			System.out.println("Duh!");
		else {

			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input[0].length; j++) {
					if (i == 1 && j == 1 || i == 2 && j == 2)
						input[i][j] = 0;
					else
						input[i][j] = (int) (Math.random() * 10);
				}
			}
			input = convertToZero(input);
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Convert row and column to 0 if element in that row or column is zero
	 * @param input
	 * @return
	 */
	public static int[][] convertToZero (int[][] input) {
		
		boolean[] row = new boolean[input.length];
		boolean[] column = new boolean[input[0].length];
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (input[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (row[i] || column[j]) {
					input[i][j] = 0;
				}
			}
		}
		
		return input;
	}
}
