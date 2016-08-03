/*
2016-8-3

350. Intersection of Two Arrays II
Difficulty: Easy
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/

class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length == 0 || nums2.length == 0)
			return new int[0];
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int count = 0;
		int[] temp = new int[nums1.length > nums2.length ? nums1.length : nums2.length];
		for (int p1 = 0, p2 = 0; p1 < nums1.length && p2 < nums2.length;) {
			if (nums1[p1] == nums2[p2]) {
				temp[count] = nums1[p1];
				count++;
				p1++;
				p2++;
			} else if (nums1[p1] > nums2[p2])
				p2++;
			else
				p1++;
		}
		int[] a = new int[count];
		for (int i = 0; i < count; i++) {
			a[i] = temp[i];
		}
		return a;
	}
}
