package normal_pattern;

public class ReversePyramid {
	public static void main(String[] args) {
		
		int rows = 4;
		int spaceCount = 0;
		// For rows, maximum stars will be 7
		int starCount = rows * 2 - 1;
		
		// Outer loop controls the rows
		for (int i = 1; i <= rows; i++) 
		{
			 // Inner loop prints stars and spaces
		    for (int j = 1; j <= spaceCount; j++) {
		        System.out.print(" ");
		    }

		    for (int k = 1; k <= starCount; k++) {
		        System.out.print("*");
		    }

		    spaceCount++;	// starCount increases by 1
		    starCount -= 2;	// spaceCount decreases by 2

		    System.out.println();
		}
	}
}
