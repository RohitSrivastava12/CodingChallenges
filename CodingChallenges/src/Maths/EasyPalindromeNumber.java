package Maths;

public class EasyPalindromeNumber {
	public static void main(String[] args) {
//		Problem Statement:- https://leetcode.com/problems/palindrome-number/description/
//		Given an integer x, return true if x is a palindrome
//				, and false otherwise.
//
//				 
//
//				Example 1:
//
//				Input: x = 121
//				Output: true
//				Explanation: 121 reads as 121 from left to right and from right to left.
//				Example 2:
//
//				Input: x = -121
//				Output: false
//				Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//				Example 3:
//
//				Input: x = 10
//				Output: false
//				Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//				 
//
//				Constraints:
//
//				-2^31 <= x <= 2^31 - 1
		// Time Complexity:- O(log x)
		// Space Complexity:- O(1)
		int x = -2147447412;
		int rem = 0;
		int revNum = 0;
		int num = x;
		while (num != 0) {
			rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}
		if (revNum == x) {
			System.out.println("The given number is Palindrome");
		} else {
			System.out.println("The given number is not a Palindrome");
		}
	}
}
