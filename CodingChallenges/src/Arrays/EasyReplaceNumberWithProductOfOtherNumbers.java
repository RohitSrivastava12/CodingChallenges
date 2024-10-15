package Arrays;

public class EasyReplaceNumberWithProductOfOtherNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// All the  numbers in array should be replaced by the product of all numbers in array except that number
		// Time Complexity:- O(N)
		// Space complexity:- O(1)
		int a[] = { 1, 3, 5, 3};
		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			prod = prod * a[i];
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = prod / a[i];
			System.out.println(a[i]);
		}
	}

}
