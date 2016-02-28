/**
 * Vivek Patani {FlipSwitch}
 * BubbleSort.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * Class to implement Bubble Sort
 */
public class BubbleSort {
	
	private static int arr[];
	public static void main(String[] args){
		
		System.out.println("Please Enter the data size: ");
		int n = ConstantsMain.scanner.nextInt();
		
		arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = ConstantsMain.scanner.nextInt();
		}
		sort(arr);
		printArray(arr);
	}
	
	public static int[] sort(int[] arr){
		
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j]>arr[j+1])
					swap(j,j+1, arr);
		return arr;
	}
	
	private static int[] swap(int j,int k,int arr[]){
		
		int temp;
		temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
		
		return arr;
	}
	
	private static int[] printArray(int arr[]){
		
		System.out.println("Array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		return arr;
	}
}
