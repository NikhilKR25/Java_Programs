package normal_pattern;

public class PyramidTriangle {
	public static void main(String[] args) {
		
		int rows = 5;
		int spaceCount = rows -1;
		int starCount = 1;
		// Outer loop controls the rows
		for(int i=1; i<=rows; i++)
		{
			 // Inner loop prints stars and spaces
			for(int j=1; j<=spaceCount; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=starCount; k++)	{
				System.out.print("*");
			}
				spaceCount--;	// spaceCount decreases by 1
				starCount+=2;	// starCount increases by 2
				System.out.println();
		}
	}
}
/*
    *
   ***
  *****
 *******
*********
 */