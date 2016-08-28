package algorithm.sorting;

public class SearchImplementation<E> {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		int[] a = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		HeapSort.sort(a);
		long endTime = System.nanoTime();
		displayList(a);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] b = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		MergeSort.mergeSort(b, 0, b.length-1);
		endTime = System.nanoTime();
		displayList(b);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] c = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		QuickSort.quickSort(c, 0, c.length-1);
		endTime = System.nanoTime();
		displayList(c);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
	}
	
	public static void displayList (int[] a) {
		
		System.out.print("List:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

}
