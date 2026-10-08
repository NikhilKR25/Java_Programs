package string;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Program Started");
		// Given String
		String str = "Java has Object";
		
		// Convert the string into a character array
		char [] arr = str.toCharArray();
		// Loop through last char to first
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nProgram Ended");
	}
}
