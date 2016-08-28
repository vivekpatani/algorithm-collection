package algorithm.sorting;

public class BubbleSort {
	
	public static void sort (int[] a) {
		
		for (int i = a.length-2; i >= 0; i--) {
			
			for (int j=0; j<=i; j++) {
				
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a [j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}