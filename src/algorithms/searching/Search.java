package algorithms.searching;

import java.util.ArrayList;
import java.util.Comparator;

import common.ConstantsCommon;

public class Search<E> {

	private ArrayList<E> list;
	private int position = -1;;
	private E key;

	Search() {
		this.list = new ArrayList<E>();
		position = -1;
	}

	public int linearSearch(E key, ArrayList<E> list) {

		this.list = list;
		this.key = key;

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

	public int binarySearch(E key, ArrayList<E> list) {

		// this.list = list;
		// this.key = key;
		//
		// for (int i=0; i<list.size() - 1; i++) {
		//
		// if (list.get(i).toString() > list.get(i+1).toString()) {
		//
		// System.out.println(ConstantsCommon.GENERIC_ERROR);
		// return -1;
		// }
		// }

		list.sort(new ListComparator());

		//while (true) {
			// BinSearch Logic
		//}

		System.out.println(list);
		
		return position;
	}

	private class ListComparator implements Comparator<E> {

		@Override
		public int compare(E o1, E o2) {
			return o1.toString().compareTo(o2.toString());
		}

	}
}
