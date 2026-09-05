package numbers_pattern;
//	Palindrome Diamond Number Pattern
public class PalindromeDiamond {

    public static void main(String[] args) {

        int rows = 5;
        // Upper half portion
        for (int i = 1; i <= rows; i++) {
        	
            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        // Lower half portion
        for (int i = rows - 1; i >= 1; i--) {

            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}