*****************************************************************************

// created at : 3/24/2023
// problem : largest element in array


*****************************************************************************


class Solution {

    public static int Largest_elemnt(int[] array) {

      List <Integer> list = new ArrayList <> ();

      for(int i : array) list.add(i);

      Collections.sort(list);

      return list.get(list.size() - 1);

    }
    
       
    
}