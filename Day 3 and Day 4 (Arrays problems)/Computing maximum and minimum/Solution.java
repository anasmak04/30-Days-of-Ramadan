*****************************************************************************

// created at : 3/24/2023
// problem : Computing maximum and minimum



*****************************************************************************

import java.util.*;

class HelloWorld {
    
    public static void main(String[] args) {
        int[] array = {5,2,1,4,8,9,6,9,500,7};
      max(array);
    }
    
public static void maxmin(int[] arr){
    int max = arr[0];
      int min = arr[0];
    
    for(int elem : arr){
        if(elem > max){
            max = elem;
        }
        
        else if(elem < min){
            min = elem;
        }
    }
    System.out.println(min + " " + max);
}
    
}