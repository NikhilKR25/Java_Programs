package string;

public class CharRoration {

	public static void main(String[] args) {
		String str = "MYNAME";
		char[] ch =  str.toCharArray();
		//convert string into a sequence of characters
		for(int i=0; i<= ch.length-1; i++)
		{
			int index = i;
			
			for(int j=0; j<=ch.length-1; j++)
			{
				 // Print the character at the current index
				System.out.print(ch[index]);
				index++;
				  // If index reaches the end of the array,then start again 0
				index = index % ch.length;
			}
			System.out.println();
		}
	}

}
