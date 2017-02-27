package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class CombinationK {

	public static void main(String[] args) {

		List<List<Integer>> output = combine(4, 4);
		System.out.println(output);
	}

	public static List<List<Integer>> combine(int n, int k) {
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
		}

		List<List<Integer>> list = new ArrayList<>();
		combination(list, new ArrayList<>(), nums, k);
		return list;
	}

	public static void combination(List<List<Integer>> list, List<Integer> tempList, int[] nums, int k) {

		System.out.println(list);
		if (tempList.size() == k) {
			list.add(new ArrayList<>(tempList));
			System.out.println(list);
		} else {

			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue;
				tempList.add(nums[i]);
				combination(list, tempList, nums, k);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
