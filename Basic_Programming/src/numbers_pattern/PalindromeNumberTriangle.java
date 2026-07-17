package numbers_pattern;

public class PalindromeNumberTriangle {
	public static void main(String[] args) {
        int rows = 5;
        // Outer loop controls the number of rows
        for (int i = 1; i <= rows; i++) {
        	 // Print leading spaces
            for (int s = 1; s <= rows - i; s++)
                System.out.print(" ");

         // Print numbers in increasing order (1 to i)
            for (int j = 1; j <= i; j++)
                System.out.print(j);
         // Print numbers in decreasing order (i-1 to 1)
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }
    }

}

/*
    1
   121
  12321
 1234321 
 */
