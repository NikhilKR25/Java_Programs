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
				System.out.print(ch[index]);
				index++;
				index = index %6;
			}
			System.out.println();
		}
	}

}
