*****************************************************************************

// created at : 3/24/2023
// problem : Contains duplicate


*****************************************************************************

class Solution {

    public boolean containsDuplicate(int[] nums) {

            Set <Integer> set = new HashSet <> ();

            for(int i : nums){
                
                if(set.contains(i)){
                    return true;
                }

                   set.add(i);

                
            }

            return false;
    }
}