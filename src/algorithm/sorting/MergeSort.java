package algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<E> {

	public void mergeSort(List<E> list, int startIndex, int endIndex) {

		if (startIndex < endIndex) {

			int midIndex = ((startIndex) + (endIndex - startIndex)) / 2;
			System.out.println(midIndex);
			mergeSort(list, startIndex, midIndex);
			mergeSort(list, midIndex + 1, endIndex);
			System.out.println(midIndex + " " + list);
			merge(list, startIndex, midIndex, endIndex);
		}
	}

	public void merge(List<E> list, int startIndex, int midIndex, int endIndex) {

		List<E> sorted = new ArrayList<>();
		NaturalOrder<E> comparator = new NaturalOrder<E>();
		List<E> left = new ArrayList<E>();
		List<E> right = new ArrayList<E>();

		for (int i = startIndex; i <= midIndex; i++) {
			left.add(list.get(i));
		}

		for (int i = midIndex + 1; i <= endIndex; i++) {
			right.add(list.get(i));
		}

		int i = 0, j = 0;

		System.out.println(left);
		System.out.println(right);
		for (int k = startIndex; k <= endIndex; k++) {

			if (comparator.compare(left.get(i), right.get(j)) < 0) {
				sorted.add(left.get(k));
				i++;
			} else {
				sorted.add(right.get(k));
				j++;
			}
		}
	}

	public void printList(List<E> list) {

		System.out.println(list);
	}
}
