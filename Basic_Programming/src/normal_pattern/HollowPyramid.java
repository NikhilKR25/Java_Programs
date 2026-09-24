package normal_pattern;

public class HollowPyramid {
	
    public static void main(String[] args) {

        int rows = 5;
        // Rows
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
        }
    }
}

