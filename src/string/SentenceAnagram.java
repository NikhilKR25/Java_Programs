package string;

import java.util.Arrays;
// comparing two string and sorted if its same then string is anagram.
public class SentenceAnagram {

	public static void main(String[] args) {
		String s1 = "Java is Code";
		String s2 = "cOdE Is jaVa";
		
		s1 = s1.replace(" ", " ");
		s2 = s2.replace(" ", " ");
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		// Sort the character arrays individually
		char[] ar1 =s1.toCharArray();
		char[] ar2 =s2.toCharArray();
		
		Arrays.sort(ar1);	//ehimos
		Arrays.sort(ar2);
		// Check if the sorted arrays are equal
		boolean check  = Arrays.equals(ar1, ar2);
		if(check){
		System.out.print("Both String are Anagram");
		}
		else {
		System.out.println("Not Anagram");	
		}
	}

}
