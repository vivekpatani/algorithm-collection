/**
 * Vivek Patani {FlipSwitch}
 * SelectionSort.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import java.util.ArrayList;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * 
 */
public class SelectionSort {
	
	static int[] data_list;
	
	public static void main(String args[]){
		System.out.println("Insertion Sort");
		data_list = takeInput(data_list);
		data_list = sort(data_list);
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
	
	public static int[] sort(int[] data_list){
		
		for(int i=0;i<data_list.length-1;i++){
			int min_index = i;
			for(int j=i+1;j<data_list.length;j++){
				if (data_list[j] < data_list[min_index]){
					min_index = j;
				}
			}
			int temp = data_list[min_index];
			data_list[min_index] = data_list[i];
			data_list[i] = temp;
		}
		
		return data_list;
	}
	
	public static void display(int[] data_list){
		
		System.out.println("List:");
		for(int i=0;i<data_list.length;i++){
			System.out.print(data_list[i]+" ");
		}
		System.out.println();
	}

}
