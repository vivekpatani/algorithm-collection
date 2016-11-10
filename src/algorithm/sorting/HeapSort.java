package algorithm.sorting;

import datastructures.tree.Heapify;

public class HeapSort {

	public static int[] sort(int[] a) {

		int heapMaxIdx = a.length - 1;
		buildMaxHeap(a);

		for (int i = a.length - 1; i >= 0; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			heapMaxIdx--;
			Heapify.maxHeapify(a, 0, heapMaxIdx);
		}
		return a;
	}

	public static int[] buildMaxHeap(int[] a) {

		int heapMaxIdx = a.length - 1;
		for (int i = (heapMaxIdx / 2); i >= 0; i--) {
			Heapify.maxHeapify(a, i, heapMaxIdx);
		}
		return a;
	}

	public static int[] buildMinHeap(int[] a) {

		int heapMaxIdx = a.length - 1;
		for (int i = (heapMaxIdx / 2); i >= 0; i--) {
			Heapify.minHeapify(a, i, heapMaxIdx);
		}
		return a;
	}
	
}
