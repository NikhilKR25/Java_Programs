package logical_programs;

//A palindrome number remains the same when its digits are reversed.
public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 12821;
		int temp = num;
		int reverse = 0;

		// Reverse the given number
		while (temp != 0) {

			int digit = temp % 10; // Extract the last digit
			reverse = reverse * 10 + digit; // Build the reversed number
			temp /= 10; // Remove the last digit
		}

		// Compare the original number with the reversed number
		if (num == reverse) {
			System.out.println(num + " is a Palindrome Number");
		} else {
			System.out.println(num + " is Not a Palindrome Number");
		}
	}
}
