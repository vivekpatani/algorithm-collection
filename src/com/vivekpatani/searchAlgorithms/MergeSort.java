/**
 * Vivek Patani {FlipSwitch}
 * MergeSort.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.searchAlgorithms;

import com.vivekpatani.commonconstants.Constants;

/**
 * 
 */
public class MergeSort {
	private static int[] data;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		data = getInputData(data);
		mergeSort(data,0,data.length-1);
		displayArray(data);
		
	}
	
	public static void mergeSort (int data[],int p, int r){
		if(p<r){
			int q = (p+r)/2;
			mergeSort(data, p, q);
			mergeSort(data, q+1, r);
			merge(data,p,q,r);
		}
	}
	
	public static void merge (int[] data, int p, int q, int r){
		
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int L[] = new int [n1 + 1];
		int R[] = new int [n2 + 1];
		
		for(int i = 0; i < n1; i++)
			L[i] = data[p+i];
		for (int j = 0; j < n2; j++)
			R[j] = data[q+j+1];
		
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		
		int i=0,j=0;
		for(int k=p;k<=r;k++){
			if (L[i] <= R[j]){
				data[k] = L[i];
				i++;
			} else {
				data[k] = R[j];
				j++;
			}
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
}
