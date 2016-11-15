package leetcode.solutions;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/valid-sudoku/
 * 
 * @author flipswitch
 *
 */
public class ValidSudoku {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Input is
		// [".87654321","2........","3........","4........","5........","6........","7........","8........","9........"]

	}

	/**
	 * 
	 * @param board
	 * @return
	 */
	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> rowData = new HashSet<Character>();
			HashSet<Character> colData = new HashSet<Character>();
			HashSet<Character> cubeData = new HashSet<Character>();
			for (int j = 0; j < board[0].length; j++) {

				// Row Data
				if (board[i][j] != '.' && !rowData.add(board[i][j])) {
					return false;
				}

				// Column Data
				if (board[j][i] != '.' && !colData.add(board[j][i])) {
					return false;
				}

				// Cube Data
				int rowIndex = 3 * (i / 3);
				int colIndex = 3 * (i % 3);

				if (board[rowIndex + j / 3][colIndex + j % 3] != '.'
						&& !cubeData.add(board[rowIndex + j / 3][colIndex + j % 3]))
					return false;
				cubeData.add(board[rowIndex + j / 3][colIndex + j % 3]);
			}
		}
		return true;
	}
}
