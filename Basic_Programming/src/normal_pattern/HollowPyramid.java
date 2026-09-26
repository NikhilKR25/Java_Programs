package normal_pattern;
//Hollow Pyramid or Hollow Triangle Pattern
public class HollowPyramid {
	
    public static void main(String[] args) {

        int rows = 5;
        // Rows
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                // Print star at the boundary or bottom
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
/*
    *
   * *
  *   *
 *     *
*********
 * */
