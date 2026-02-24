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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null){
            return 0;
        }
        String res=" ";
       return  dfs(root,res);
    }
    public int dfs(TreeNode root,String res){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            res+=root.val;
           int a=Integer.parseInt(res.trim(),2);
           return a;
        }
       int left= dfs(root.left,res+String.valueOf(root.val));
       int right=dfs(root.right,res+String.valueOf(root.val));

return left+right;
    }
}