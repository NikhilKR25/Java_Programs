package string;	// Palindrome string - wow, level, oyo

import java.util.Scanner;

public class palindromString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scan.next();
		System.out.println("Enter String: "+str);
		System.out.println("----------------------");
		
		char[] arr = str.toCharArray();
		String rev = "";
		for(int i=arr.length-1; i>=0; i--)
		{
			rev = rev +arr[i];	
		}
		System.out.println("Reversed String: "+rev);			
		System.out.println("-----------------------");
		
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
