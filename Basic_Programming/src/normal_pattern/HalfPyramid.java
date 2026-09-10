package normal_pattern;

public class HalfPyramid {
    public static void main(String[] args) {

        int rows = 4;

        // Outer loop controls the rows
        for (int i = 1; i <= rows; i++) 
        {
            // Inner loop prints stars
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }
    }
}
/*
*
**
***
**** 
*/
