*****************************************************************************

// created at : 3/27/2023
// problem : Concatenating the same string n times


*****************************************************************************
import java.util.*;

class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println(concatRepeat("hello",5));
    }
    
public static String concatRepeat(String str, int input_size) {

  StringBuilder sb = new StringBuilder(str.length() * input_size);

  for (int i = 1; i <= input_size; i++) {
    sb.append(str);
  }

  return sb.toString();
}
    
}