package solutions.ctci.chapter2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Solution7 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();
		
		// For Odd
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(0);
		
		// For Even
		list2.add(0);
		list2.add(1);
		list2.add(2);
		list2.add(2);
		list2.add(1);
		list2.add(0);
		
		// For Non Palindrome
		list3.add(0);
		list3.add(1);
		list3.add(2);
		list3.add(1);
		list3.add(1);
		
		System.out.println(isPalin(list1));
		System.out.println(isPalin(list2));
		System.out.println(isPalin(list3));
	}
	
	public static boolean isPalin (LinkedList<Integer> list) {
		
		Stack<Integer> stack = new Stack<>();
		int length = list.size();
		
		for (int i=0; i<length/2; i++) {
			stack.push(list.get(i));
		}
		
		if (length%2 != 0) stack.push(list.get(length/2));
		
		System.out.println(list + " " + stack);
		
		for (int i = length/2; i < length; i++) {
			
			//System.out.println(list.get(i) + " " + stack.peek());
			if (list.get(i) != stack.pop()) return false;
		}
		
		return true;
	}

}
