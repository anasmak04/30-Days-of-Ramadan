*****************************************************************************

// created at : 3/23/2023
// problem : fibonacci sequence 

// Find the fibonacci sequence for n number

*****************************************************************************



class HelloWorld {
    
    public static void main(String[] args) {
        
          int N = 10;
 
        for (int i = 0; i < N; i++)

            System.out.print(fibonacci(i) + " ");
            
    }    

     public static int fibonacci(int input_size){

      int[] fib = {0,1};

      for(int i = 2 ; i <= input_size ; i++){

          fib[i] = fib[i-1] + fib[i - 2];

      }
     
      return fib[n];
      
        
        
    }

    }
    
