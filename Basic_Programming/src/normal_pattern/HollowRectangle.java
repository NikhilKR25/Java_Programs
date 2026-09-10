package normal_pattern;

public class HollowRectangle {

    public static void main(String[] args) {
    	//	numbers of rows and columns
        int rows = 4;
        int columns = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {

                // to Print * on the border
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    // to Print space
                    System.out.print(" ");
                }
            }
            // Move to the next row
            System.out.println();
        }
    }
}
/* output

*****
*   *
*   *
*****

 */