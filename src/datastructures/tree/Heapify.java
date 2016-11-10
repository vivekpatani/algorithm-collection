package datastructures.tree;

public class Heapify<E> {
	
	public static int[] maxHeapify (int[] a, int i, int heapMaxIdx) {
		
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;
		
		if (left <= heapMaxIdx && a[left] > a[largest]) largest = left;
		if (right <= heapMaxIdx && a[right] > a[largest]) largest = right;
		
		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a, largest, heapMaxIdx);
		}
		return a;
	}
	
	public static int[] minHeapify (int[] a, int i, int heapMaxIdx) {
		
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest = i;
		
		if (left <= heapMaxIdx && a[left] < a[smallest]) smallest = left;
		if (right <= heapMaxIdx && a[right] < a[smallest]) smallest = right;
		
		if (smallest != i) {
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
			minHeapify(a, smallest, heapMaxIdx);
		}
		return a;
	}
}
