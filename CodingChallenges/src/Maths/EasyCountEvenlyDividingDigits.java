package Maths;

public class EasyCountEvenlyDividingDigits {

	public static void main(String[] args) {
		// Problem Statement:- https://www.geeksforgeeks.org/problems/count-digits5716/1
//		Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
//
//		Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
//		 
//
//		Examples :
//
//		Input: n = 12
//		Output: 2
//		Explanation: 1, 2 when both divide 12 leaves remainder 0.
//		Input: n = 2446
//		Output: 1
//		Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
//		Input: n = 23
//		Output: 0
//		Explanation: 2 and 3, none of them divide 23 evenly.
//		Time Complexity: O(log(n)
//		Space Complexity: O(1)

		int n = 23;
		int rem = 0;
		int c = 0;
		int x = n;
		while (x != 0) {
			rem = x % 10;
			if (n % rem == 0) {
				c++;
			}
			x = x / 10;
		}
		System.out.println("Count of digits that evenly divide the number is " + c);
	}
}
