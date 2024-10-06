package Maths;

public class EasyFactorial {

	public static void main(String[] args) {
		// Problem Statement:- Given a Number , find the factorial for the number
		// Time Complexity = O(n)
		// Space Complexity = O(1)
		long n = 1;
		if (n < 0) {
			System.out.println("Factorial does'nt exist");
		}
		long i = 2;
		long fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
