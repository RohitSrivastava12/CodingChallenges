package Arrays;

public class EasyMoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Move all zeros to end
//		Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//		Note that you must do this in-place without making a copy of the array.
//
//		 
//
//		Example 1:
//
//		Input: nums = [0,1,0,3,12]
//		Output: [1,3,12,0,0]
//		Example 2:
//
//		Input: nums = [0]
//		Output: [0]
//		 
//
//		Constraints:
//
//		1 <= nums.length <= 104
//		-231 <= nums[i] <= 231 - 1
//		 
//
//		Follow up: Could you minimize the total number of operations done?
		// Time Complexity:O(N)
		// Space Complexity:O(1)
		int nums[] = { 1, 0, 3, 4, 8, 0, 9, 1, 0 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count] = nums[i];
				count++;
			}
		}
		while (count < nums.length) {
			nums[count] = 0;
			count++;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
