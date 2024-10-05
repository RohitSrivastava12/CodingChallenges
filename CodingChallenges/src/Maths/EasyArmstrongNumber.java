package Maths;

public class EasyArmstrongNumber {

	public static void main(String[] args) {
//		Problem statement:-https://www.naukri.com/code360/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//		You are given an integer 'n'. Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.
//
//
//		An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.
//
//		Detailed explanation ( Input/output format, Notes, Images )
//		Sample Input 1 :
//		1
//
//
//		Sample Output 1 :
//		true
//
//
//		Explanation of Sample Input 1 :
//		1 is an Armstrong number as, 1^1 = 1.
//
//
//		Sample Input 2 :
//		103
//
//
//		Sample Output 2 :
//		false
//
//
//		Sample Input 3 :
//		1634
//
//
//		Sample Output 3 :
//		true
//
//
//		Explanation of Sample Input 3 :
//		1634 is an Armstrong number, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
		// Time Complexity:- O(log x)^2
		// Space Complexity:- O(1)
		int x = 103;
		int n = x;
		int check = x;
		int rem = 0;
		int c = 0;
		double armNumber = 0;
		boolean val = true;
		if (x < 10) {
			System.out.println(val);
		} else {
			while (n != 0) {
				c++;
				n = n / 10;
			}
			System.out.println(c);

			while (check != 0) {
				rem = check % 10;
				armNumber = Math.pow(rem, c) + armNumber;
				check = check / 10;
			}
			if (armNumber == x) {
				val = true;
			} else {
				val = false;
			}
			System.out.println(val);
		}
	}

}
