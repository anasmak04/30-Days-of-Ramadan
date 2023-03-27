*****************************************************************************

// created at : 3/27/2023
// problem : Removing white spaces from a string


*****************************************************************************

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static void main(String[] args) {

        System.out.println(RemoveWhiteSpaces("heey cooders"));

    }
    
    private static String RemoveWhiteSpaces(String str){

        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){

            if(!Character.isWhitespace(c)){
                
                result.append(c);
            }
            
        }
        
        return result.toString();
    }
}