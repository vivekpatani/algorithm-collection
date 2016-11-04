package careercup.facebook;

import java.util.ArrayList;
import java.util.LinkedList;

public class SortedSquaredNumbers {

	public static void main(String[] args) throws java.lang.Exception {
		int[] input = new int[] { -2, -1, 2, 4, 5 };
		int[] output = sort(square(input));
		print(output);
	}

	/**
	 * Get the squared array
	 * @param input
	 * @return
	 */
	public static int[] square(int[] input) {

		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] * input[i];
		}

		return input;
	}
	
	/**
	 * Get me the maximum number for number of iterations
	 * @param input
	 * @return
	 */
	public static int max(int[] input) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max)
				max = input[i];
		}

		return max;
	}
	
	/**
	 * Sort a given array in O(n) using Radix Sort.
	 * @param input
	 * @return
	 */
	public static int[] sort(int input[]) {

		ArrayList<LinkedList<Integer>> buckets = new ArrayList<>();
		int iterator_count = Integer.toString(max(input)).length();
		int power = iterator_count;
		
		for (int i = 0; i < 10; i++) {
			
			LinkedList<Integer> temp = new LinkedList<>();
			buckets.add(temp);
		}
		
		// Number of Digits, iterator_count
		for (int i = 0; i < iterator_count; i++) {
			
			// For each number for that round of digits.
			for (int j = 0; j < input.length; j++) {
				
				// Get the bucket number depending upon the iteration.
				int idx = (input[j] / (int) ((Math.pow(10, i)))) % 10;
				LinkedList<Integer> temp = buckets.get(idx);
				temp.add(input[j]);
			}
			
			// Rebuilding Arrays
			int counter = 0;
			for (int j = 0; j < buckets.size(); j++) {
				
				LinkedList<Integer> tempList = buckets.get(j);
				for (int k = 0; k < tempList.size(); k++) {
					input[counter] = tempList.get(k);
					counter++;
				}
			}
			
			// Clear All buckets for next iteration.
			buckets.clear();
			
			// Re initialise them buckets.
			for (int j = 0; j < 10; j++) {
				
				LinkedList<Integer> temp = new LinkedList<>();
				buckets.add(temp);
			}
		}

		return input;
	}
	
	/**
	 * Print the given array.
	 * @param input
	 */
	public static void print (int[] input) {
			
			System.out.print("\n");
			for (int i = 0; i < input.length; i++) {
				System.out.print(input[i] + " ");
			}
		}

}
