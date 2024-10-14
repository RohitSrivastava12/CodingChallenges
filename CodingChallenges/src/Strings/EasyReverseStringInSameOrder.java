package Strings;

public class EasyReverseStringInSameOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Time complexity: O(N)
		// Space complexity: O(N)
		String s = "My Name is Rohit Srivastava";
		s.trim();
		int l = s.length();
		String arr[] = s.split(" ");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + " " + arr[i];
		}
		System.out.println("The Reverse string in fix order is " + ans);
	}

}
