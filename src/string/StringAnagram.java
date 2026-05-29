package string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) 
	{
		String s1 = "EARN";
		String s2 = "NEAR";
		// Converts string to a new character array.
		char[] ar1 =s1.toCharArray();
		char[] ar2 =s2.toCharArray();
		System.out.println(ar1);
		// Sort the character arrays individually
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        // Check if the sorted arrays are equal
		boolean equal  = Arrays.equals(ar1, ar2);
		if(equal){
		System.out.print("Both String are Anagram");
		}
		else {
		System.out.println("Not Anagram");	
		}
	}
}