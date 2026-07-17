package numbers_pattern;

public class PascalTriangle {
	
	public static void main(String[] args) {
		int rows = 5;

		for (int i = 0; i < rows; i++) 
		{
			// First value in every row is 1
			int num = 1;

			// Print leading spaces to align
			for (int s = 1; s <= rows - i; s++)
			{
				System.out.print(" ");
			}
			// Print the numbers in the current row
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(num + " ");
				 // Next Value = Current Value × (Row - Column) ÷ (Column + 1)
				num = num * (i - j) / (j + 1);
			}
			 // Move to the next line after completing row
			System.out.println();
		}
	}
}

/*
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
 */