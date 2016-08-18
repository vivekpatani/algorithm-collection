package algorithms.searching;

import java.util.ArrayList;

public class Search<E> {

	private ArrayList<E> list;
	private int position = -1;;
	private E key;
	
	Search () {
		this.list = new ArrayList<E>();
		position = -1;
	}
	
	public int linearSearch (E key, ArrayList<E> list) {
		
		this.list = list;
		this.key = key;
		
		if(list.size() < 1) {
			System.out.println("No Element Present");
			return -1;
		}
		
		int count = 0;
		
		for (int i=0; i<list.size(); i++) {
			
			if (list.get(i) == key) {
				count++;
				position = i + 1;
			}
		}
		
		System.out.println("Occurences: " + count);
		
		return position;
	}
}
