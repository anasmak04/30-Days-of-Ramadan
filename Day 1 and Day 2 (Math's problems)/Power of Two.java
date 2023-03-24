*****************************************************************************

// created at : 3/24/2023
// problem : Power of Two 

// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

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