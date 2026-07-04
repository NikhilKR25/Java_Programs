package logical_programs;

public class FibonacciSequence {

	 // Prints Fibonacci sequence up to the given count
	public static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
			// Generate the next Fibonacci number
			a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci Sequence : ");
		printFibonacciSequence(9);
	}

}