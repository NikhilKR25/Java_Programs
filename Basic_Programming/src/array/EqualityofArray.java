package array;

public class EqualityofArray {

	public static void main(String[] args) {
	        int[] arrayOne = {2, 5, 3, 7, 4};  
	        int[] arrayTwo = {2, 5, 1, 7, 4};
	          
	        boolean status = true;
	          
	        if(arrayOne.length == arrayTwo.length) //compare length
	        {
	            for (int i = 0; i < arrayOne.length; i++)
	            {
	                if(arrayOne[i] != arrayTwo[i]) //compare element
	                { status = false;
	                }
	            }
	        }
	        else{
	            status = false;
	            }
	          
	        if (status){
	            System.out.println("Two Arrays Are Equal");
	        }
	        else{
	            System.out.println("Two Arrays Are Not equal");
	        }
	}

}
