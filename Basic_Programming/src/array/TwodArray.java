package array;


public class TwodArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		 int demo1[]; //1-D array 
		 int demp2[][]; //2-D array 
		 String[][][] demo3; //3-D array
		 
		 int [][] flats = new int [3][4]; //3 rows and 4 column
		 
	        flats[0][0] = 101;
	        flats[0][1] = 102;
	        flats[0][2] = 103;
	        flats[0][3] = 104;
	        flats[1][0] = 201;
	        flats[1][1] = 202;
	        flats[1][2] = 203;
	        flats[1][3] = 204;
	        flats[2][0] = 301;
	        flats[2][1] = 302;
	        flats[2][2] = 303;
	        flats[2][3] = 304;

	        System.out.println("Printing a 2-D array using for loop");
	        
	        for (int i = 0; i < flats.length; i++) {
				for (int j = 0; j <= flats.length; j++) {
					System.out.print(flats[i][j]+" ");
				}
				System.out.println();
			}
	        System.out.println("---------------------");
	        int [][] array = new int [3][3];
	        
//	        we can initialize value using for loop
	        int temp = 10;
	       for (int i = 0; i < array.length; i++) {
	    	   for (int j = 0; j < array.length; j++) {
				array[i][j] = temp;
				temp += 10;
				}
	    	  }
	       System.out.println("Printing values of for loop assingments");
	       for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
