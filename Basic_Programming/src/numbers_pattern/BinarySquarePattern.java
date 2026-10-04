package numbers_pattern;

public class BinarySquarePattern {

    public static void main(String[] args) {

        // Number of rows and columns
        int lines = 4;
        int count = 6;

        // Outer loop: controls the number of rows
        for (int i = 1; i <= lines; i++) {

            // Inner loop: controls the number of columns
            for (int j = 1; j <= count; j++) {

                // Check whether the sum of row and column is even
                if ((i + j) % 2 == 0) {
                    // Print 1 when the sum is even
                    System.out.print("1");

                } else {
                    // Print 0 when the sum is odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
/* output

101010
010101
101010
010101
*/
