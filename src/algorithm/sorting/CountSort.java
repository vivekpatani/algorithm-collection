package algorithm.sorting;

public class CountSort {
	
	public static void sort (int[] a) {
		
		int max = Integer.MIN_VALUE;
		// Used to find the range of numbers
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) max = a[i];
		}
		
		// Count the occurrences of a given number
		int[] c = new int[max + 1];
		for (int i = 0; i < a.length; i++) {
			c[a[i]] += 1;
		}
		
		int[] b = new int[c.length];
		b[0] = c[0];
		
		for (int i = 1; i < c.length; i++) {
			b[i] = b[i - 1] + c[i];
		}
		
		int[] output = new int[a.length];
		
		for (int i = a.length - 1; i >= 0; i--) {
			int index = b[a[i]];
			b[a[i]] -= 1;
			output[index - 1] = a[i];
		}
		
		for (int i = 0; i < output.length; i++) {
			a[i] = output[i];
		}
	}
}
