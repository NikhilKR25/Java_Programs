package normal_pattern;

public class PyramidTriangle {
	public static void main(String[] args) {
		
		int rows = 5;
		int spaceCount = rows -1;
		int starCount = 1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=spaceCount; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=starCount; k++)	{
				System.out.print("*");
			}
				spaceCount--;	
				starCount+=2;	
				System.out.println();
		}
	}
}
