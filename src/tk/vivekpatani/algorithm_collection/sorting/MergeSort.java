/**
 * Vivek Patani {FlipSwitch}
 * MergeSort.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import java.util.ArrayList;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * Class to implement Merge Sort Algorithm
 */
public class MergeSort {
	
	private static int[] data_list;
	public static void main(String args[]){
		data_list = takeInput(data_list);
		sort(data_list,0,data_list.length-1);
		display(data_list);
	}
	
	public static int[] takeInput(int[] data_list){
		
		
		System.out.println("Please Enter The Size of the Data: ");
		int n = ConstantsMain.scanner.nextInt();
		
		data_list = new int[n];
		
		System.out.println("Please Enter The Data: ");
		for(int i=0;i<n;i++){
			data_list[i] = ConstantsMain.scanner.nextInt();
			
			//System.out.println(data+" Added Successfully!");
		}
		return data_list;
	}
	
	public static int[] sort(int[] data_list,int p,int r){
		
		if(p<r){
			int q = (p + r) / 2;
			sort(data_list,p,q);
			sort(data_list,q+1,r);
			merge(data_list,p,q,r);
			
		}
		return data_list;
	}
	
	public static int[] merge(int[] data_list,int p,int q,int r){
		int n1 = q - p + 1;
		int n2 = r - q;
	    int[] left = new int[n1 + 1];
	    int[] right = new int[n2 + 1];

	    for(int i = 0; i < n1; i++){
	    	left[i] = data_list[p + i];
	    	}
	    for(int j = 0; j < n2; j++){
	    	right[j] = data_list[q + j + 1];
	        }

	        left[n1] = Integer.MAX_VALUE;	// null indicates infinity
	        right[n2] = Integer.MAX_VALUE;

	        for(int i = 0,  j = 0,  k = p; k <= r; k++){
	            if(left[i] <= right[j]){
	                data_list[k] = left[i++];
	            }else{
	                data_list[k] = right[j++];
	            }
	        }
	        return data_list;
	    }
	
	public static void display(int[] data_list){
		
		System.out.println("List:");
		for(int i=0;i<data_list.length;i++)
			System.out.println(data_list[i]);
		System.out.println();
	}

}
