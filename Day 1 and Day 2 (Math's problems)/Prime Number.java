*****************************************************************************

// created at : 3/23/2023
// problem : fibonacci sequence 

// Give a natural number n determine if number prime or not 

*****************************************************************************

class HelloWorld {
    public static void main(String[] args) {
        
    
    System.out.println(isPrime(5));
            
    }    

     public static boolean isPrime(int n){
        
     if(n < 2) return false;
     
     for(int i = 2 ; i <= n ; i++){

         if(n % 2 != 0)

         return true;
             
     }
     
     return false;
      
        
        
    }

    }
    
