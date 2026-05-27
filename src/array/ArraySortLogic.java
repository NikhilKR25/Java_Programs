package array;

import java.util.Arrays;
//for a Given Array print the output as 012345
public class ArraySortLogic {
	public static void main(String[] args) 
	{
		int [] arr = {5,1,6,2,0,3,0,4,0};
		int sorted [] = sortArray(arr);
		System.out.println(Arrays.toString(sorted));
	}

	private static int[] sortArray(int[] arr) {
		for (int i = 0; i <arr.length; i++){
			int index = i;
			for (int j = i ; j <= arr.length-1; j++){
			if (arr[j] < arr[index]){
			index = j;
			}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			}
		return arr;
	}
}
