package logical_programs;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 8208;
        int power = String.valueOf(num).length();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int digitPower = 1;

            for (int i = 1; i <= power; i++) {
                digitPower *= digit;
            }

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