/**
 * Vivek Patani {FlipSwitch}
 * MergeSort.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.sortAlgorithms;

import dump.commonconstants.Constants;

/**
 * Programme to implement Merger Sort Algorithm. This code is based on the CLRS
 * book and follows that pseudo code.
 */
public class MergeSort {
	private static int[] data;

	/**
	 * The driver function to run the programme.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		data = getInputData(data);
		mergeSort(data, 0, data.length - 1);
		displayArray(data);
	}

	/**
	 * This is the function which used to break the outputs.
	 * 
	 * @param data
	 * @param p
	 * @param r
	 */
	public static void mergeSort(int data[], int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(data, p, q);
			mergeSort(data, q + 1, r);
			merge(data, p, q, r);
		}
	}

	/**
	 * This is used to Merge the output from the leaves generated after
	 * splitting them into individual elements.
	 * 
	 * @param data
	 * @param p
	 * @param q
	 * @param r
	 */
	public static void merge(int[] data, int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;

		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];

		for (int i = 0; i < n1; i++)
			L[i] = data[p + i];
		for (int j = 0; j < n2; j++)
			R[j] = data[q + j + 1];

		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		int i = 0, j = 0;
		for (int k = p; k <= r; k++) {
			if (L[i] <= R[j]) {
				data[k] = L[i];
				i++;
			} else {
				data[k] = R[j];
				j++;
			}
		}
	}

	/**
	 * Method used to display the array of integers
	 * 
	 * @param data
	 */
	public static void displayArray(int[] data) {

		System.out.println(ConstantsSort.CONSTANTS_SEARCH[2]);
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
	}

	/**
	 * Method to get the Input (Array) Size
	 * 
	 * @return
	 */
	public static int getInputLength() {

		System.out.println(ConstantsSort.CONSTANTS_SEARCH[0]);
		int inputSize = Constants.sc.nextInt();

		return inputSize;
	}

	/**
	 * Method to get the input (Array) Data
	 * 
	 * @param dataSet
	 * @return
	 */
	public static int[] getInputData(int[] dataSet) {

		dataSet = new int[getInputLength()];
		System.out.println(ConstantsSort.CONSTANTS_SEARCH[1]);
		for (int i = 0; i < dataSet.length; i++)
			dataSet[i] = Constants.sc.nextInt();

		return dataSet;
	}
}
