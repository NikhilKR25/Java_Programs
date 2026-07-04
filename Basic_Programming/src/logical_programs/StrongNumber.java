package logical_programs;
//Strong Number: Sum of factorial of individual digits is equals to original number.

import java.util.Scanner;

public class StrongNumber {

 public static void main(String[] args) {
	// Create Scanner object to take input from the user
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number :");
     int num = sc.nextInt();

     int temp = num;
     int r, fact, sum = 0;

     // Process each digit
     while (temp > 0) {
    	 // Extract the last digit
         r = temp % 10;

         // Find factorial of the digit & Reset factorial to 1 for every new digit
         fact = 1;
         for (int i = r; i >= 1; i--) {
             fact *= i;
         }
         sum += fact;
      // Remove the last digit from the number
         temp /= 10;
     }

     // Check if it is a Strong Number
     if (num == sum) {
         System.out.println(num + " Strong Number.");
     } else {
         System.out.println(num + " Not Strong Number");
     }
     sc.close();
 }
}