/**
 * Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */


class Solution {
    public void rotate(int[] nums, int k) {
        if(k%nums.length==0){
            print(nums);
            return;
        }
        int index = 0;
        k=k%nums.length;
        while(k>0){
            for(int i = nums.length-k-1;i>=index;i--){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
            index++;
            k--;
        }
    }
    public void print(int[] nums){
        for(int i =0;i<nums.length;i++)
            System.out.println(nums[i]);
    }
}