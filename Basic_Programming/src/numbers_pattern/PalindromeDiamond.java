package numbers_pattern;
public class PalindromeDiamond {

    public static void main(String[] args) {

        int rows = 5;
        // Upper half portion
        for (int i = 1; i <= rows; i++) {
        	
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        // Lower half portion
        for (int i = rows - 1; i >= 1; i--) {

            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}