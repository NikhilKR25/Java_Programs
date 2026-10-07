package logical_programs;
//Swap values without using a third variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Swap logic
        a = a + b;
        b = a - b;
        a = a - b;

        // Print the swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
