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
         List<String> res=new ArrayList<>();
StringBuilder ap=new StringBuilder();
    public void helper(TreeNode root){
        if(root==null){
            return ;
        }
       int len = ap.length();

        if (ap.length() == 0) {
            ap.append(root.val);
        } else {
            ap.append("->").append(root.val);
        }

        if (root.left == null && root.right == null) {
            res.add(ap.toString());
        }

        helper(root.left);
        helper(root.right);

        ap.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root);
        return res;
    }
}