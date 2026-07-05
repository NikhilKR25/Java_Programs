package logical_programs;

//	Armstrong is positive number, if it is equal to the sum of power of its digits.
public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 8208;
        int power = String.valueOf(num).length();

     // Process each digit of the number
        int temp = num;
        int sum = 0;

        while (temp > 0) {
        	// Extract the last digit
            int digit = temp % 10;
            
         // Calculate digit raised to the power of total digits
            int digitPower = 1;

            for (int i = 1; i <= power; i++) {
                digitPower *= digit;
            }
            // add power and remove last digit
            sum += digitPower;
            temp /= 10;
        }

		if (num == sum) {
			System.out.println(num + " is an Armstrong Number");
		} else {
			System.out.println(num + " is Not an Armstrong Number");
		}
    }
}