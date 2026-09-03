package array;

public class BubbleSortArray {

	public static void main(String[] args) {
		//	input Array
		int[] arr = {5, 1, 4, 2, 8, 3, 6, 7};
		
		//	largest element moves to its correct position / end position.
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {

				//	If current element is greater than next element then it will swap them
				if (arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Bubble Sorted Array: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
