package leetcode.solutions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LFUCache {
	
	int size = 0;
	int cap;
	Map<Integer, Integer> cache;

	public LFUCache(int capacity) {
		cache = new HashMap<Integer, Integer>(capacity);
		cap = capacity;
		System.out.println(capacity);
	}

	public int get(int key) {

		if (size < 1)
			return -1;
		else if (cache.containsKey(key)) {
			int retVal = cache.get(key);
			cache.put(key, cache.get(key)+1);
			return retVal;
		}

		return -1;

	}

	public void set(int key, int value) {

		System.out.println(size + " " + cap);
		if (size < cap) {
			cache.put(key, value);
			size++;
		} else {
			int replaceKey = getLFU();
			cache.remove(replaceKey);
			cache.put(key, value);
		}
	}

	public int getLFU() {

		Entry<Integer, Integer> min = Collections.min(cache.entrySet(), new Comparator<Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		return min.getKey();
	}
}
