package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class EasyContainsDuplicateVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem statement:-
		//Want to display how many times each character have appeared in a string
		//Time complexity:-O(N)
		//Space Complexity:- O(N)
		String s = "Rohit Srivastava";
		String s1 = s.toLowerCase();
		String ans ="";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			} 
			else {
				map.put(s1.charAt(i), 1);
			}
		}
		//System.out.println(map);
		map.remove(' ');
		for(Entry<Character, Integer> p: map.entrySet()) {
			 ans = ans + p.getKey()+p.getValue().toString();
		}
		System.out.println(ans);
	}

}
