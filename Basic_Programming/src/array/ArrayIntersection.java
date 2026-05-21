package array;

import java.util.HashSet;
// By Comparing Both String Print Common Words
public class ArrayIntersection {

	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX"};  
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT"};
  
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE, SIX]
    }
}
