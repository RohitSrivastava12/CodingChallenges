package Arrays;

import java.util.HashMap;
import java.util.Map;

public class EasyContainsDuplicate {

	public static void main(String[] args) {
//Problem statement:- https://leetcode.com/problems/contains-duplicate/description/
//		Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//				 
//
//				Example 1:
//
//				Input: nums = [1,2,3,1]
//
//				Output: true
//
//				Explanation:
//
//				The element 1 occurs at the indices 0 and 3.
//
//				Example 2:
//
//				Input: nums = [1,2,3,4]
//
//				Output: false
//
//				Explanation:
//
//				All elements are distinct.
//
//				Example 3:
//
//				Input: nums = [1,1,1,3,3,4,3,2,4,2]
//
//				Output: true
//
//				 
//
//				Constraints:
//
//				1 <= nums.length <= 105
//				-109 <= nums[i] <= 109
		// Time Complexity: O(N)
		// Space complexity: O(1)
		int nums[] = { 1, 2, 3, 1 };
		int l = nums.length;
		boolean val = true;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < l; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> p : map.entrySet()) {
			if (p.getValue() == 1) {
				val = false;
			} else {
				val = true;
				break;
			}
		}
		System.out.println(val);
	}

}
