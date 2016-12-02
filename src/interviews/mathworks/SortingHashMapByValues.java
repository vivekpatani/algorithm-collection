package interviews.mathworks;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHashMapByValues {

	public static void main(String[] args) {

		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("j", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println(sortByValues(unsortMap));
		System.out.println(sortByValuesGeneric(unsortMap));

	}

	/**
	 * Sort a map by Value. Non Generic.
	 * 
	 * @param input
	 * @return
	 */
	public static Map<String, Integer> sortByValues(Map<String, Integer> input) {

		// 1. Convert Map to a List of Map
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(input.entrySet());

		// 2. Sort the list with a custom comparator
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// 3. Loop the Sorted List and store them in a linkedhashmap to persist
		// the order
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValuesGeneric(Map<K, V> unsortMap) {
		
		// Coverting HashMap to List of Entry Maps
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());
		
		// Sort them using custom Comparator
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare (Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		// Put them back
		Map<K, V> sortedMap = new LinkedHashMap<>();
		for (Entry<K, V> entry: list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

}
