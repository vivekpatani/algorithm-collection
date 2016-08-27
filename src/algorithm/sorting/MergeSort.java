package algorithm.sorting;

public class MergeSort<E> {

	public static void mergeSort(int[] list, int startIndex, int endIndex) {

		if (startIndex < endIndex) {

			int midIndex = (endIndex + startIndex) / 2;
				
			mergeSort(list, startIndex, midIndex);
			mergeSort(list, midIndex + 1, endIndex);
			merge(list, startIndex, midIndex, endIndex);
		}
	}

	public static void merge(int[] list, int startIndex, int midIndex, int endIndex) {

		int n1 = midIndex - startIndex + 1;
		int n2 = endIndex - midIndex;
		
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		
		
		for (int i = 0; i < n1; i++) {
			left[i] = list[startIndex+i];
		}
		
		for (int i = 0; i < n2; i++) {
			right[i] = list[midIndex+1+i];
		}

		left[n1] = Integer.MAX_VALUE;
		right[n2] = Integer.MAX_VALUE;
		
		int i=0, j=0;
		for (int k = startIndex; k <=endIndex; k++) {
			
			if (left[i] <= right[j]) {
				list[k] = left[i];
				i++;
			} else {
				list[k] = right[j];
				j++;
			}
		}
	}

}
