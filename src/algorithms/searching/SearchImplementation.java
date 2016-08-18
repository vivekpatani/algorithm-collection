package algorithms.searching;

import java.util.ArrayList;

public class SearchImplementation {

	public static void main(String[] args) {
		
		Search<String> search = new Search<String>();
		
		ArrayList<String> list = new ArrayList<String>();
	
		list.add("Hi");
		list.add("How");
		list.add("Are");
		list.add("You");
		System.out.println("Position: " + search.linearSearch("Hi", list));
	}

}
