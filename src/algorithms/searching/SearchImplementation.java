package algorithms.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SearchImplementation {

	public static void main(String[] args) {
	
		System.out.println("Input!");
		ArrayList<Integer> list = new ArrayList<>();
		list = genRandomInput(list, 10);
		Collections.sort(list);
		System.out.println(list);
		long startTime = System.nanoTime();
		System.out.println("Position: " + Search.binarySearch(list.get(6), list));
		long endTime = System.nanoTime();
		System.out.println("Time (ms):" + (endTime-startTime)/1000000.0);
		
		System.out.println("Input!");
		list = new ArrayList<>();
		list = genRandomInput(list, 10);
		System.out.println(list);
		startTime = System.nanoTime();
		System.out.println("Position: " + Search.binarySearchRec (-1, list, 0, list.size()-1));
		endTime = System.nanoTime();
		System.out.println("Time (ms):" + (endTime-startTime)/1000000.0);
		
		System.out.println("Input!");
		list = new ArrayList<>();
		list = genRandomInput(list, 10);
		System.out.println(list);
		startTime = System.nanoTime();
		System.out.println("Position: " + Search.linearSearch(-1, list));
		endTime = System.nanoTime();
		System.out.println("Time (ms):" + (endTime-startTime)/1000000.0);
	}
	
	/**
	 * Method to generate a random input of size "size".
	 * @param list
	 * @param size
	 * @return list
	 */
	public static ArrayList<Integer> genRandomInput (ArrayList<Integer> list, int size) {
		
		Random rand = new Random();
		
		for (int i=0; i < size; i++) {
			list.add(rand.nextInt(999));
		}
		return list;
	}
}
