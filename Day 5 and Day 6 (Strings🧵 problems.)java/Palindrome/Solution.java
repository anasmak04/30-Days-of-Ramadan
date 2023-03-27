*****************************************************************************

// created at : 3/27/2023
// problem : Palindrome

*****************************************************************************
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("rotator"));
    }
    
    private static boolean isPalindrome(String str){

       int left = 0;
       int right = str.length() - 1;

       
       while(left < right){

           if(str.charAt(left) != str.charAt(right)){
            
               return false;
           }
           
           left++;
           right--;
       }
       
       return true;
    }
}