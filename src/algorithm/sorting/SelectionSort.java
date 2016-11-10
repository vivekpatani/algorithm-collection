package algorithm.sorting;

public class SelectionSort {

	public static void sort (int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			int key = i;
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[j] < a[key]) {
					key = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[key];
			a[key] = temp;
		}
	}
}
