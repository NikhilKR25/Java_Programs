package normal_pattern;

//Program for X Pattern or Diagonals
public class Xpattern {
    public static void main(String[] args) {

        int rows = 5;

        // Loop through rows
        for (int i = 0; i < rows; i++) {

            // Loop through columns
            for (int j = 0; j < rows; j++) {

                // Print * on both diagonals
                if (j == i || j == rows - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}
