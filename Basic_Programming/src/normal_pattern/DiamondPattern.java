package normal_pattern;

public class DiamondPattern {
	public static void main(String[] args) 
	{
		// Total number of rows
	    int rows = 7;                 
	    int starCount = 1;  
	    // Initial spaces = 2 for 7 rows
	    int spaceCount = rows / 2;    

	    // Find the middle line
	    int mid = (rows + 1) / 2;

	    // Loop through each row
	    for (int i = 1; i <= rows; i++)
	    {
	        // Print spaces before the stars
	        for (int j = 1; j <= spaceCount; j++)
	        {
	            System.out.print(" ");
	        }

	        // Print stars
	        for (int k = 1; k <= starCount; k++)
	        {
	            System.out.print("*");
	        }
	       
	        System.out.println();

	        if (i < mid)
	        {
	            // Decrease spaces by 1 & Increase stars by 2
	            spaceCount--;
	            starCount += 2;
	        }
	        else
	        {
	            // After the middle, increase spaces by 1 & Decrease stars by 2
	            spaceCount++;
	            starCount -= 2;
	        }
	    }
	}
}
