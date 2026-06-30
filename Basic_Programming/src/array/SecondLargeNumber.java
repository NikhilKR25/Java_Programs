package array;

public class SecondLargeNumber {

	public static void main(String[] args) {

		int arr[] = { 10, 40, 20, 60, 80 };
		
		// Initialize largest and second largest integer values
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		// Traverse each element
		for (int num : arr) {

			if (num > largest) {
				// The previous largest becomes the second largest
				second = largest;
				largest = num;
			} else if (num > second && num != largest) {
				// Update the largest element
				second = num;
			}
		}

		System.out.println(second);
	}
}
