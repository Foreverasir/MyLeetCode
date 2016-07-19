/*
2016-7-19

349. Intersection of Two Arrays  
Difficulty: Easy
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
Subscribe to see which companies asked this question
*/

class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>(), res = new HashSet<>();
		for (int i : nums1)
			set.add(i);
		for (int i : nums2) {
			if (set.contains(i))
				res.add(i);
		}
		Integer[] array = new Integer[res.size()];
		array = res.toArray(array);
		int[] num = new int[array.length];
		for (int i = 0; i < array.length; i++)
			num[i] = array[i];
		return num;
	}
}
