*****************************************************************************

// created at : 3/27/2023
// problem : Removing duplicate characters

*****************************************************************************

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {

    public static void main(String[] args) {
        System.out.println(removeDuplicate("rotator"));
    }

    
    private static String removeDuplicate(String str){

        Set<Character> set = new HashSet <> ();

        StringBuilder result = new StringBuilder();

        
        for(char c : str.toCharArray()){

               if(set.add(c)){
                
                    result.append(c);
               }
           
        }
        
        return result.toString();
    }
}