package careercup.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TwoArrayTarget {

	public static void main(String[] args) {
		
		// Pass Case
		List<Integer> list1 = Arrays.asList(1,2,1,4,5,6,7,7,8,10);
		List<Integer> list2 = Arrays.asList(9,8,7,6,5,4,3,2,1,0);
		int target1 = 2;
		
		System.out.println(twoArrayTarget1(list1, list2, target1));
		System.out.println(twoArrayTarget2(list1, list2, target1));
		
		// Pass Case
		List<Integer> list3 = Arrays.asList(1,2,1,4,5,6,7,7,8,10);
		List<Integer> list4 = Arrays.asList(9,8,7,6,5,4,3,2,1,0);
		int target2 = 1111111;
		
		System.out.println(twoArrayTarget1(list3, list4, target2));
		System.out.println(twoArrayTarget2(list3, list4, target2));
	}
	
	/**
	 * This is the solution my interviewer was looking for.
	 * @param list1
	 * @param list2
	 * @param target
	 * @return
	 */
	public static boolean twoArrayTarget1 (List<Integer> list1, List<Integer> list2, int target) {
		
		// This does not affect the complexity but it helps.
		Collections.sort(list1);
		Collections.sort(list2);
		
		for (int i = 0; i < list1.size(); i++) {
			
			int value = target - list1.get(i);
			if (binarySearch(value, list2) != -1) return true;
			
		}
		return false;
	}
	
	/**
	 * Simple Binary Search
	 * @param key
	 * @param list
	 * @return
	 */
	public static int binarySearch (int key, List<Integer> list) {
		
		int startIndex = 0, endIndex = list.size()-1;
		while (startIndex < endIndex) {
			
			int midIndex = startIndex + (endIndex - startIndex)/2;
			if (list.get(midIndex) == key) return midIndex;
			else if (key < list.get(midIndex)) endIndex = midIndex - 1;
			else startIndex = midIndex + 1;
		}
		
		return -1;
	}
	
	/**
	 * No because O(n) extra space is used.
	 * @param list1
	 * @param list2
	 * @param target
	 * @return
	 */
	public static boolean twoArrayTarget2 (List<Integer> list1, List<Integer> list2, int target) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (int i = 0; i < list2.size() ; i++) {
			hashSet.add(list2.get(i));
		}
		
		for (int i = 0; i < list1.size(); i++) {
			
			int value = target - list1.get(i);
			if (hashSet.contains(value)) return true;
		}
		
		return false;
	}
}
