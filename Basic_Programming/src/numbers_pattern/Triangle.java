package numbers_pattern;
//	Floyd’s Triangle 
public class Triangle {
	
	public static void main(String[] args) {
		int rows = 4;
		int number = 1;
		//	outer loop
		for (int i = 1; i <= rows; i++) 
		{
			//	inner loop
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(number + " ");
				number++; // Increment value after inner loop execute
			}
			System.out.println();
		}
	}
}