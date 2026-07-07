package logical_programs;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 123456789;
        int temp = num;
        int sum = 0;

        // Extract each digit and add it to the sum
        while (temp > 0) {

            int digit = temp % 10; // Get the last digit
            sum += digit;          // Add the digit to the sum
            temp /= 10;            // Remove the last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}
