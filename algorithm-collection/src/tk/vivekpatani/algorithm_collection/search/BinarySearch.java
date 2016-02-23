/**
 * Vivek Patani {FlipSwitch}
 * BinarySearch.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.search;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * Class to implement Binary Search
 */
public class BinarySearch {

	/**
	 * @param args
	 */
public static void main(String[] args){
		
		System.out.println("Input the number of elements: ");
		int n = ConstantsMain.scanner.nextInt();
		
		System.out.println("Enter Data: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ConstantsMain.scanner.nextInt();
		}
		
		System.out.println("Input the key: ");
		int key = ConstantsMain.scanner.nextInt();
		
		if (search(arr,key)==-1)
			System.out.println("Not found");
		else System.out.println("Found at: "+search(arr,key));
	}
	
	private static int search(int arr[], int key){
		
		int left = 0;
		int right = arr.length - 1;
		int mid = (left+right)/2;
		while(left<=right){
			
			mid = (left+(right-1))/2;
			
			if(arr[mid] == key) return mid+1;
			
			if(arr[mid]<key)
				left = mid+1;
			else
				right = mid+1;
			}
		return -1;
	}
}
