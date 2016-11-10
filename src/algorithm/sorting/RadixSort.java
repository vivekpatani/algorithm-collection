package algorithm.sorting;

import java.util.ArrayList;
import java.util.LinkedList;

public class RadixSort {

	public static void sort(int[] a) {

		ArrayList<LinkedList<Integer>> list = new ArrayList<>();
		int maxLength = 0;

		// To find the maximum number of passes need to be made.
		for (int i = 0; i < a.length; i++) {

			if (String.valueOf(a[i]).length() > maxLength)
				maxLength = String.valueOf(a[i]).length();
		}
		
		// Initalisation of list.
		for (int j = 0; j < 10; j++) {

			LinkedList<Integer> linkedList = new LinkedList<>();
			list.add(j, linkedList);
		}

		// For each pass.
		for (int i = 0; i < maxLength; i++) {

			// Adding numbers to their respective buckets.
			for (int j = 0; j < a.length; j++) {

				int idxValue = (a[j] / (int) ((Math.pow(10, i)))) % 10;
				LinkedList<Integer> tempList = list.get(idxValue);
				tempList.add(a[j]);
			}

			// To put the elements back into the array
			int counter = 0;
			for (int j = 0; j < list.size(); j++) {

				LinkedList<Integer> tempList = list.get(j);

				for (int k = 0; k < tempList.size(); k++) {
					a[counter] = tempList.get(k);
					counter++;
				}
			}

			list.clear();
			// This is to clear the Buckets and then again initialise
			// linkedLists again.
			for (int j = 0; j < 10; j++) {

				LinkedList<Integer> linkedList = new LinkedList<>();
				list.add(j, linkedList);
			}
		}
	}
}
