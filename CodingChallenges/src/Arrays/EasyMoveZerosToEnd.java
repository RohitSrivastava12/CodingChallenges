package Arrays;

public class EasyMoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Move all zeros to end
		int nums[] = { 1, 0, 3, 4, 8, 0, 9, 1, 0 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[count];
				nums[count] = temp;
				count++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
