package solutions.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Simple Implementation of a HashedMap using List
 * @author flipswitch
 *
 * @param <E>
 */
public class MyHashMap<E> {
	
	List<E> hashMap;
	Set<Integer> keySet;
	
	/**
	 * Constructor
	 */
	public MyHashMap() {
		hashMap = new ArrayList<>();
		keySet = new HashSet<>();
	}
	
	/**
	 * Insert a key value pair in Map.
	 * @param key
	 * @param value
	 */
	public void put (int key, E value) {
		int hashedKey = hashKey(key);
		if (hashMap.size() < hashedKey) initKeys(hashedKey - hashMap.size(), value);
		
		if (keySet.contains(hashedKey)) {
			hashMap.set(hashedKey, value);
		} else {
			hashMap.add(hashedKey, value);
		}
		keySet.add(hashedKey);
	}
	
	public E get(int key) throws Exception {
		int hashedKey = hashKey(key);
		if (keySet.contains(hashedKey)) return hashMap.get(hashedKey);
		else throw new Exception("Key Not Found Error");
	}
	
	/**
	 * If hashed key cannot fit, extend size
	 * @param diff
	 * @param value
	 */
	public void initKeys (int diff, E value) {
		
		for (int i = 0; i < diff; i++) {
			hashMap.add(value);
		}
	}
	
	/**
	 * Hashing Function
	 * @param key
	 * @return
	 */
	private int hashKey (int key) {
		return key%10;
	}
	
	/**
	 * Display the HashMap
	 */
	public void display() {
		for (int key : keySet) {
			System.out.print(key + "=" + hashMap.get(key) + " ");
		}
		System.out.println();
	}
}
