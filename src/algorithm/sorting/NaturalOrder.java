package algorithm.sorting;

import java.util.Comparator;

public class NaturalOrder<E> implements Comparator<E> {

	@Override
	public int compare(E o1, E o2) {
		System.out.println(o1 + " This " + o2);
		return ((Comparable<E>)o1).compareTo(o2);
	}
	
}
