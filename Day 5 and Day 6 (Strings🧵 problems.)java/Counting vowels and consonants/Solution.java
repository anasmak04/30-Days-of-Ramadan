*****************************************************************************

// created at : 3/27/2023
// problem : Counting vowels and consonants


*****************************************************************************

import java.util.*;

class HelloWorld {


    public static void main(String[] args) {

    countingVowelsConsontants("cooders hello");
        
    }
    
    

        
public static void countingVowelsConsontants(String str) {
         Set <Character> AllVowels = new HashSet <> (

        Arrays.asList('a','e','i','o','u'));
        
            int vowels = 0;

            int consantants = 0;

            str = str.toLowerCase();

            
        for(char c : str.toCharArray()){

            if(AllVowels.contains(c)){

                vowels++;
            }
            
            else if(!AllVowels.contains(c)){

                consantants++;
            }
        }
        
    System.out.println("vowels : " + vowels + " consantants "+ consantants);

    
    
}
    
    
}