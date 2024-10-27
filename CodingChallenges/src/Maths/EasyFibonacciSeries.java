package Maths;

public class EasyFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Output:-0,1,1,2,3,5,8,13,21
		int n = 15;
		int first = 0;
		int second = 1;
		int next = 0;
		for (int i = 0; i <= n; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
			i++;
		}

	}

}
