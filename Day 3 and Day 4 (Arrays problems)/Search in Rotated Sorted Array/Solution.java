*****************************************************************************

// created at : 3/24/2023
// problem : Search in Rotated Sorted Array


*****************************************************************************
class Solution {

    public int search(int[] nums, int target) {

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == target){

                return i;
            }
        }

        return -1;
    }
}