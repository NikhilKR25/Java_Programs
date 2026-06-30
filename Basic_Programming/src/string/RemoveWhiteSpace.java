package string;

public class RemoveWhiteSpace {

    public static void main(String[] args) {

        String str = "  Java    is\tAwesome \nProgramming Language ";

//      \\s is a regular expression (RegEx) that matches any whitespace character.
        String result = str.replaceAll("\\s", "");

        System.out.println("Original String : " + str);
        System.out.println("After Removing Whitespace : " + result);
    }
}
// to remove only white space 
//	String result = str.replace(" ", "");