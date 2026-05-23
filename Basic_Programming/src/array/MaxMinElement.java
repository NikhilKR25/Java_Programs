package ArrayPrograms; //Find max and min Value from Array.

public class MaxMinElement {

	public static void main(String[] args) {
		int[] arr1 = {22,55,10,77,45,78,98};
		
		int min = arr1[0];
		int max = arr1[0];
		
		for(int i=0; i<= arr1.length-1; i++)
		{
			if(arr1[i] >max){
				max = arr1[i];
			}
			else if(arr1[i] <min) {
				min = arr1[i];
			}
		}
		System.out.println("Max Element: "+max);
		System.out.println("Min Element: "+min);
	}
}
