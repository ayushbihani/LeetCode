/** 
 * Two Sum
 * @link  https://leetcode.com/problems/two-sum/
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        int[] temp = nums.clone();
        int low = 0;
        int high = nums.length-1;
        Arrays.sort(nums);
        while(low<high){
            int sum = nums[low]+nums[high];
            if(sum>target)
                high--;
            if(sum<target)
                low++;
            if(sum == target){
                index[0]=nums[low];
                index[1]=nums[high];
                break;
            }
        }
        low=high=-1;
        for(int i= 0;i<temp.length;i++){
        if(index[0]==temp[i]&&low==-1){
            low=i;
        }
        else if(index[1]==temp[i]&&high==-1){
            high=i;
    }
        }
          index[0]=low;
          index[1]=high;
        return index;
    }
}