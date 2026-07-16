package numbers_pattern;

public class InvertedTriangle {

	public static void main(String[] args) {
		int rows = 4;
		int number = 1;
		// outer loop
		for (int i = rows; i >= 1; i--) {
			// Inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;	// increment value
			}
			System.out.println();
		}
	}
}
/*
 1 2 3 4 
5 6 7 
8 9 
10 
*/