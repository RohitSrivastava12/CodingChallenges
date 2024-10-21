package Arrays;

public class EasyMoveZeroesToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Time Complexity:O(N)
		// Space Complexity:O(1)
		int nums[] = { 1, 0, 3, 4, 8, 0, 9, 1, 0 };
		int count = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != 0) {
				nums[count] = nums[i];
				count--;
			}
		}
		while (count >= 0) {
			nums[count] = 0;
			count--;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
