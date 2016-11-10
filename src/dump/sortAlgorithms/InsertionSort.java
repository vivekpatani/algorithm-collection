/**
 * Vivek Patani {FlipSwitch}
 * InsertionSort.java
 * {Algorithms 0.: Living in Beta}
 */
package dump.sortAlgorithms;

import dump.commonconstants.Constants;

/**
 * Simple Insertion according to CLRS Book Pseudo Code. It is modified to
 * implement in Java
 */
public class InsertionSort {

	private static int[] data;

	/**
	 * Method to drive the programme and control the flow
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		data = getInputData(data);
		insertionSort(data);
		displayArray(data);
	}

	/**
	 * Method to sort the data set into sorted order
	 * 
	 * @param data
	 */
	public static void insertionSort(int[] data) {

		int key = 0, i;
		for (int j = 1; j < data.length; j++) {
			key = data[j];
			i = j;
			while (i > 0 && data[i - 1] > key) {
				data[i] = data[i - 1];
				i = i - 1;
			}
			data[i] = key;
		}
	}

	public static void displayArray(int[] data) {

		System.out.println(ConstantsSort.CONSTANTS_SEARCH[2]);
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
	}

	public static int getInputLength() {

		System.out.println(ConstantsSort.CONSTANTS_SEARCH[0]);
		int inputSize = Constants.sc.nextInt();

		return inputSize;
	}

	public static int[] getInputData(int[] dataSet) {

		dataSet = new int[getInputLength()];
		System.out.println(ConstantsSort.CONSTANTS_SEARCH[1]);
		for (int i = 0; i < dataSet.length; i++)
			dataSet[i] = Constants.sc.nextInt();

		return dataSet;
	}

	private void insertionSort() {

	}

}
