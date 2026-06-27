package string;

public class SeparateNumChar{
	public static void main(String[] args) 
	{
		String str = "a1b2c3d4e5";
		
		// Variables to store characters and numbers
		String chars = " ";
		String nums = " ";
		
		// Convert string into character array
	for (char ch : str.toCharArray()) {
		// Check whether character is a digit or letter.
	    if (Character.isDigit(ch))
	        nums += ch;
	    else if (Character.isLetter(ch))
	        chars += ch;
	}
	// Display result
	System.out.println("Characters in a String: " + chars);
	System.out.println("Numbers in a String: " + nums);
		
	} 
}