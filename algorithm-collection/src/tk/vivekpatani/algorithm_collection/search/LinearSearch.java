/**
 * Vivek Patani {FlipSwitch}
 * LinearSearch.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.search;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * Class to implement Linear Search
 */
public class LinearSearch {
	
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
		
		int result = 0;
		int len = 0;
		while(len <= (arr.length-1)){
			if(arr[len] == key){
				result = len+1;
				//System.out.println("Found Once");
				break;
			}
			len++;
		}
		return result;
	}

}
