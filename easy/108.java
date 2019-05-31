/** 
 * Convert Sorted Array to Binary Search Tree
 * @link https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
*/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root =helper(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode helper(int[] arr,int low, int high){
        if(low>high)
            return null;
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(arr,low,mid-1);
        node.right = helper(arr,mid+1,high);
        return node;
    }
}