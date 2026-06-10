package string;

public class StringContainsVowel {

	public static void main(String[] args) {

		String str = "universal";

		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {

			char ch = Character.toLowerCase(str.charAt(i));

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