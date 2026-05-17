package array;

public class CreateArray {
// There are three main ways to create an array in Java
	public static void main(String[] args) {
// 1st Way
		int[] rollno; // Declaration!
		rollno = new int[7]; // Memory allocation!
		System.out.println(rollno.length+"\n");
// 2nd Way
		int[] id = new int[5]; // Declaration + Memory allocation!
		id[0] = 10;
		id[1] = 20;
		id[2] = 30;
		id[3] = 40;
		id[4] = 50;
		System.out.println(id[2]+"\n");
// 3rd Way
		int[] marks = { 100, 70, 80, 55, 71, 98 }; // Declare +memory allocation and Initialize!

		System.out.println(marks[0]);
		System.out.println(marks[3]);
		System.out.println("-----------");

		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " \n"); // Array Traversal
		}
		System.out.println("Reverse Order Array..");
		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.print(marks[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Using for each loops");
		for (int element : id) // data_type TempVariable: Array name
		{
			System.out.println(element);
		}
	}

}
