*****************************************************************************

// created at : 3/27/2023
// problem :Finding the character with the most appearances

*****************************************************************************

import java.util.*;

class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println(maxOccurenceCharacter("Anas"));
    }
    
    private static char maxOccurenceCharacter(String str){
        str = str.toLowerCase();
        
        Map<Character,Integer> map = new LinkedHashMap <> ();
        
        for(char c : str.toCharArray()){

            if(!Character.isWhitespace(c)){

                if(map.get(c) == null){
                    map.put(c,1);
                }
                
                else {

                    map.put(c,map.get(c) + 1);

                }  
                
                }
        }
        
       int MaxValueInMap = Collections.max(map.values());
       
       for(char a : map.keySet()){
           if(map.get(a) == MaxValueInMap){
               return a;
           }
       }
       
       return 0;

    }
}