package algorithms.searching;

import java.util.ArrayList;

public class Search {

	public static int linearSearch(int key, ArrayList<Integer> list) {

		int position = -1;

		if (list.size() < 1) {
			System.out.println("No Element Present");
			return -1;
		}

		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == key) {
				count++;
				position = i + 1;
			}
		}

		System.out.println("Occurences: " + count);

		return position;
	}

	public static int binarySearch(int key, ArrayList<Integer> list) {

		int startIndex = 0;
		int endIndex = list.size();

		while (startIndex < endIndex) {

			// https://research.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html
			// Why mid = s + (e-s)/2 and not mid = (e+s)/2
			int mid = startIndex + (endIndex - startIndex) / 2;
			if (key == list.get(mid)) {
				return mid + 1;
			} else if (key < list.get(mid)) {
				endIndex = mid - 1;
			} else {
				startIndex = mid + 1;
			}
		}
		return -1;
	}

	public static int binarySearchRec(int key, ArrayList<Integer> list, int startIndex, int endIndex) {

		if (startIndex < endIndex) {
			int mid = startIndex + (endIndex - startIndex) / 2;

			if (key == list.get(mid))
				return mid;
			else if (key < list.get(mid))
				binarySearchRec(key, list, startIndex, mid - 1);
			else
				binarySearchRec(key, list, mid + 1, endIndex);
		}

		return -1;
	}
}
