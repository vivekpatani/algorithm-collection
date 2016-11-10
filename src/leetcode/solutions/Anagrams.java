package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {

	public static void main(String[] args) {
		
		String[] inp = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(inp);
	}
	
	public static void groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            
            char[] current = strs[i].toCharArray();
            Arrays.sort(current);
            String sorted = new String(current);
            if (map.containsKey(sorted)) {
            	List<String> list = map.get(sorted);
            	list.add(strs[i]);
            }
            else {
            	List<String> list = new ArrayList<String>();
            	list.add(strs[i]);
            	map.put(sorted, list);
            }
        }
        
        List<List<String>> answer = new ArrayList<>();
        for (String key: map.keySet()) {
        	answer.add(map.get(key));
        }
        
        System.out.println(answer);
    }

}
