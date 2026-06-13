package string;

public class SeparateNumChar{
	public static void main(String[] args) 
	{
		String str = "a1b2c3d4e5";

		String chars = " ";
		String nums = " ";
		
	for (char ch : str.toCharArray()) {
	    if (Character.isDigit(ch))
	        nums += ch;
	    else if (Character.isLetter(ch))
	        chars += ch;
	}

	System.out.println("Characters in a String: " + chars);
	System.out.println("Numbers in a String: " + nums);
		
	} 
}