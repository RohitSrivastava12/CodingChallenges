package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class EasyCountOccurenceOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count the number of each vowels that has appeared in a string
		// Time complexity: O(N)
		// Space complexity: O(1)
		String s = "My Name is Rohit Srivastava";
		int l = s.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < l; i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> pair : map.entrySet()) {
			if (pair.getKey() == 'a' || pair.getKey() == 'e' || pair.getKey() == 'i' || pair.getKey() == 'o'
					|| pair.getKey() == 'u') {
				System.out.println(pair.getKey() + ": " + pair.getValue());
			}
		}
	}

}
