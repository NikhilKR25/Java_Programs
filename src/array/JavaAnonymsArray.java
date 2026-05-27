package array;
//in Java anonymous array, you don't need to declare the array while passing an array to the method.
public class JavaAnonymsArray {
	static void methodAnonyms(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) 
	{
		//	passing anonymous array to method
		JavaAnonymsArray.methodAnonyms(new int []{11,22,33,44,55});
	}

}
