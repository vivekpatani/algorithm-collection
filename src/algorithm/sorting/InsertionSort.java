package algorithm.sorting;

public class InsertionSort {
	
	public static void sort (int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			int j = i;
			
			while (j > 0 && a[j-1] > key) {
				
				a[j] = a[j-1];
				j--;
			}
			
			a[j] = key;
		}
	}
}