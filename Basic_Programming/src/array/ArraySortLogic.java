package array;

import java.util.Arrays;
//for a Given Array print the output as 012345,
//it also known as Selection Sort.
public class ArraySortLogic {
	public static void main(String[] args) 
	{
		int [] arr = {5,1,6,2,0,3,0,4,0};
		int sorted [] = sortArray(arr);
		System.out.println(Arrays.toString(sorted));
	}

	private static int[] sortArray(int[] arr) {
//		selects the position where the minimum element will be placed
		for (int i = 0; i < arr.length; i++) {
//			current element is the minimum
			int index = i;
			
//			Find the index of the smallest element
			for (int j = i; j <= arr.length - 1; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
//			Swap current element with the minimum element
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		return arr;
	}
}
