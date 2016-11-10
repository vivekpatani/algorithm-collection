package solutions.ctci.chapter2;

import java.util.LinkedList;

/**
 * Adding two numbers from two linkedList
 * Follow up: Reverse the order.
 * @author flipswitch
 *
 */
public class Solution5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		list1.add(4);
		list1.add(2);
		
		list2.add(8);
		list2.add(1);
		list2.add(3);
		
		//813 + 42 = 855
		//813 + 42 (reverse) = 558
		
		System.out.println(sum(list1, list2));
		System.out.println(reverseSum(list1, list2));

	}
	
	public static int sum (LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		if (list1.size() < list2.size()) {
			LinkedList<Integer> temp = list1;
			list1 = list2;
			list2 = temp;
		}
		
		for (int i=0; i<list1.size()-list2.size(); i++) list2.addFirst(0);
		
		int length = list1.size();
		int sum = 0;
		
		for (int i = 0; i < list1.size(); i++) {
			
			sum += Math.pow(10, --length)*list1.get(i) + Math.pow(10, length)*list2.get(i);
		}
		
		return sum;
	}
	
	public static int reverseSum (LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		if (list1.size() < list2.size()) {
			LinkedList<Integer> temp = list1;
			list1 = list2;
			list2 = temp;
		}
		
		for (int i=0; i<list1.size()-list2.size(); i++) list2.addFirst(0);
		
		System.out.println(list1 + " " + list2);
		
		int length = 0;
		int sum = 0;
		
		for (int i = 0; i < list1.size(); i++) {
			
			sum += Math.pow(10, length)*list1.get(i) + Math.pow(10, length)*list2.get(i);
			++length;
		}
		
		return sum;
	}

}
