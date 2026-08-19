package string;

public class FindLongestWord {

    public static void main(String[] args) {
    	// Store the sentence in a String variable
        String sentence="Java is an object oriented programming language";

        String longest="";

        // Split the sentence into individual words and loop through each word
        for(String word:sentence.split(" ")){
        	// Check if the current word is longer than the previously, 
            if(word.length()>longest.length())
            	// If it is longer, update the longest word
                longest=word;
        }
        //	Print the longest word 
        System.out.println("Longest Word in sentence is :"+longest);
    }
}