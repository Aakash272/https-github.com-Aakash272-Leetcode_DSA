/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int helper(TreeNode root,int dept){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return dept;
        }
        int left=helper(root.left,dept+1);
        int right=helper(root.right,dept+1);
        return Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return helper(root,1);
    }
}