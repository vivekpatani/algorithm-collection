package leetcode.solutions;

/**
 * Wrong Answer
 * @author flipswitch
 *
 */

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] input = new int[] {1,1,1,1,2,3,3,4,4,5};
		int count = removeDuplicates(input);
		for (int i = 0; i < count; i++) {
			System.out.print(input[i] + " ");
		}
		
		System.out.println();
		
		int[] input2 = new int[] {1,2,3,4,5,6,7,8};
		int count2 = removeDuplicates(input);
		for (int i = 0; i < count2; i++) {
			System.out.print(input2[i] + " ");
		}

	}
	
	public static int removeDuplicates (int[] array){
		int current = 0;
		for (int i = 1; i < array.length - 1; i++) {
			current++;
			if (array[i-1] == array[i]) {
				while (i < array.length - 1 && array[i - 1] == array[i]) i++;
				array[current] = array[i];
			}
		}
		
		return current;
	}
	
}
