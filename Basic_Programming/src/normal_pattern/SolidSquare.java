package normal_pattern;

public class SolidSquare {
	
	public static void main(String[] args) 
	{
		System.out.println("Program Started..");
		//	numbers of rows and stars
		int lines = 5;
		int starCount = 5;
		//	outer loop for number of rows
		for(int i=1; i<=lines; i++)
		{
			//	inner loop for numbers of stars
			for(int j=1; j<=starCount; j++)
			{
				System.out.print("*"); // print stars on the same line
			}
			System.out.println();
		}
		System.out.println("Program Ended");
	}
}
/*
*****
*****
*****
*****
*/