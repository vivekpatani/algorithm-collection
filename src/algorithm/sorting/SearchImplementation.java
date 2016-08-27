package algorithm.sorting;

public class SearchImplementation<E> {

	public static void main(String[] args) {
		
		int[] a = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		
		HeapSort.sort(a);
		displayList(a);
	}
	
	public static void displayList (int[] a) {
		
		System.out.print("List:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

}
