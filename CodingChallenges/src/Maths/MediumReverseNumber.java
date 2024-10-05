package Maths;

public class MediumReverseNumber {

	public static void main(String[] args) {
		// Problem Statement:-https://leetcode.com/problems/reverse-integer/
		// Difficulty: Medium
		/*
		 * Given a signed 32-bit integer x, return x with its digits reversed. If
		 * reversing x causes the value to go outside the signed 32-bit integer range
		 * [-231, 231 - 1], then return 0.
		 * 
		 * Assume the environment does not allow you to store 64-bit integers (signed or
		 * unsigned).
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: x = 123 Output: 321
		 * 
		 * Input: x = -123 Output: -321 Input: x = -2147483412 Output: -2143847412
		 * 
		 * Input: x = 120 Output: 21
		 * 
		 * 
		 * Constraints:
		 * 
		 * -231 <= x <= 231 - 1
		 */
//Time Complexity:- O(log x)
// Space Complexity:- O(1)
		int x = 2147483412;
		// int x = -2147483412;
		long rem = 0;
		long revNum = 0;
		while (x != 0) {
			rem = x % 10;
			revNum = revNum * 10 + rem;
			x = x / 10;
		}
		if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
			revNum = 0;
		}
		System.out.println("Reverse number is " + (int) revNum);
	}

}
