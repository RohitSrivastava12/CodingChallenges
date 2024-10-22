package Strings;

public class EasyReverseStringMaintaingTheRelativeOrderOfSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Time complexity:-O(N)
		//Space Complexity:-O(N)
		String s = "I am a boy";
		char[] a = s.toCharArray();
		int p1=0;
		int p2 = s.length() - 1;
		while (p1 < p2) {
			if (a[p1] != ' ') {
				char temp = a[p1];
				a[p1] = a[p2];
				a[p2] = temp;
				p1++;
				p2--;
			} else if(a[p2]==' '){
				p2--;
			}
			else {
				p1++;
			}
		}
		System.out.println(String.valueOf(a));

	}

}
