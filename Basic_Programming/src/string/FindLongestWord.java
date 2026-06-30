package string;

public class FindLongestWord {

    public static void main(String[] args) {

        String sentence="Java is an object oriented programming language";

        String longest="";

        for(String word:sentence.split(" ")){
            if(word.length()>longest.length())
                longest=word;
        }

        System.out.println("Longest Word in sentence is :"+longest);
    }
}