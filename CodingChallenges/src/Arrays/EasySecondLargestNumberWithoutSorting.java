package Arrays;

public class EasySecondLargestNumberWithoutSorting {

	public static void main(String[] args) {

		// Find the second largest number in array without performing sorting operation
		// , as
		// sorting will give O(NlogN), Complexity We need O(N)
		// Time Complexity:- O(N)
		// Space complexity:O(1)
		int arr[] = { 5, 4, 1, 2, 99, 98 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int secondmax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > secondmax && arr[i] != max) {
				secondmax = arr[i];
			}
		}
		System.out.println("Second Largest Number is " + secondmax);

	}

}
