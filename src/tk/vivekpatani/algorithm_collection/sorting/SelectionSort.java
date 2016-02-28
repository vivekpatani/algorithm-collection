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
	
	public static ArrayList<Integer> takeInput(ArrayList<Integer> data_list){
		
		System.out.println("Please Enter The Size of the Data: ");
		int n = ConstantsMain.scanner.nextInt();
		
		System.out.println("Please Enter The Data: ");
		for(int i=0;i<n;i++){
			int data = ConstantsMain.scanner.nextInt();
			data_list.add(data);
			//System.out.println(data+" Added Successfully!");
		}
		return data_list;
	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> data_list){
		return data_list;
	}
	
	public static void display(ArrayList<Integer> data_list){
		
		System.out.println("List:");
		data_list.forEach((element) -> {
			System.out.print(element+" ");
		});
		System.out.println();
	}

}
