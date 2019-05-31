

/**
 * Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length
 * 
 * Example 1:

    Given nums = [1,1,2],

    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

    It doesn't matter what you leave beyond the returned length. 
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int fp = 0;
        if(nums.length == 1)
            return 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == nums[fp]){
                continue;
            } else {
                nums[++fp] = nums[i];
            }
        }
        return fp+1;
    }
}