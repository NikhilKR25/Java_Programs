package array;

import java.util.Arrays;

public class ArrayEvenOdd {
// Sort Array and then we will find Even And Odd Element from Given Array.
	public static void main(String[] args) {
		int arr[] = { 5, 2, 8, 1, 7, 4 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println("Even Element:\t" + arr[i]);
			} else {
				System.out.println("Odd Element:\t" + arr[i]);
			}
		}

	}

}
