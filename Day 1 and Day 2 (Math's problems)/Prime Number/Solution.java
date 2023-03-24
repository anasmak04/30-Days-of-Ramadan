*****************************************************************************

// created at : 3/23/2023
// problem : fibonacci sequence 


*****************************************************************************

class HelloWorld {
    public static void main(String[] args) {
        
    
    System.out.println(isPrime(5));
            
    }    

     public static boolean isPrime(int input_size){
        
     if(input_size < 2) return false;
     
     for(int i = 2 ; i <= input_size ; i++){

         if(input_size % 2 != 0)

         return true;
             
     }
     
     return false;
      
        
        
    }

    }
    
