package normal_pattern;

public class ButterflyTriangle {
	    public static void main(String[] args) {

	        int rows = 7;

	        int starCount = 1;
	        int spaceCount = rows - 1;
	     // Middle line 
	        int mid = (rows + 1) / 2;

			for (int i = 1; i <= rows; i++) {

				// Left stars
				for (int j = 1; j <= starCount; j++) {
					System.out.print("*");
				}

				// Middle spaces
				for (int j = 1; j <= spaceCount; j++) {
					System.out.print(" ");
				}

				// Right stars
				for (int j = 1; j <= starCount; j++) {
					System.out.print("*");
				}

				System.out.println();

				// Change star and space count
				if (i < mid) {
					// Before middle
					starCount++;
					spaceCount -= 2;
				} else {
					// After middle
					starCount--;
					spaceCount += 2;
				}
        }
    }
}
/*
*      *
**    **
***  ***
********
***  ***
**    **
*      *
 
 **/
