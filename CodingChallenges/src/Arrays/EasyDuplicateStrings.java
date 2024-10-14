package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class EasyDuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the strings that are duplicate as String array;
		String arr[] = { "abc", "cba", "bcc", "abc", "bcc" };
		int l = arr.length;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < l; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		ArrayList<String> ans = new ArrayList<String>();
		for (Entry<String, Integer> pair : map.entrySet()) {
			if (pair.getValue() > 1) {
				ans.add(pair.getKey());
			}
		}
System.out.println("the strings that are duplicate are "+ans);
	}

}
