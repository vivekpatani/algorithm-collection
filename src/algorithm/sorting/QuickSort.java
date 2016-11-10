package algorithm.sorting;

import java.util.Random;

public class QuickSort {
	
	private static Random rand = new Random();
	
	public static void quickSort (int[] a, int startIndex, int endIndex) {
		
		if (startIndex < endIndex) {
			
			int midIndex = parition (a, startIndex, endIndex);
			quickSort(a, startIndex, midIndex-1);
			quickSort(a, midIndex+1, endIndex);
		}
		
	}
	
	public static int parition (int[] a, int startIndex, int endIndex) {
		
		int indx = rand.nextInt(endIndex - startIndex + 1) + startIndex;
		
		int temp = a[indx];
		a[indx] = a[endIndex];
		a[endIndex] = temp;
		
		int pivot = a[endIndex];
		
		int i = startIndex;
		for (int j=startIndex; j<endIndex; j++) {
			
			if (a[j] < pivot) {
				int swap = a[j];
				a[j] = a[i];
				a[i] = swap;
				i++;
			}
		}
		
		int swap = a[endIndex];
		a[endIndex] = a[i];
		a[i] = swap;
		
		return i;
	}
}
