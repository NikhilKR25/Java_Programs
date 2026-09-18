package normal_pattern;

public class HollowDiamond {
	public static void main(String[] args)
	{
	    int rows = 7;

	    int starCount = 1;
	    int spaceCount = rows / 2;
	    // Middle line of diamond
	    int mid = (rows + 1) / 2;

	    for (int i = 1; i <= rows; i++)
	    {
	        // Print spaces before the pattern
	        for (int j = 1; j <= spaceCount; j++)
	        {
	            System.out.print(" ");
	        }

	        // Print stars and inner spaces
	        if (starCount == 1)
	        {
	            // First and last line → only one star
	            System.out.print("*");
	        }
	        else
	        {
	            // First star
	            System.out.print("*");

	            // Inner spaces
	            for (int k = 1; k <= starCount - 2; k++)
	            {
	                System.out.print(" ");
	            }
	            // Last star
	            System.out.print("*");
	        }
	        System.out.println();

	        // Change star and space count
	        if (i < mid)
	        {
	            // Before middle → increase width
	            spaceCount--;
	            starCount += 2;
	        }
	        else
	        {
	            // After middle → decrease width
	            spaceCount++;
	            starCount -= 2;
	        }
	    }
	}
}
