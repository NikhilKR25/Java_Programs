package string;	// Palindrome string - wow, level, oyo
import java.util.Scanner;
//Check weather String is Palindrome or Not.

public class PalindromeString {

	public static void main(String[] args) 
	{
		// Create Scanner object to take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scan.next();
		
		System.out.println("Enter String: "+str);
		System.out.println("----------------------");
		
		// Convert the string into a character array
		char[] arr = str.toCharArray();
		// Variable to store the reversed string
		String rev = "";
		for(int i=arr.length-1; i>=0; i--)
		{
			rev = rev +arr[i];	
		}
		System.out.println("Reversed String: "+rev);			
		System.out.println("-----------------------");
		
		// Compare original and reversed strings
		if(str.equals(rev))
		{
			System.out.println("Palindrome String . . .");
		}
		else
		{
			System.out.println("Not Plindrome string . . .");
		}
		scan.close();
	}
}
