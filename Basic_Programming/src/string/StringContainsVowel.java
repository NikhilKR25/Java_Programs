package string;

public class StringContainsVowel {

	public static void main(String[] args) {

		String str = "universal";
		// Flag to keep track of whether a vowel is found
		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {
			 // Get the current character and convert it to lowercase
			char ch = Character.toLowerCase(str.charAt(i));
			 // Check the character
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("String contains vowels");
		} else {
			System.out.println("String does not contain vowels");
		}
	}

}