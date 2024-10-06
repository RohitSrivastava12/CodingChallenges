package Maths;

public class EasyPrimeNumber {

	public static void main(String[] args) {
		// Problem Statement : To identify if the given number is prime or not
		// Time Complexity = O(n)
		// Space Complexity = O(1)
		int n = 29;
		boolean val = true;
		int limit = n / 2;
		for (int i = 2; i <= limit; i++) {
			if (n % i == 0) {
				val = false;
				break;
			} else {
				val = true;
			}
		}
		System.out.println(val);

	}

}
