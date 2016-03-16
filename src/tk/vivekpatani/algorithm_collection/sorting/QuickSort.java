/**
 * Vivek Patani {FlipSwitch}
 * QuickSort.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

/**
 * 
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,2,5,9,0};
		arr = sort(arr,0,arr.length-1);
		print(arr);
	}
	
	static int[] sort(int arr[], int low, int high)
    {
        int pivot = arr[randomWithRange(low, high-1)]; 
        System.out.println("Pivot: "+pivot);
        int i = low;
        int j = high;
        while(i <= j){
        	while(arr[i] < pivot){
        		i++;
        	}
        	while(arr[j] > pivot){
        		j--;
        	}
        	if(i <= j){
        		swap(i,j,arr);
        		i++;
        		j--;
        	}
        }
        if(low< j)
        	sort(arr,low,j);
        if(i < high)
        	sort(arr,i,high);
        
        return arr;
    }	
	
	private static int[] swap(int i,int j,int[] arr){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}
	
	private static int randomWithRange(int min, int max){
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	private static void print(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
