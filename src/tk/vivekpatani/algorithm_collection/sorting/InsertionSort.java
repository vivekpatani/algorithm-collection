/**
 * Vivek Patani {FlipSwitch}
 * InsertionSort.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import java.util.ArrayList;
import java.util.function.Consumer;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * Class to implement simple Insertion Sort
 */
public class InsertionSort {
	
	/**
	 * The arrayList to store the data
	 */
	private static ArrayList<Integer> data_list = new ArrayList<>();
	
	public static void main(String args[]){
		System.out.println("Insertion Sort");
		takeInput(data_list);
		sort(data_list);
		display(data_list);
	}
	
	/**
	 * Method to take the input
	 * @param data_list
	 * @return
	 */
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
	
	/**
	 * Method to implement Sorting (Insertion)
	 * @param data_list
	 * @return
	 */
	public static ArrayList<Integer> sort(ArrayList<Integer> data_list){
		
		int i,tempElement;
		
		//Starting from 1 in order to save one iteration, since a single element is always sorted.
		for(int j = 1;j<data_list.size();j++){
			
			//The key to hold the incoming element into the sorted part.
			int key = data_list.get(j);
			i = j - 1;
			tempElement = data_list.get(i);
			System.out.println("key: "+key);
			
			while(i>=0 && tempElement>key){
				data_list.set(i+1, data_list.get(i));
				i--;
				display(data_list);
				if(i>=0)
					tempElement = data_list.get(i);
			}
			data_list.set(i+1, key);
			display(data_list);
		}
		return data_list;
	}
	
	/**
	 * Method to display the ArrayList
	 * @param data_list
	 */
	public static void display(ArrayList<Integer> data_list){
		
		System.out.println("List:");
		data_list.forEach(new Consumer<Integer>() {
			/* (non-Javadoc)
			 * @see java.util.function.Consumer#accept(java.lang.Object)
			 */
			@Override
			public void accept(Integer element) {
				System.out.print(element+" ");
			}
		});
		System.out.println();
	}
}
