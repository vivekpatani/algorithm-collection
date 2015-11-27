/**
 * Vivek Patani {FlipSwitch}
 * InsertionSort.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.searchAlgorithms;

import com.vivekpatani.commonconstants.Constants;
import com.vivekpatani.searchAlgorithms.ConstantsSearch;

/**
 * 
 */
public class InsertionSort {

	private static int[] data;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		data = getInputData(data);
		insertionSort(data);
		displayArray(data);
		
	}
	
	public static void insertionSort(int[] data){
		
		int key=0,i;
		for(int j=1;j<data.length;j++){
			key = data[j];
			i = j;
			while(i>0 && data[i-1] > key){
				data[i] = data[i-1];
				i = i - 1;
			}
			data[i] = key;
		}
	}
	
	public static void displayArray(int[] data){
		
		System.out.println(ConstantsSearch.CONSTANTS_SEARCH[2]);
		for (int i = 0; i<data.length;i++)
			System.out.print(data[i] + " ");
	}
	
	
	public static int getInputLength() {
		
		System.out.println(ConstantsSearch.CONSTANTS_SEARCH[0]);
		int inputSize = Constants.sc.nextInt();
		
		return inputSize;
	}
	
	public static int[] getInputData(int[] dataSet){
		
		dataSet = new int[getInputLength()];
		System.out.println(ConstantsSearch.CONSTANTS_SEARCH[1]);
		for(int i=0;i<dataSet.length;i++)
			dataSet[i] = Constants.sc.nextInt();
		
		return dataSet;
	}

	
	private void insertionSort (){
		
	}

}
