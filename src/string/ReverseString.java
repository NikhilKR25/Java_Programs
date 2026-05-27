package string;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Program Started");
		
		String str = "Java has Object";
		char [] arr = str.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nProgram Ended");
	}
}
