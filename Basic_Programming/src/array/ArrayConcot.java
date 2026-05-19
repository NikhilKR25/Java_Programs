package array;

public class ArrayConcot {

	 public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4};
	        int[] array2 = {5, 6, 7, 8, 9};
    
	        // Calculate the length of the concatenated array
	        int length = array1.length + array2.length;
	        // Create a new array to store the concatenated elements
	        int[] result = new int[length];

	        // Initialize position variable to keep track of the index in the result array
	        int pos = 0;

	        // Copy elements from the first array to the result array
	        for (int element1 : array1) {
	            result[pos++] = element1;
	        }
	        // Copy elements from the second array to the result array
	        for (int element2 : array2) {
	            result[pos++] = element2;
	        }
	        // Print the concatenated array
	        System.out.print("Concatenated array: ");
	        for (int element : result) {
	            System.out.print(element + " ");
	        }
	    }
}
