*****************************************************************************

// created at : 3/24/2023
// problem : Power of Two 



*****************************************************************************

class Solution {
    
    public boolean isPowerOfTwo(int input_size) {

    long i = 1;


    while(i < input_size){

        i*=2;
    }

    return i == input_size;
}

}