package normal_pattern;

public class UpDownSquare {

    public static void main(String[] args) {

        int rows = 7;
        int stars = 5;
        // mid point for the Pattern
        int mid = (rows + 1) / 2;

    	// Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {
        	 // Inner loop prints stars and spaces
            for (int j = 1; j <= stars; j++) {

                if (i == 1 || i == mid || i == rows || j == 1 || j == stars) 
                {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
