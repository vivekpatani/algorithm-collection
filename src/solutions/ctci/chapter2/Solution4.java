package solutions.ctci.chapter2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution4 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		LinkedList<Integer> newList = split(list,x);
		
		System.out.println(newList);
	}
	
	public static LinkedList<Integer> split (LinkedList<Integer> list, int x) {
		
		int length = list.size();
		int count = 0;
		LinkedList<Integer> output = new LinkedList<>();
		
		while (count!=length) {
			
			if (list.get(count) >= x) {
				output.addLast(list.get(count));
			} else {
				output.addFirst(list.get(count));
			}
			count++;
		}
		return output;
	}
	
}
