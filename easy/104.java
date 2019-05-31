/**
 * Max Depth of binary tree
 * @link https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */


class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int ldepth = maxDepth(root.left);
        int rdepth = maxDepth(root.right);
        if(ldepth>rdepth)
            return ldepth+1;
        return rdepth+1;
    }
}