package array;

public class SecondLargeNumber {

	public static void main(String[] args) {

		int arr[] = { 10, 40, 20, 60, 80 };

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > largest) {
				second = largest;
				largest = num;
			} else if (num > second && num != largest) {
				second = num;
			}
		}

		System.out.println(second);
	}
}
