/**
 * Vivek Patani {FlipSwitch}
 * HeapSort.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * 
 */
public class HeapSort 
{
    private static int[] arr;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
    
    
    public static void main(String[] args){
    	
    	
    	System.out.println("Enter the size of the dataset: ");
    	int n = ConstantsMain.scanner.nextInt();
    	
    	arr = new int[n];
    	System.out.println("Enter the elements of the dataset: ");
    	for(int i=0;i<n;i++){
    		arr[i] = ConstantsMain.scanner.nextInt();
    	}
        sort(arr);
        print(arr);
    }
    
    public static void sort(int []arr){
        buildheap(arr);
        for(int i=n;i>0;i--){
            exchange(0, i,arr);
            n=n-1;
            maxheap(arr, 0);
        }
    }

    public static void buildheap(int[] arr){
        n=arr.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(arr,i);
        }
    }
    
    public static void maxheap(int[] arr, int i){ 
        
        left = 2 * i;
        right = 2 * i + 1;
        
        if(left <= n && arr[left] > arr[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && arr[right] > arr[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest,arr);
            maxheap(arr, largest);
        }
    }
    
    public static void exchange(int i, int j, int[] arr){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t; 
        }
    
    public static void print(int arr[]){
    	
    	for (int i = 0; i <arr.length; i++){
    		System.out.print(arr[i]+ " ");
    	}
    }
}