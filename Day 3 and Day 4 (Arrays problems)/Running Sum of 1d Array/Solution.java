****************************************************************************

// created at : 3/26/2023
// problem : sum of 1d array


*****************************************************************************


class Solution {
    public int[] runningSum(int[] nums) {

        List <Integer> list = new ArrayList <> ();
        
        for(int x : nums){
            list.add(x);
        }

        int i = 1;

        
        while(i < list.size()){
        
            nums[i] = nums[i] +  nums[i - 1];
        
            i++; 
        }

        return nums;
    }
}