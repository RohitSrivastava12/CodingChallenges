package Arrays;

public class EasyLargestNumberInArrayWithoutSorting {

	public static void main(String[] args) {
		int arr[]= {5,4,1,2,90,98};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest Number is "+max);

	}

}
