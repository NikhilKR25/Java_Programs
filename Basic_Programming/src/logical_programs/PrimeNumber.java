package logical_programs;
import java.util.Scanner;

//	Prime Number: which are divisible by only 1 and itself.
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to check");
        int num = scan.nextInt();
        scan.close();

        int count = 0;

        // Count the factors of the number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // A prime number has exactly 2 factors
        if (count == 2)
            System.out.println(num + ": Prime Number");
        else
            System.out.println(num + ": Not Prime Number");
    }
}