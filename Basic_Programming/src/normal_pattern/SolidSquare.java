package normal_pattern;

public class SolidSquare {
	
	public static void main(String[] args) 
	{
		System.out.println("Program Started..");
		
		int lines = 5;
		int starCount = 5;
		for(int i=1; i<=lines; i++)
		{
			for(int j=1; j<=starCount; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Program Ended");
	}
}