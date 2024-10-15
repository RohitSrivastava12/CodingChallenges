package Arrays;

public class EasySquareOfEvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To get the square of even numbers in array , rest numbers will remain same
		// Time Complexity:- O(N)
		// Space complexity:- O(1)
		int a[] = { 1, 2, 4, 5, 8, 9, 12 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = a[i] * a[i];
			}
			System.out.println(a[i]);
		}
	}

}
