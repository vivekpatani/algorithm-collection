package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SearchInsertionPosition {

	public static void main(String[] args) {
		
		int[] input = new int[] {1, 3, 5, 6};
		int target = 4;
		System.out.println(searchInsert(input, target));
		
		input = new int[] {1, 3, 5, 6};
		target = 2;
		System.out.println(searchInsert(input, target));
		
		input = new int[] {1, 3, 5, 6};
		target = 7;
		System.out.println(searchInsert(input, target));
		
		input = new int[] {1, 3, 5, 6};
		target = 0;
		System.out.println(searchInsert(input, target));
		
		input = new int[] {1, 3, 5};
		target = 2;
		System.out.println(searchInsert(input, target));
	}

	public static int searchInsert(int[] nums, int target) {
		
		if (target > nums[nums.length - 1]) return nums.length;
		
		if (target < nums[0]) return 0;
		
		if (nums.length == 1) return 0;
        
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		while (left < right) {
			System.out.println(left + " " + mid + " " + right);
			mid = left + (right - left) / 2;
			if (target > nums[mid]) left = mid + 1;
			else right = mid - 1;
		}
		
		mid = left + (right - left) / 2;
		System.out.println(mid + " Hey");
		
		return mid;
    }

}
