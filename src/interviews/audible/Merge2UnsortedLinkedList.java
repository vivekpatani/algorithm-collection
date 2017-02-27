package interviews.audible;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Merge2UnsortedLinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new LinkedList<>();
		list1.add(0);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(4);
		
		List<Integer> list2 = new LinkedList<>();
		list2.add(8);
		list2.add(7);
		list2.add(6);
		list2.add(5);
		list2.add(9);
		
		List<Integer> mergedList = mergeLists(list1, list2);
	}
	
	public static List<Integer> mergeLists (List<Integer> list1, List<Integer> list2) {
		
		List<Integer> mergedList = new LinkedList<>();
		Iterator itr1 = list1.iterator();
		Iterator itr2 = list2.iterator();
		
		while (itr1.hasNext() || itr2.hasNext()) {
			
		}
		
		return mergedList;
	}
	
	
}
