/**
 * Single Number
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * @link https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a^=nums[i];
        }
        return a;
    }
}