package array; 
// finding missing element from the given array.

public class MissingElement {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9}; //45
		int[] arr2 = {1,2,3,4,5,6,8,9};
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			sum2 = sum2 + arr2[j];
		}
// by adding total number of elements will get the solution.
		System.out.println("1 Array "+sum1+" And 2 Array "+ sum2);
		System.out.print("Missing Element is: " + (sum1 - sum2));
	}
}
