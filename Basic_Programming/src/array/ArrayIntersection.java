package array;

import java.util.HashSet;
// By Comparing Both String Print Common Words
public class ArrayIntersection {

	public static void main(String[] args) {
		
		// Declaring String Array
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX"};  
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT"};
        
        // Hashset for common elements
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                //	check if elements of both arrays
            	if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE, SIX]
    }
}
