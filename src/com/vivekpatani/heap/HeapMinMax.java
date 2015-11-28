/**
 * Vivek Patani {FlipSwitch}
 * Heap.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.heap;

/**
 * 
 */
public class HeapMinMax {
	
	private static int heapSize;
//	/private static int[] data;
	/**
	 * A Class to build the maximum heap
	 * @param args
	 */
	public static void main(String[] args) {
		
		//data = getInputData(data);
		int[] data = {4,1,3,2,16,9,10,14,8,7};
		buildMaxHeap(data);
		buildMinHeap(data);
	}
	
	public static int[] getInputData (int[] data){
		
		data = new int[getInputSize()];
		System.out.println("Please Enter The Input:");
		for(int i=0;i<data.length;i++)
			data[i] = ConstantsHeap.sc.nextInt();
		return data;
	}
	
	public static int getInputSize (){
		System.out.print("Please Enter Input Size:");
		int n = ConstantsHeap.sc.nextInt();
		
		return n;
	}
	
	/**
	 * Method to take the array (data) input and convert to max heap
	 */
	  public static void buildMaxHeap(int []data){
	        heapSize = data.length-1;
	        for(int i=data.length/2;i>=0;i--){
	            maxHeapify(data,i);
	            display(data);
	        }
	    }
	  
	 /**
	 * Method to take the array (data) input and convert to min heap
	 */
	  public static void buildMinHeap(int []data){
		        heapSize = data.length-1;
		        for(int i=data.length/2;i>=0;i--){
		            minHeapify(data,i);
		            display(data);
		        }
		    }
	    
	/**
	 * Method used to generate a max heap of the tree
	 * @param subData
	 * @param i
	 */
	private static int[] maxHeapify (int data[], int i){
		
		int l = 2*i+1;
		int r = 2*i+2;
		int largest;
		
		if(l < heapSize && data[l] > data[i]){
			largest = l;
		} else largest = i;
		
		if(r < heapSize && data[r] > data[largest]){
			largest = r;
		}
		
		if(largest != i){
			int temp = data[i];
			data [i] = data [largest];
			data[largest] = temp;
			maxHeapify(data, largest);
		}
		return data;
	}
	
	/**
	 * Method used to generate a max heap of the tree
	 * @param subData
	 * @param i
	 */
	private static int[] minHeapify (int data[], int i){
		
		int l = 2*i+1;
		int r = 2*i+2;
		int smallest;
		
		if(l < heapSize && data[l] < data[i]){
			smallest = l;
		} else smallest = i;
		
		if(r < heapSize && data[r] < data[smallest]){
			smallest = r;
		}
		
		if(smallest != i){
			int temp = data[i];
			data [i] = data [smallest];
			data[smallest] = temp;
			maxHeapify(data, smallest);
		}
		return data;
	}
	
	/**
	 * Method used to display the data
	 * @param data
	 */
	public static void display (int data[]){
		
		System.out.println("\nOutput:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
}
