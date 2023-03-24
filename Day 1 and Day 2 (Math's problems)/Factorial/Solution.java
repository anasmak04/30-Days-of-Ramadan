*****************************************************************************

// created at : 3/23/2023
// problem : factorial number 


*****************************************************************************

class HelloWorld {

    public static void main(String[] args) {

        System.out.println(fibonacci(5)); // 120
        System.out.println(fibonacci(9)); // 362880
        System.out.println(fibonacci(3)); // 6

    }
    
    public static int fibonacci(int input_size){

        if(input_size <= 0) return n;

        int fib = 1;

        for(int i = 1 ; i <= input_size ; i++){

            fib *=i;
        }
        
        return fib;
        
        
    }

}