package algorithm.sorting;

public class SortImplementation<E> {

	public static void main(String[] args) {
		
		int[] commonInput = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		System.out.println("Input!");
		displayList(commonInput);
		
		long startTime = System.nanoTime();
		int[] a = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		HeapSort.sort(a);
		long endTime = System.nanoTime();
		System.out.println("\nHeap Sort!");
		displayList(a);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] b = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		MergeSort.mergeSort(b, 0, b.length-1);
		endTime = System.nanoTime();
		System.out.println("\nMerge Sort!");
		displayList(b);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] c = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		QuickSort.quickSort(c, 0, c.length-1);
		endTime = System.nanoTime();
		System.out.println("\nQuick Sort!");
		displayList(c);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] d = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		SelectionSort.sort(d);
		endTime = System.nanoTime();
		System.out.println("\nSelection Sort!");
		displayList(d);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] e = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		BubbleSort.sort(e);
		endTime = System.nanoTime();
		System.out.println("\nBubble Sort!");
		displayList(e);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] f = new int [] {16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
		InsertionSort.sort(f);
		endTime = System.nanoTime();
		System.out.println("\nInsertion Sort!");
		displayList(f);
		System.out.println("Time (ms): " + (endTime - startTime)/1000000.0);
		
		startTime = System.nanoTime();
		int[] g = new int [] {10, 37, 9, 80, 110, 75, 62};//{16,4,10,14,7,9,3,2,8,1};//{ 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 }; //{10, 37, 9, 80, 110, 75, 62};
		RadixSort.sort(g);
		endTime = System.nanoTime();
		System.out.println("\nRadix Sort!");
		displayList(g);
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
