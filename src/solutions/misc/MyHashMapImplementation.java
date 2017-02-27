package solutions.misc;

public class MyHashMapImplementation {

	public static void main(String[] args) throws Exception {
		
		MyHashMap<Integer> hashMap = new MyHashMap<>();
		hashMap.put(5, 10);
		hashMap.put(1, 2);
		hashMap.put(3, 2);
		hashMap.display();
		hashMap.put(5, 11);
		hashMap.display();
		hashMap.get(9);
	}

}
