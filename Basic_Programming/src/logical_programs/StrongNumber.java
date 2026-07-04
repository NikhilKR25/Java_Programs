package logical_programs;
//Strong Number: Sum of factorial of individual digits is equals to original number.

import java.util.Scanner;

public class StrongNumber {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number :");
     int num = sc.nextInt();

     int temp = num;
     int r, fact, sum = 0;

     while (temp > 0) {
         r = temp % 10;

         fact = 1;
         for (int i = r; i >= 1; i--) {
             fact *= i;
         }
         sum += fact;
         temp /= 10;
     }

     if (num == sum) {
         System.out.println(num + " Strong Number.");
     } else {
         System.out.println(num + " Not Strong Number");
     }
     sc.close();
 }
}