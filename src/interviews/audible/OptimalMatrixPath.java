package interviews.audible;

/**
 * Left
 * @author flipswitch
 *
 */
public class OptimalMatrixPath {

	public static void main(String[] args) throws Exception {
		
		int[][] matrix = new int[][] {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};
		System.out.println(findOptimalPathWrapper(matrix));

	}
	
	private static int findOptimalPathWrapper(int[][] matrix) throws Exception {
		return findOptimalPath(matrix, 0, 0);
	}
	
	private static int findOptimalPath(int[][] matrix, int i, int j) throws Exception {
		
		if (i < 0 || j < 0) throw new Exception ("Indices cannot be negative");
		else if (i == 0 && j == 0) return matrix[i][j];
		else return matrix[i][j] + (Math.min(findOptimalPath(matrix, i + 1, j),
									 findOptimalPath(matrix, i, j + 1)));
	}

}
