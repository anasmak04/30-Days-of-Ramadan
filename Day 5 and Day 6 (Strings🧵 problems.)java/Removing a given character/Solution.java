*****************************************************************************

// created at : 3/27/2023
// problem : Removing a given character

*****************************************************************************

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {
    
    public static void main(String[] args) {

        System.out.println(removeChracter("Anas",'n'));
    }
    
    private static String removeChracter(String str, char s){
        
        StringBuilder result = new StringBuilder();
        
        for(char c : str.toCharArray()){
            if(!(s == c)){
                result.append(c);
            }
        }
        
        return result.toString();
    }
}