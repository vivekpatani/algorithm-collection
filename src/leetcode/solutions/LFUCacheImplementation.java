package leetcode.solutions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LFUCacheImplementation {

	public static void main(String[] args) {

		// Your LFUCache object will be instantiated and called as such:
		LFUCache obj = new LFUCache(2);

		obj.set(1, 1);
		obj.set(2, 2);
		System.out.println(obj.get(1)); // returns 1
		obj.set(3, 3); // evicts key 2
		System.out.println(obj.get(2)); // returns -1 (not found)
		System.out.println(obj.get(3)); // returns 3.
		obj.set(4, 4); // evicts key 1.
		System.out.println(obj.get(1)); // returns -1 (not found)
		System.out.println(obj.get(3)); // returns 3
		System.out.println(obj.get(4)); // returns 4
		
		System.out.println(obj);
	}
}