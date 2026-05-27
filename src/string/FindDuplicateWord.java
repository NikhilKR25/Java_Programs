package string;
//find duplicate words and non-repeated word and display count of words

public class FindDuplicateWord {
    public static void main(String[] args) {    
        String string = "on Big black bug a big dog on his black nose";
        int count;
            
        //Split the string into words using built-in function    
        String[] words = string.split(" ");
        int totalWords = words.length;
        
        System.out.println("Total Words in String :"+totalWords);
        boolean[] check = new boolean[words.length];
            
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            if(!check[i]) {
            	count = 1;    
                for(int j = i+1; j < words.length; j++) {    
                    if(words[i].equalsIgnoreCase(words[j])) {    
                        count++;    
                       check[j] = true;
                    }
                }
                    
                //Displays the duplicate word if count is greater than 1    
                if(count > 1) {
                    System.out.println(words[i]+" : "+count); 
                }
                else {
                	System.out.println(words[i]+" : "+count); 
    			}
            }
        }
    }
}
// !check[i] is same as check[i]=true