package dump;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Dump {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> remove = new ArrayList<>();
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		remove.add(5);
		remove.add(9);
		remove.add(7);
		
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(8);
		
		list.addAll(set);
		Collections.sort(list);
		
		System.out.println(list.removeAll(remove));
		System.out.println(list);

	}

}
