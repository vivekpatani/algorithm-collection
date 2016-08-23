package algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class SearchImplementation<E> {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("Pop");
		list.add("Push");
		list.add("Enough");
		list.add("Referral");
		
		MergeSort<String> sort = new MergeSort<>();
		sort.mergeSort(list, 0, list.size());
	}

}
